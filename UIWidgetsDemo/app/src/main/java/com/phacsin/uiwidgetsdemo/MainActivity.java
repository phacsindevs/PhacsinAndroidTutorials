package com.phacsin.uiwidgetsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email_edittext,password_edittext;
    Button submit;
    final static String LOG_KEY = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect the views from the layout to the variables
        email_edittext = (EditText) findViewById(R.id.email_edittext);
        password_edittext = (EditText) findViewById(R.id.password_edittext);
        submit = (Button) findViewById(R.id.btn_submit);
    }

    // This method is invoked when button in layout is clicked
    public void clickButton(View view) {
        // Retrieve the email and password from the edittext
        String email = email_edittext.getText().toString();
        String password = password_edittext.getText().toString();

        // Log the details to the ADB permanently
        Log.d(LOG_KEY,email + " " + password);

        // Display a Toast Notification
        Toast.makeText(getApplicationContext(),email + " " + password,Toast.LENGTH_LONG).show();
    }
}
