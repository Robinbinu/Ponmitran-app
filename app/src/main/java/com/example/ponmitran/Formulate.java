package com.example.ponmitran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Formulate extends AppCompatActivity {



    private SeekBar seekBar;
    private Spinner weightSpinner;
    private TextView capacityTextView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulate);


        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Formulate.this, "Loading...", Toast.LENGTH_SHORT).show();
                // Perform additional actions or tasks here
            }
        });

        weightSpinner = findViewById(R.id.weightSpinner);

        // Create an array of weight options from 0 to 600 kg
        String[] weightOptions = new String[601];
        for (int i = 0; i <= 600; i++) {
            weightOptions[i] = String.valueOf(i) + " kg";
        }

        // Create an ArrayAdapter and set it as the Spinner's adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, weightOptions);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        weightSpinner.setAdapter(adapter);

        seekBar = findViewById(R.id.seekBar);
        capacityTextView = findViewById(R.id.capacityTextView);

        seekBar.setMax(5); // Set the maximum value of the SeekBar

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int selectedCapacity = progress * 4; // Calculate the selected capacity
                capacityTextView.setText("Milk Capacity: " + selectedCapacity + " ltrs");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Empty method body
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Empty method body
            }
        });
        weightSpinner.setPrompt("Select weight");
    }


}