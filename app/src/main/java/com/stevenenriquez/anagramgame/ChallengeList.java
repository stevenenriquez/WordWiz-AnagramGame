/*
File: ChallengeList.java
Author: Steven Enriquez
*/

package com.stevenenriquez.anagramgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ChallengeList extends AppCompatActivity {

    Button Challenge1, Challenge2, Challenge3, Results;

    ImageButton muteButtonChal;

    boolean muteFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_list);

        Challenge1 = findViewById(R.id.Challenge1);
        Challenge2 = findViewById(R.id.Challenge2);
        Challenge3 = findViewById(R.id.Challenge3);
        Results = findViewById(R.id.resultsBtn);
        muteButtonChal = findViewById(R.id.muteButtonChal);
        // calls function to open activity
        Challenge1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.buttonSoundPlayer.start();
                openChallenge1Activity();
            }
        });

        Challenge2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.buttonSoundPlayer.start();
                //openChallenge2Activity();
            }
        });

        Challenge3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.buttonSoundPlayer.start();
                //openChallenge3Activity();
            }
        });
        // calls function to open activity
        Results.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.buttonSoundPlayer.start();
                openResultsActivity();
            }
        });

        muteButtonChal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.buttonSoundPlayer.start();
                if(!muteFlag)
                {
                    // mutes game's background music
                    MainActivity.mainMusicPlayer.setVolume(0,0);
                    muteFlag = true;
                }
                else
                {
                    // un-mutes game's background music
                    MainActivity.mainMusicPlayer.setVolume(0,1);
                    muteFlag = false;
                }
            }
        });
    }
    // opens activity
    public void openChallenge1Activity()
    {
        Intent intent = new Intent(this, Challenge1.class);
        startActivity(intent);
    }
    // opens activity
    public void openResultsActivity()
    {
        Intent intent = new Intent(this, Results.class);
        startActivity(intent);
    }
    // opens activity
    public void openChallenge2Activity()
    {
        Intent intent = new Intent(this, Challenge2.class);
        startActivity(intent);
    }
    // opens activity
    public void openChallenge3Activity()
    {
        Intent intent = new Intent(this, Challenge3.class);
        startActivity(intent);
    }
}
