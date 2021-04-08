package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class step4Booking extends AppCompatActivity {

    TextView step4_namakost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step4_booking);
        Step1Booking Step1 = new Step1Booking();

        step4_namakost = findViewById(R.id.step4_namakost);

        String getName1 = Step1.getName1();
        step4_namakost.setText(getName1);

    }
}