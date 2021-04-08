package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class Register extends AppCompatActivity {
    private TextInputEditText registerNama;
    private TextInputEditText registerEmail;
    private TextInputEditText registerTelepon;
    private TextInputEditText registerPassword;
    private Button registerSignUp;
    private RadioButton radioLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();
        setContentView(R.layout.activity_register);

        registerNama = findViewById(R.id.register_nama);
        registerEmail = findViewById(R.id.register_email);
        registerTelepon = findViewById(R.id.register_telepon);
        registerPassword = findViewById(R.id.register_password);
        registerSignUp = (Button) findViewById(R.id.register_button);
        radioLogin = findViewById(R.id.radio_login);

        registerSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String registernama = registerNama.getText().toString();
                String registeremail = registerEmail.getText().toString();
                String registertelepon = registerTelepon.getText().toString();
                String registerpassword = registerPassword.getText().toString();

              if (registeremail.equals("dewik@gmail.com") && registernama.equals("dewik") && registerpassword.equalsIgnoreCase("dewik123") && registertelepon.equals("083848382315")) {
                  AlertDialog.Builder warning = new AlertDialog.Builder(Register.this);
                  warning.setMessage("Pendaftaran Berhasil").setNegativeButton("Ok", null).create().show();
              }

              else {
                  AlertDialog.Builder warning = new AlertDialog.Builder(Register.this);
                  warning.setMessage("Input yang anda masukkan tidak lengkap atau tidak sesuai").setNegativeButton("Retry", null).create().show();
              }
            }
        });
        radioLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Register.this, MainActivity.class));
            }
        });
    }
}