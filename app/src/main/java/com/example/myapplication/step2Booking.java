package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class step2Booking extends AppCompatActivity {
    TextView step2_gender, step2_sisakamar, step2_namakost, step2_alamatkost, step2_deskripsiKost;
    ImageButton step2_Bookingbutton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step2_booking);

        Step1Booking step1 = new Step1Booking();
        step2_Bookingbutton = findViewById(R.id.step2_Bookingbutton);
        step2_gender =  findViewById(R.id.step2_gender);
        step2_sisakamar = findViewById(R.id.step2_sisakamar);
        step2_namakost = findViewById(R.id.step2_namakost);
        step2_alamatkost = findViewById(R.id.step2_alamatkost);
        step2_deskripsiKost = findViewById(R.id.step2_deskripsiKost);

        String namaKost = step1.getName1();
        String gender = step1.getgenderKost1();
        String sisakamar =  step1.getsisaKamarKost1();
        step2_alamatkost.setText("Lowokwaru");
        step2_deskripsiKost.setText("Kost Pelita Indah merupakan kost eksklusif berlokasi di \n" +
                "Lowokwaru Malang. Kamar kost ekslusif dilengkapi dengan \n" +
                "fasilitas lengkap untuk memenuhi kebutuhan dan \n" +
                "kenyamanan penghuni kost.\n");
        step2_namakost.setText(namaKost);
        step2_gender.setText(gender);
        step2_sisakamar.setText(sisakamar);

        step2_Bookingbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(step2Booking.this, step3Booking.class));
            }
        });

    }
}