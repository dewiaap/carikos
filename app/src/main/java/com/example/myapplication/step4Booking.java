package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.myapplication.R.id.namakost3;
import static com.example.myapplication.R.id.pilihankost1;

public class step4Booking extends AppCompatActivity {

    TextView step4_namakost;
    TextView step4_genderkost;
    TextView step4_superharga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step4_booking);

        getSupportActionBar().setTitle("Booking");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Step1Booking Step1 = new Step1Booking();

        step4_namakost = findViewById(R.id.step4_namakost);
        step4_genderkost = findViewById(R.id.step4_genderkost);
        step4_superharga = findViewById(R.id.step4_superharga);

        String getName1 = Step1.getName1();
        step4_namakost.setText(getName1);
        String getGender1 = Step1.getgenderKost1();
        step4_genderkost.setText(getGender1);
        String getHarga1 = Step1.getHargaKost1();
        step4_superharga.setText(getHarga1);




    }
}