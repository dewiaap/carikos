package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Step1Booking extends AppCompatActivity {

    ImageButton PilihanKost1,PilihanKost2,PilihanKost3,PilihanKost4, buttonBackBooking;
    TextView namaKost1,genderKost1,sisaKamarKost1, HargaKost1;
    String[] namaKostt =  {"Kost Mantap,Kost LuarBiasa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step1_booking);

        PilihanKost1 = findViewById(R.id.pilihankost1);
        buttonBackBooking = findViewById(R.id.step1_booking);
        namaKost1 = findViewById(R.id.namakost1);
        genderKost1 = findViewById(R.id.genderkost1);
        sisaKamarKost1 = findViewById(R.id.sisakamarkost1);
        HargaKost1 = findViewById(R.id.HargaKost1);

        buttonBackBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Step1Booking.this, beforeBooking.class));
            }
        });

        PilihanKost1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Step1Booking.this, step2Booking.class));
            }
        });

    }
}