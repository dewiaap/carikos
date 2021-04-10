package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class Chat extends AppCompatActivity {
    RadioButton radioGroup, radioDirect, radioService;
    TextView namaKost, isiChat, waktu;
    ImageView kostPict;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        getSupportActionBar().setTitle("Chat");
        radioGroup = findViewById(R.id.radio_group);
        radioDirect = findViewById(R.id.radio_direct);
        radioService = findViewById(R.id.radio_service);
        namaKost = findViewById(R.id.namaKost);
        isiChat = findViewById(R.id.isichat);
        waktu = findViewById(R.id.waktu);
        kostPict = findViewById(R.id.kostpict);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        radioDirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                namaKost.setText("Kos Pelita Indah".toString());
                isiChat.setText("Maksimal 2 orang gan".toString());
                waktu.setText("12.59".toString());
                kostPict.setImageResource(R.drawable.profile_chat);
            }
        });
        radioGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                namaKost.setText("Kos Pelita Indah".toString());
                isiChat.setText("Indah : Maksimal 2 orang gan".toString());
                waktu.setText("20.34".toString());
                kostPict.setImageResource(R.drawable.chat_group);
            }
        });
        radioService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                namaKost.setText("Customer Service".toString());
                isiChat.setText("Terima kasih untuk sarannya".toString());
                waktu.setText("10.21".toString());
                kostPict.setImageResource(R.drawable.profile_chat);
            }
        });
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}