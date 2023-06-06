package com.example.ponmitran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class menu1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        ImageButton rrc = findViewById(R.id.rrc_button);
        rrc.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(),menu2.class);
            startActivity(i);
        });

        ImageButton fyr = findViewById(R.id.fyr_button);
        fyr.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(),Formulate.class);
            startActivity(i);
        });

    }
}