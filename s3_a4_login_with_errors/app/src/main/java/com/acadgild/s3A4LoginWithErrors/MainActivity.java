package com.acadgild.s3A4LoginWithErrors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.acadgild.s3A4LoginWithErrors.R;

public class MainActivity extends AppCompatActivity{

    EditText email, password;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);

        loginButton = (Button) findViewById(R.id.loginButton);
    }

    public void validateForNullValues(View v){

        if(email.getText().length() != 0 && password.getText().length() != 0)
            Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
        else {
            if (email.getText().length() == 0)
                email.setError("This field cannot be left empty");
            if (password.getText().length() == 0)
                password.setError("This field cannot be left empty");
        }

    }
}
