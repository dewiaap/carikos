package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class step3Booking extends AppCompatActivity {
    TextView step3_namakost, step3_genderkost, step3_superharga, Step3_Bulan, Step3_Tanggal;
    ImageButton step3_ButtonBooking, Step3_buttonMinus, Step3_buttonPlus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step3_booking);

        Step1Booking step1 =  new Step1Booking();

        step3_ButtonBooking = findViewById(R.id.step3_ButtonBooking);
        step3_namakost = findViewById(R.id.step3_namakost);
        step3_genderkost = findViewById(R.id.step3_genderkost);
        step3_superharga = findViewById(R.id.step3_superharga);
        Step3_Bulan =  findViewById(R.id.Step3_Bulan);
        Step3_Tanggal = findViewById(R.id.Step3_Tanggal);
        Step3_buttonMinus = findViewById(R.id.Step3_buttonMinus);
        Step3_buttonPlus = findViewById(R.id.Step3_buttonPlus);

        String namaKost1 = step1.getName1();
        String gender1 = step1.getgenderKost1();
        String harga1 = step1.getHargaKost1();
        step3_namakost.setText(namaKost1);
        step3_genderkost.setText(gender1);
        step3_superharga.setText(harga1);
        Step3_Bulan.setText("2 Bulan");
        Step3_Tanggal.setText("10 April 2021");


        getSupportActionBar().setTitle("Booking");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        step3_ButtonBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(step3Booking.this, step4Booking.class));
            }
        });

        Step3_buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Step3_Bulan.setText("1 Bulan");
            }
        });
        Step3_buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Step3_Bulan.setText("3  Bulan");
            }
        });

    }
}