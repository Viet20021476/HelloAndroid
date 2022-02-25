package com.example.helloandroid;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import UtilP.Util;

public class Activity3 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form3);

        EditText edt1 = findViewById(R.id.edt1);
        EditText edt2 = findViewById(R.id.edt2);
        TextView tvv = findViewById(R.id.tvv);
        TextView tvf3 = findViewById(R.id.tvf3);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(edt1.getText().toString());
                double n2 = Double.parseDouble(edt2.getText().toString());
                tvv.setText(String.valueOf(n1 + n2));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(edt1.getText().toString());
                double n2 = Double.parseDouble(edt2.getText().toString());
                tvv.setText(String.valueOf(n1 - n2));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(edt1.getText().toString());
                double n2 = Double.parseDouble(edt2.getText().toString());
                tvv.setText(String.valueOf(n1 * n2));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(edt1.getText().toString());
                double n2 = Double.parseDouble(edt2.getText().toString());
                if (n2 != 0) {
                    tvv.setText(String.valueOf(n1 / n2));
                } else {
                    tvv.setText("");
                    Util.animation(tvf3);
                }
            }
        });


    }
}
