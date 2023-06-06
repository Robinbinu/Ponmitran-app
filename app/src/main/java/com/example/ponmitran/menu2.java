package com.example.ponmitran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageButton;

public class menu2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
        ImageButton cow = findViewById(R.id.cowbutton);
        ImageButton buffalo = findViewById(R.id.bufbutton);
        ImageButton goat = findViewById(R.id.goatbutton);
        ImageButton sheep = findViewById(R.id.sheepbutton);
        ImageButton pig = findViewById(R.id.pigbutton);
        ImageButton chick = findViewById(R.id.chickbutton);
        final MediaPlayer cowmp = MediaPlayer.create(this, R.raw.moo);
        final MediaPlayer bufmp = MediaPlayer.create(this,R.raw.buffalo);
        final MediaPlayer goatmp = MediaPlayer.create(this,R.raw.goat);
        final MediaPlayer sheepmp = MediaPlayer.create(this,R.raw.sheep);
        final MediaPlayer pigmp= MediaPlayer.create(this,R.raw.pig);
        final MediaPlayer chickmp = MediaPlayer.create(this,R.raw.chicken);

        cow.setOnClickListener(view -> {
            cowmp.start();
            Intent i = new Intent(getApplicationContext(), menu1.class);
            startActivity(i);

        });
        buffalo.setOnClickListener(view -> {
            bufmp.start();
        });
        goat.setOnClickListener(view -> {
            goatmp.start();
        });
        sheep.setOnClickListener(view -> {
            sheepmp.start();
        });
        pig.setOnClickListener(view -> {
            pigmp.start();
        });
        chick.setOnClickListener(view -> {
            chickmp.start();
        });
    }
}