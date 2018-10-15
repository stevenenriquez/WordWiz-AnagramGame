package com.stevenenriquez.anagramgame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton playButton, resultsButton, muteButton;

    Button creditsButton;

    View view;

    boolean muteFlag = false;

    protected static MediaPlayer mainMusicPlayer;
    protected static MediaPlayer buttonSoundPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = findViewById(R.id.playButton);
        resultsButton = findViewById(R.id.menuButton);
        muteButton = findViewById(R.id.muteButton);
        creditsButton = findViewById(R.id.creditsButton);

        mainMusicPlayer = MediaPlayer.create(this, R.raw.bgmusic);
        buttonSoundPlayer = MediaPlayer.create(this, R.raw.btnpress);
        mainMusicPlayer.setLooping(true);
        mainMusicPlayer.start();

        playButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                buttonSoundPlayer.start();
                openChallengeListActivity();
            }
        });

        resultsButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                buttonSoundPlayer.start();
                openResultsActivity();
            }
        });

        muteButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                buttonSoundPlayer.start();
                if(!muteFlag)
                {
                    mainMusicPlayer.setVolume(0,0);
                    muteFlag = true;
                }
                else
                {
                    mainMusicPlayer.setVolume(0,1);
                    muteFlag = false;
                }
            }
        });

        creditsButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                buttonSoundPlayer.start();
                openCreditsActivity();
            }
        });
    }

    public void onBackPressed() {
        // do nothing on back press
    }

    public void openCreditsActivity()
    {
        mainMusicPlayer.release();
        Intent intent = new Intent(this, Credits.class);
        startActivity(intent);
    }

    public void openChallengeListActivity()
    {
        Intent intent = new Intent(this, ChallengeList.class);
        startActivity(intent);
    }

    public void openResultsActivity()
    {
        Intent intent = new Intent(this, Results.class);
        startActivity(intent);
    }
}
