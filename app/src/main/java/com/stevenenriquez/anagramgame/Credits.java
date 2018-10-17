/*
File: Credits.java
Author: Steven Enriquez
*/

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

        // starts the credits background music
        creditsPlayer = MediaPlayer.create(this, R.raw.creditsmusic);
        // loop the background music
        creditsPlayer.setLooping(true);
        // starts the music
        creditsPlayer.start();
    }
    // when the back button on the phone is pressed
    public void onBackPressed()
    {
        // release credits background music for resources being used
        creditsPlayer.release();
        // open the home screen activity (main activity)
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
