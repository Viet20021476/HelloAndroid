package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.TooltipCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    CheckInputForm1 checkInput = new CheckInputForm1();

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
                if (!checkInput.checkAccount(account)) {
                    et1.setBackgroundResource(R.drawable.round_edit_text_2);
                    animation(tvfw1);
                    flag1 = false;

                }
                if (!checkInput.checkPassWord(password1)) {
                    et2.setBackgroundResource(R.drawable.round_edit_text_2);
                    animation(tvfw2);
                    flag2 = false;
                }
                if (!password1.equals(password2)) {
                    et3.setBackgroundResource(R.drawable.round_edit_text_2);
                    animation(tvfw3);
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

    public void animation(TextView tv) {
        AlphaAnimation dis = new AlphaAnimation(1.0f, 0.0f);
        tv.startAnimation(dis);
        dis.setDuration(2000);

    }


}