package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class booking_step1 extends AppCompatActivity {
    private ImageButton pilihankost1, pilihankost2, pilihankost3, pilihankost4;
    private TextView namakost, gender, sisakamar, harga;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.booking_step1);
        pilihankost1 = findViewById(R.id.pilihankost1);
        pilihankost2 = findViewById(R.id.pilihankost2);
        pilihankost3 = findViewById(R.id.pilihankost3);
        pilihankost4 = findViewById(R.id.pilihankost4);

        pilihankost1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                namakost.setText("Kost Pelita Indah");
                gender.setText("Wanita");
                sisakamar.setText("2 kamar tersisa");
                harga.setText("Rp 1.100.000/bulan");

                startActivity(new Intent(booking_step1.this, Homepage.class));

                //(TO  BE CONTINUED);
                // DALAM PROSES PEMBENAHAN



            }
        });


    }
}
