package com.example.helloandroid;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckInputForm2 {
    public boolean checkPhoneNumber(String s) {
        Pattern pattern = Pattern.compile("^[0-9]{10,}$");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public boolean checkEmail(String s) {
        Pattern pattern = Pattern.compile("^[a-zA-Z][a-zA-Z0-9]{3,10}@[a-zA-Z]+(.[a-zA-Z]+){1,3}$");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public boolean checkName(String s) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public boolean checkWorkPlace(String s) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public boolean checkPassWord(String s) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9!@#$%^&*]{8,}$");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}
