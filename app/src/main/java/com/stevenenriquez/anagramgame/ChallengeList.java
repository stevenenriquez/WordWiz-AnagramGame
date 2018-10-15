package com.stevenenriquez.anagramgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ChallengeList extends AppCompatActivity {

    Button Challenge1, Challenge2, Challenge3;

    ImageButton muteButtonChal;

    boolean muteFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_list);

        Challenge1 = findViewById(R.id.Challenge1);
        Challenge2 = findViewById(R.id.Challenge2);
        Challenge3 = findViewById(R.id.Challenge3);
        muteButtonChal = findViewById(R.id.muteButtonChal);

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
                openChallenge2Activity();
            }
        });

        Challenge3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.buttonSoundPlayer.start();
                openChallenge3Activity();
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
                    MainActivity.mainMusicPlayer.setVolume(0,0);
                    muteFlag = true;
                }
                else
                {
                    MainActivity.mainMusicPlayer.setVolume(0,1);
                    muteFlag = false;
                }
            }
        });
    }

    public void openChallenge1Activity()
    {
        Intent intent = new Intent(this, Challenge1.class);
        startActivity(intent);
    }

    public void openChallenge2Activity()
    {
        Intent intent = new Intent(this, Challenge2.class);
        startActivity(intent);
    }

    public void openChallenge3Activity()
    {
        Intent intent = new Intent(this, Challenge3.class);
        startActivity(intent);
    }
}
