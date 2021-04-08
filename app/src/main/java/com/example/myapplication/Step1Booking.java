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
    public String getName1(){
        String oke = "Kost Pelita Indah";
        return oke;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step1_booking);

        PilihanKost1 = findViewById(R.id.pilihankost1);
        namaKost1 = findViewById(R.id.namakost1);   namaKost1.setText("Kost Pelita Indah".toString());
        genderKost1 = findViewById(R.id.genderkost1);   genderKost1.setText("Wanita".toString());
        sisaKamarKost1 = findViewById(R.id.sisakamarkost1); sisaKamarKost1.setText("2 kamar tersisa".toString());
        HargaKost1 = findViewById(R.id.HargaKost1);     HargaKost1.setText("Rp 1.100.000/bulan".toString());
        PilihanKost2 = findViewById(R.id.pilihankost2);
        namaKost2 = findViewById(R.id.namakost2);   namaKost2.setText("Kost Pelita Indah".toString());
        genderKost2 = findViewById(R.id.genderkost2);   sisaKamarKost2.setText("2 kamar tersisa".toString());
        sisaKamarKost2 = findViewById(R.id.sisakamarkost2);     HargaKost2.setText("Rp 1.100.000/bulan".toString());
        HargaKost2 = findViewById(R.id.HargaKost2);     HargaKost2.setText("Rp 1.100.000/bulan".toString());
        PilihanKost3 = findViewById(R.id.pilihankost3);
        namaKost3 = findViewById(R.id.namakost3);   namaKost3.setText("Kost Pelita Indah".toString());
        genderKost3 = findViewById(R.id.genderkost3);   sisaKamarKost3.setText("2 kamar tersisa".toString());
        sisaKamarKost3 = findViewById(R.id.sisakamarkost3);     HargaKost3.setText("Rp 1.100.000/bulan".toString());
        HargaKost3 = findViewById(R.id.HargaKost3);     HargaKost3.setText("Rp 1.100.000/bulan".toString());
        PilihanKost4 = findViewById(R.id.pilihankost4);
        namaKost4 = findViewById(R.id.namakost4);   namaKost4.setText("Kost Pelita Indah".toString());
        genderKost4 = findViewById(R.id.genderkost4);   sisaKamarKost4.setText("2 kamar tersisa".toString());
        sisaKamarKost4 = findViewById(R.id.sisakamarkost4);     HargaKost4.setText("Rp 1.100.000/bulan".toString());
        HargaKost4 = findViewById(R.id.HargaKost4);     HargaKost4.setText("Rp 1.100.000/bulan".toString());





        getSupportActionBar().setTitle("Booking");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        PilihanKost1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Step1Booking.this, step2Booking.class));
            }
        });

    }
}