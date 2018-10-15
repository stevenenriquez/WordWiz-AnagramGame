package com.stevenenriquez.anagramgame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Credits extends AppCompatActivity {

    MediaPlayer creditsPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        creditsPlayer = MediaPlayer.create(this, R.raw.creditsmusic);
        creditsPlayer.setLooping(true);
        creditsPlayer.start();
    }

    public void onBackPressed()
    {
        creditsPlayer.release();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
