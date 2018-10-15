package com.stevenenriquez.anagramgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    TextView ch1_results, ch2_results, ch3_results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        ch1_results = findViewById(R.id.ch1_results);
        ch2_results = findViewById(R.id.ch2_results);
        ch3_results = findViewById(R.id.ch3_results);
    }
}
