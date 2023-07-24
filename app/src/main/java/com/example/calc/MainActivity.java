package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText enum1, enum2, eoperand, eanswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enum1 = findViewById(R.id.enum1);
        enum2 = findViewById(R.id.enum2);
        eoperand = findViewById(R.id.eoperand);
        eanswer = findViewById(R.id.eanswer);

        Button mult = findViewById(R.id.mult);
        Button div = findViewById(R.id.div);
        Button sub = findViewById(R.id.sub);
        Button add = findViewById(R.id.add);
        Button refresh = findViewById(R.id.refresh);

        Button btn0 = findViewById(R.id.btn0);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button equal = findViewById(R.id.equal);



        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = enum1.getText().toString();
                String num2Str = enum2.getText().toString();
                String operand = eoperand.getText().toString();

                if (!num1Str.isEmpty() && !num2Str.isEmpty() && !operand.isEmpty()) {
                    double num1 = Double.parseDouble(num1Str);
                    double num2 = Double.parseDouble(num2Str);
                    double result = 0.0;

                    switch (operand) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            if (num2 != 0) {
                                result = num1 / num2;
                            } else {
                                // Division by zero error
                                eanswer.setText("Error");
                                return;
                            }
                            break;
                        default:
                            // Invalid operand
                            eanswer.setText("Error");
                            return;
                    }

                    eanswer.setText(String.valueOf(result));
                }
            }
        });


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendToEditText(enum1, "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendToEditText(enum1, "1" );

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendToEditText(enum1, "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendToEditText(enum1, "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendToEditText(enum1, "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendToEditText(enum1, "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendToEditText(enum1, "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendToEditText(enum1, "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendToEditText(enum1, "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendToEditText(enum1, "9");
            }
        });



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eoperand.setText("+");
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eoperand.setText("-");
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eoperand.setText("*");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eoperand.setText("/");
            }
        });

        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enum1.setText("");
                enum2.setText("");
                eoperand.setText("");
                eanswer.setText("");
            }
        });
    }






    private void appendToEditText(EditText editText, String text) {
        String currentText = editText.getText().toString();
        editText.setText(currentText + text);
    }
}

