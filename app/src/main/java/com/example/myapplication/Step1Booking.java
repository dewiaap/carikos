package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Step1Booking extends AppCompatActivity {

    ImageButton PilihanKost1,PilihanKost2,PilihanKost3,PilihanKost4, buttonBackBooking;
    TextView namaKost1,namaKost2,namaKost3,namaKost4, genderKost1,genderKost2,genderKost3,genderKost4,
            sisaKamarKost1,sisaKamarKost2,sisaKamarKost3,sisaKamarKost4, HargaKost1,HargaKost2,HargaKost3,HargaKost4;

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

        namaKost1.setText("Kost Pelita Indah".toString());
        genderKost1.setText("Wanita".toString());
        sisaKamarKost1.setText("2 kamar tersisa".toString());
        HargaKost1.setText("Rp 1.100.000/bulan".toString());

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