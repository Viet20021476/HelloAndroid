package com.example.helloandroid;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckInputForm1{
    public boolean checkAccount(String s) {
        Pattern pattern1 = Pattern.compile("^[a-zA-Z0-9]{6,}$");
        Pattern pattern2 = Pattern.compile("^[^ ]$");
        Matcher matcher1 = pattern1.matcher(s);
        Matcher matcher2 = pattern1.matcher(s);

        return matcher1.matches() && matcher2.matches();
    }

    public boolean checkPassWord(String s) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9!@#$%^&*]{8,}$");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}
