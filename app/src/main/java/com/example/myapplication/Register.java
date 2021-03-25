package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    private EditText registerNama;
    private EditText registerEmail;
    private EditText registerTelepon;
    private EditText registerPassword;
    private Button registerSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerNama = findViewById(R.id.REGISTER_NAMA);
        registerEmail = findViewById(R.id.REGISTER_EMAIL);
        registerTelepon = findViewById(R.id.REGISTER_TELEPON);
        registerPassword = findViewById(R.id.REGISTER_PASSWORD);
        registerSignUp = (Button) findViewById(R.id.TOMBOL_SIGNUP);

        registerSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String registernama = registerNama.getText().toString();
                String registeremail = registerEmail.getText().toString();
                String registertelepon = registerTelepon.getText().toString();
                String registerpassword = registerPassword.getText().toString();

              if (registeremail != null && registernama != null && registerPassword != null && registertelepon != null){
                startActivity(new Intent(Register.this, Homepage.class));
            }

            }
        });
    }
}