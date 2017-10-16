package com.phacsin.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText email_edittext,password_edittext;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email_edittext = (EditText) findViewById(R.id.email_edittext);
        password_edittext = (EditText) findViewById(R.id.password_edittext);
        submit = (Button) findViewById(R.id.btn_submit);
    }

    public void clickButton(View view) {
        String email = email_edittext.getText().toString();
        String password = password_edittext.getText().toString();
        //Email & Password Validation
        if(!Verifier.isValidEmail(email))
            email_edittext.setError("Invalid Email");
        else if(!Verifier.isValidPassword(password))
            password_edittext.setError("Invalid Password");

        else {
            // Creating an Intent for the new Activity
            Intent intent = new Intent(this, MainActivity.class);
            // Passing our variables to the intent
            intent.putExtra(Constants.EMAIL_KEY, email);
            intent.putExtra(Constants.PASSWORD_KEY, password);
            // Starting the activity mentioned
            startActivity(intent);
        }
    }
}
