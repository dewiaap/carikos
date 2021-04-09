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
        namaKost1 = findViewById(R.id.namakost1);   namaKost1.setText("Kost Pelita Indah".toString());
        genderKost1 = findViewById(R.id.genderkost1);   genderKost1.setText("Wanita".toString());
        sisaKamarKost1 = findViewById(R.id.sisakamarkost1); sisaKamarKost1.setText("2 kamar tersisa".toString());
        HargaKost1 = findViewById(R.id.HargaKost1);     HargaKost1.setText("Rp 1.100.000/bulan".toString());
        PilihanKost2 = findViewById(R.id.pilihankost2);
        namaKost2 = findViewById(R.id.namakost2);   namaKost2.setText("Kost Indah".toString());
        genderKost2 = findViewById(R.id.genderkost2);     genderKost2.setText("Wanita".toString());
        sisaKamarKost2 = findViewById(R.id.sisakamarkost2);     sisaKamarKost2.setText("5 kamar tersisa".toString());
        HargaKost2 = findViewById(R.id.HargaKost2);     HargaKost2.setText("Rp 1.300.000/bulan".toString());
        PilihanKost3 = findViewById(R.id.pilihankost3);
        namaKost3 = findViewById(R.id.namakost3);   namaKost3.setText("Kost Permata Sari".toString());
        genderKost3 = findViewById(R.id.genderkost3);  genderKost3.setText("Wanita".toString());
        sisaKamarKost3 = findViewById(R.id.sisakamarkost3);      sisaKamarKost3.setText("7 kamar tersisa".toString());
        HargaKost3 = findViewById(R.id.HargaKost3);      HargaKost3.setText("Rp 1.100.000/bulan".toString());
        PilihanKost4 = findViewById(R.id.pilihankost4);
        namaKost4 = findViewById(R.id.namakost4);   namaKost4.setText("Kost Sejati".toString());
        genderKost4 = findViewById(R.id.genderkost4);    genderKost1.setText("Wanita".toString());
        sisaKamarKost4 = findViewById(R.id.sisakamarkost4);    sisaKamarKost4.setText("10 kamar tersisa".toString());
        HargaKost4 = findViewById(R.id.HargaKost4);      HargaKost4.setText("Rp 1.000.000/bulan".toString());





        getSupportActionBar().setTitle("Booking");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        PilihanKost1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Step1Booking.this, step2Booking.class));
            }
        });

    }
    public String getName1(){
        String oke = "Kost Pelita Indah";
        return oke;
    }
    public String getgenderKost1(){
        String oke = "Wanita";
        return oke;
    }
    public String getsisaKamarKost1(){
        String oke = "2 kamar tersisa";
        return oke;
    }
    public String getHargaKost1(){
        String oke = "Rp 1.100.000/bulan";
        return oke;
    }
    // kost 2
    public String getName2(){
        String oke = "Kost Indah";
        return oke;
    }
    public String getgenderKost2(){
        String oke = "Wanita";
        return oke;
    }
    public String getsisaKamarKost2(){
        String oke = "5 kamar tersisa";
        return oke;
    }
    public String getHargaKost2(){
        String oke = "Rp 1.300.000/bulan";
        return oke;
    }
    // kost 3
    public String getName3(){
        String oke = "Kost Permata Sari";
        return oke;
    }
    public String getgenderKost3(){
        String oke = "Wanita";
        return oke;
    }
    public String getsisaKamarKost3(){
        String oke = "7 kamar tersisa";
        return oke;
    }
    public String getHargaKost3(){
        String oke = "Rp 1.100.000/bulan";
        return oke;
    }

    // kost 4
    public String getName4(){
        String oke = "Kost Sejati";
        return oke;
    }
    public String getgenderKost4(){
        String oke = "Wanita";
        return oke;
    }
    public String getsisaKamarKost4(){
        String oke = "10 kamar tersisa";
        return oke;
    }
    public String getHargaKost4(){
        String oke = "Rp 1.000.000/bulan";
        return oke;
    }

}