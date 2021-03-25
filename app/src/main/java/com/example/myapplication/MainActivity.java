package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button login;
    private Button loginToRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.login_username);
        password = findViewById(R.id.login_password);
        login = findViewById(R.id.login_button);
        loginToRegister = findViewById(R.id.login_toRegister);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = username.getText().toString();
                String pass = password.getText().toString();
               if(uname.equals("dewik")&& pass.equals("dewik123")){
                    startActivity(new Intent(MainActivity.this, Homepage.class));
               }
            }

        });

        loginToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Register.class));
            }
        });

    }
}