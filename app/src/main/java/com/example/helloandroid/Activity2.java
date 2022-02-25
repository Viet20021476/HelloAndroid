package com.example.helloandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import CheckInput.CheckInputForm2;
import UtilP.Util;

public class Activity2 extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form2);

        Button btn = findViewById(R.id.btn);
        EditText et1 = findViewById(R.id.et1);
        EditText et2 = findViewById(R.id.et2);
        EditText et3 = findViewById(R.id.et3);
        EditText et4 = findViewById(R.id.et4);
        EditText et5 = findViewById(R.id.et5);

        TextView tv1 = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);
        TextView tv3 = findViewById(R.id.tv3);
        TextView tv4 = findViewById(R.id.tv4);
        TextView tv5 = findViewById(R.id.tv5);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber = et1.getText().toString();
                String email = et2.getText().toString();
                String name = et3.getText().toString();
                String workPlace = et4.getText().toString();
                String password = et5.getText().toString();

                boolean flag1 = true;
                boolean flag2 = true;
                boolean flag3 = true;
                boolean flag4 = true;
                boolean flag5 = true;

                if (!CheckInputForm2.checkPhoneNumber(phoneNumber)) {
                    et1.setBackgroundResource(R.drawable.round_edit_text_2);
                    Util.animation(tv1);
                    flag1 = false;

                }
                if (!CheckInputForm2.checkEmail(email)) {
                    et2.setBackgroundResource(R.drawable.round_edit_text_2);
                    Util.animation(tv2);
                    flag2 = false;
                }

                if (!CheckInputForm2.checkName(name)) {
                    et3.setBackgroundResource(R.drawable.round_edit_text_2);
                    Util.animation(tv3);
                    flag3 = false;
                }

                if (!CheckInputForm2.checkWorkPlace(workPlace)) {
                    et4.setBackgroundResource(R.drawable.round_edit_text_2);
                    Util.animation(tv4);
                    flag4 = false;
                }

                if (!CheckInputForm2.checkPassWord(password)) {
                    et5.setBackgroundResource(R.drawable.round_edit_text_2);
                    Util.animation(tv5);
                    flag5 = false;
                }

                if (flag1) et1.setBackgroundResource(R.drawable.round_edit_text);
                if (flag2) et2.setBackgroundResource(R.drawable.round_edit_text);
                if (flag3) et3.setBackgroundResource(R.drawable.round_edit_text);
                if (flag4) et4.setBackgroundResource(R.drawable.round_edit_text);
                if (flag5) et5.setBackgroundResource(R.drawable.round_edit_text);

                if (flag1 && flag2 && flag3 && flag4 && flag5) {
                    Intent intent = new Intent(Activity2.this, Activity3.class);
                    startActivity(intent);
                }
            }
        });
    }
}
