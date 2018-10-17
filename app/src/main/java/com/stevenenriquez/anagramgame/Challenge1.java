/*
File: Challenge1.java
Author: Steven Enriquez
*/

package com.stevenenriquez.anagramgame;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Challenge1 extends AppCompatActivity {

    Button L1, L2, L3, L4, L5, L6, clearBtn, submitBtn, skipBtn, stopBtn;

    TextView Chal1_textView, Answer_textView, timer_textView;

    Boolean L1UsedFlag = false, L2UsedFlag = false, L3UsedFlag = false,
            L4UsedFlag = false, L5UsedFlag = false, L6UsedFlag = false;

    String Chal1_Answer = "APPLES";

    public static Boolean Chal1CompletedFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge1);

        L1 = findViewById(R.id.Chal1_L1);
        L2 = findViewById(R.id.Chal1_L2);
        L3 = findViewById(R.id.Chal1_L3);
        L4 = findViewById(R.id.Chal1_L4);
        L5 = findViewById(R.id.Chal1_L5);
        L6 = findViewById(R.id.Chal1_L6);
        clearBtn = findViewById(R.id.Chal1_clearBtn);
        submitBtn = findViewById(R.id.Chal1_submitBtn);
        skipBtn = findViewById(R.id.Chal1_skipBtn);
        stopBtn = findViewById(R.id.Chal1_stopBtn);
        Chal1_textView = findViewById(R.id.Chal1_textView);
        Answer_textView = findViewById(R.id.Answer_textView);
        timer_textView = findViewById(R.id.timer_textView);

        // timer will run for 5 minutes
        CountingUpTimer timer = new CountingUpTimer(300000) {
            public void onTick(int second) {
                timer_textView.setText("Time: " + String.valueOf(second));
            }
        };
        // start the timer
        timer.start();


        L1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.buttonSoundPlayer.start();
                Answer_textView.setText("");
                if(!L1UsedFlag)
                {
                    String tempString = Chal1_textView.getText() + "P";
                    Chal1_textView.setText(tempString);
                    L1UsedFlag = true;
                }
            }
        });

        L2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.buttonSoundPlayer.start();
                Answer_textView.setText("");
                if(!L2UsedFlag)
                {
                    String tempString = Chal1_textView.getText() + "S";
                    Chal1_textView.setText(tempString);
                    L2UsedFlag = true;
                }
            }
        });

        L3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.buttonSoundPlayer.start();
                Answer_textView.setText("");
                if(!L3UsedFlag)
                {
                    String tempString = Chal1_textView.getText() + "P";
                    Chal1_textView.setText(tempString);
                    L3UsedFlag = true;
                }
            }
        });

        L4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.buttonSoundPlayer.start();
                Answer_textView.setText("");
                if(!L4UsedFlag)
                {
                    String tempString = Chal1_textView.getText() + "A";
                    Chal1_textView.setText(tempString);
                    L4UsedFlag = true;
                }
            }
        });

        L5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.buttonSoundPlayer.start();
                Answer_textView.setText("");
                if(!L5UsedFlag)
                {
                    String tempString = Chal1_textView.getText() + "E";
                    Chal1_textView.setText(tempString);
                    L5UsedFlag = true;
                }
            }
        });

        L6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.buttonSoundPlayer.start();
                Answer_textView.setText("");
                if(!L6UsedFlag)
                {
                    String tempString = Chal1_textView.getText() + "L";
                    Chal1_textView.setText(tempString);
                    L6UsedFlag = true;
                }
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.buttonSoundPlayer.start();
                Chal1_textView.setText("");
                Answer_textView.setText("");
                // sets all the letters to an unused state
                L1UsedFlag = false;
                L2UsedFlag = false;
                L3UsedFlag = false;
                L4UsedFlag = false;
                L5UsedFlag = false;
                L6UsedFlag = false;
            }
        });

        submitBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.buttonSoundPlayer.start();
                String tempString = Chal1_textView.getText().toString();
                String correct = "Correct!";
                String incorrect = "Incorrect!";
                if(tempString.equals(Chal1_Answer))
                {
                    Chal1CompletedFlag = true;
                    Answer_textView.setText(correct);
                    openNextActivity();
                }
                else
                {
                    Chal1_textView.setText("");
                    Answer_textView.setText(incorrect);
                    // sets all the letters to an unused state
                    L1UsedFlag = false;
                    L2UsedFlag = false;
                    L3UsedFlag = false;
                    L4UsedFlag = false;
                    L5UsedFlag = false;
                    L6UsedFlag = false;
                }
            }
        });
        // calls function to open activity
        skipBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.buttonSoundPlayer.start();
                openNextActivity();
            }
        });
        // calls function to open activity
        stopBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.buttonSoundPlayer.start();
                openChallengeListActivity();
            }
        });
    }
    // opens activity
    public void openNextActivity()
    {
        Intent intent = new Intent(this, Challenge2.class);
        startActivity(intent);
    }
    // opens activity
    public void openChallengeListActivity()
    {
        Intent intent = new Intent(this, ChallengeList.class);
        startActivity(intent);
    }

    // creates a time and gets it ready to start counting
    public abstract class CountingUpTimer extends CountDownTimer
    {
        private static final long MILISECONDS = 1000;

        private final long duration;

        protected CountingUpTimer(long msDuration)
        {
            super(msDuration, MILISECONDS);
            this.duration = msDuration;
        }

        public abstract void onTick(int sec);

        // callback fired on regular interval
        @Override
        public void onTick(long millisUntilFinished)
        {
            int sec = (int) ((duration - millisUntilFinished) / 1000);
            onTick(sec);
        }
        // callback fired when the time is up
        @Override
        public void onFinish()
        {
            onTick(duration / 1000);
        }
    }
}
