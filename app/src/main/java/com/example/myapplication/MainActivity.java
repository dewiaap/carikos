 package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText emailInput;
    private TextInputEditText password;
    private Button login;
    private TextView loginToRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        emailInput = findViewById(R.id.login_email);
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
                startActivity(new Intent(MainActivity.this, Step1Booking.class));
            }
        });

    }
}