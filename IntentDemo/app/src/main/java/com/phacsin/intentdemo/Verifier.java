package com.phacsin.intentdemo;

/**
 * Created by sachin on 16/10/17.
 */

public class Verifier {

    public static boolean isValidEmail(String email) {
        if (email.equals("")) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
        }
    }

    public static boolean isValidPassword(String password) {
        if (password.equals("")) {
            return false;
        } else {
            return  password.length()>=4;
        }
    }
}
