package com.phacsin.intentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String email,password;
    TextView email_textview,password_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the values from the intent
        email = getIntent().getStringExtra(Constants.EMAIL_KEY);
        password = getIntent().getStringExtra(Constants.PASSWORD_KEY);

        email_textview = (TextView) findViewById(R.id.email_textview);
        password_textview = (TextView) findViewById(R.id.password_textview);

        //Set the values to the corresponding textviews
        email_textview.setText(email);
        password_textview.setText(password);
    }
}
