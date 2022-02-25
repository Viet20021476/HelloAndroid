package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import CheckInput.CheckInputForm1;
import UtilP.Util;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form1);

        Button btn = findViewById(R.id.btn);

        EditText et1 = findViewById(R.id.et1);
        EditText et2 = findViewById(R.id.et2);
        EditText et3 = findViewById(R.id.et3);

        TextView tvfw1 = findViewById(R.id.tvfw1);
        TextView tvfw2 = findViewById(R.id.tvfw2);
        TextView tvfw3 = findViewById(R.id.tvfw3);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String account = et1.getText().toString();
                String password1 = et2.getText().toString();
                String password2 = et3.getText().toString();
                boolean flag1 = true;
                boolean flag2 = true;
                boolean flag3 = true;
                if (!CheckInputForm1.checkAccount(account)) {
                    et1.setBackgroundResource(R.drawable.round_edit_text_2);
                    Util.animation(tvfw1);
                    flag1 = false;

                }
                if (!CheckInputForm1.checkPassWord(password1)) {
                    et2.setBackgroundResource(R.drawable.round_edit_text_2);
                    Util.animation(tvfw2);
                    flag2 = false;
                }
                if (!password1.equals(password2)) {
                    et3.setBackgroundResource(R.drawable.round_edit_text_2);
                    Util.animation(tvfw3);
                    flag3 = false;
                }
                if (flag1) et1.setBackgroundResource(R.drawable.round_edit_text);
                if (flag2) et2.setBackgroundResource(R.drawable.round_edit_text);
                if (flag3) et3.setBackgroundResource(R.drawable.round_edit_text);

                if (flag1 && flag2 && flag3) {
                    Intent intent = new Intent(MainActivity.this,Activity2.class);
                    startActivity(intent);
                }
            }
        });


    }
}