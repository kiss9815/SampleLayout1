package com.example.tacademy.samplelayout1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GridActivity extends AppCompatActivity {

    EditText editText;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6,btn7,btn8,btn9,btn_cancel, btn_plus, btn_minus, btn_product, btn_equal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        editText = (EditText)findViewById(R.id.editText);

         btn0 = (Button)findViewById(R.id.button0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(btn0.getText().toString());
            }
        });

        btn1 = (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(btn1.getText().toString());
            }
        });

        btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(btn2.getText().toString());
            }
        });

        btn3 = (Button)findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(btn3.getText().toString());
            }
        });

        btn4 = (Button)findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(btn4.getText().toString());
            }
        });

        btn5 = (Button)findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(btn5.getText().toString());
            }
        });

        btn6 = (Button)findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(btn6.getText().toString());
            }
        });

        btn7 = (Button)findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(btn7.getText().toString());
            }
        });

        btn8 = (Button)findViewById(R.id.button8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(btn8.getText().toString());
            }
        });

        btn9 = (Button)findViewById(R.id.button9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(btn9.getText().toString());
            }
        });

        btn_cancel = (Button)findViewById(R.id.button_cancel);
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });

        btn_equal = (Button)findViewById(R.id.button_equal);
        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(btn_equal.getText().toString());
            }
        });

        btn_minus = (Button)findViewById(R.id.button_minus);
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(btn_minus.getText().toString());
            }
        });

        btn_plus = (Button)findViewById(R.id.button_plus);
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(btn_plus.getText().toString());
            }
        });

        btn_product = (Button)findViewById(R.id.button_product);
        btn_product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(btn_product.getText().toString());
            }
        });
    }
}
