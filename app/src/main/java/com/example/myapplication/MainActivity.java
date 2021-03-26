package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    private EditText emailInput;
    private EditText password;
    private Button login;
    private Button loginToRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        username = findViewById(R.id.login_username);
        emailInput = findViewById(R.id.login_emailInput);
        password = findViewById(R.id.login_password);
        login = findViewById(R.id.login_button);
        loginToRegister = findViewById(R.id.login_toRegister);

        login.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                String email = emailInput.getText().toString();
                String pass = password.getText().toString();
               if(email.equals("dewik@gmail.com")&& pass.equals("dewik123")){
                    startActivity(new Intent(MainActivity.this, Homepage.class));
                    finish();
               }
               else {
                    AlertDialog.Builder warning = new AlertDialog.Builder(MainActivity.this);
                    warning.setMessage("Input yang anda masukkan Salah").setNegativeButton("Retry", null).create().show();
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