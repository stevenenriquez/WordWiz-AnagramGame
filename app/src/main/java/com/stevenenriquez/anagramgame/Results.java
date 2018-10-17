/*
File: Results.java
Author: Steven Enriquez
*/

package com.stevenenriquez.anagramgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.stevenenriquez.anagramgame.Challenge1.Chal1CompletedFlag;
import static com.stevenenriquez.anagramgame.Challenge2.Chal2CompletedFlag;
import static com.stevenenriquez.anagramgame.Challenge3.Chal3CompletedFlag;

public class Results extends AppCompatActivity {

    public static TextView ch1_results, ch2_results, ch3_results;

    Button ChallengeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        ch1_results = findViewById(R.id.ch1_results);
        ch2_results = findViewById(R.id.ch2_results);
        ch3_results = findViewById(R.id.ch3_results);
        ChallengeBtn = findViewById(R.id.challengeBtn);

        // updates the text of each challenge to green if completed
        if(Chal1CompletedFlag)
        {
            ch1_results.setTextColor(getResources().getColor(R.color.green));
        }
        if(Chal2CompletedFlag)
        {
            ch2_results.setTextColor(getResources().getColor(R.color.green));
        }
        if(Chal3CompletedFlag)
        {
            ch3_results.setTextColor(getResources().getColor(R.color.green));
        }

        ChallengeBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.buttonSoundPlayer.start();
                openChallengeListActivity();
            }
        });
    }

    //
    public void openChallengeListActivity()
    {
        Intent intent = new Intent(this, ChallengeList.class);
        startActivity(intent);
    }
}
