package com.stevenenriquez.anagramgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Challenge2 extends AppCompatActivity {

    Button L1, L2, L3, L4, L5, L6, clearBtn, submitBtn, nextBtn, prevBtn, listBtn;

    TextView Chal2_textView, Answer_textView;

    Boolean L1UsedFlag = false, L2UsedFlag = false, L3UsedFlag = false,
            L4UsedFlag = false, L5UsedFlag = false, L6UsedFlag = false;

    String Chal2_Answer = "GALAXY";

    Boolean CompletedFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge2);

        L1 = findViewById(R.id.Chal2_L1);
        L2 = findViewById(R.id.Chal2_L2);
        L3 = findViewById(R.id.Chal2_L3);
        L4 = findViewById(R.id.Chal2_L4);
        L5 = findViewById(R.id.Chal2_L5);
        L6 = findViewById(R.id.Chal2_L6);
        clearBtn = findViewById(R.id.Chal2_clearBtn);
        submitBtn = findViewById(R.id.Chal2_submitBtn);
        nextBtn = findViewById(R.id.Chal2_nextBtn);
        prevBtn = findViewById(R.id.Chal2_prevBtn);
        listBtn = findViewById(R.id.Chal2_listBtn);
        Chal2_textView = findViewById(R.id.Chal2_textView);
        Answer_textView = findViewById(R.id.Answer_textView);

        L1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.buttonSoundPlayer.start();
                Answer_textView.setText("");
                if(!L1UsedFlag)
                {
                    String tempString = Chal2_textView.getText() + "A";
                    Chal2_textView.setText(tempString);
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
                    String tempString = Chal2_textView.getText() + "A";
                    Chal2_textView.setText(tempString);
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
                    String tempString = Chal2_textView.getText() + "L";
                    Chal2_textView.setText(tempString);
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
                    String tempString = Chal2_textView.getText() + "Y";
                    Chal2_textView.setText(tempString);
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
                    String tempString = Chal2_textView.getText() + "X";
                    Chal2_textView.setText(tempString);
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
                    String tempString = Chal2_textView.getText() + "G";
                    Chal2_textView.setText(tempString);
                    L6UsedFlag = true;
                }
            }
        });

        submitBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.buttonSoundPlayer.start();
                String tempString = Chal2_textView.getText().toString();
                String correct = "Correct!";
                String incorrect = "Incorrect!";
                if(tempString.equals(Chal2_Answer))
                {
                    CompletedFlag = true;
                    Answer_textView.setText(correct);
                }
                else
                {
                    Chal2_textView.setText("");
                    Answer_textView.setText(incorrect);
                    L1UsedFlag = false;
                    L2UsedFlag = false;
                    L3UsedFlag = false;
                    L4UsedFlag = false;
                    L5UsedFlag = false;
                    L6UsedFlag = false;
                }
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.buttonSoundPlayer.start();
                Chal2_textView.setText("");
                Answer_textView.setText("");
                L1UsedFlag = false;
                L2UsedFlag = false;
                L3UsedFlag = false;
                L4UsedFlag = false;
                L5UsedFlag = false;
                L6UsedFlag = false;
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.buttonSoundPlayer.start();
                openNextActivity();
            }
        });

        prevBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.buttonSoundPlayer.start();
                openPrevActivity();
            }
        });

        listBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                MainActivity.buttonSoundPlayer.start();
                openChallengeListActivity();
            }
        });
    }
    public void openNextActivity()
    {
        Intent intent = new Intent(this, Challenge3.class);
        startActivity(intent);
    }

    public void openPrevActivity()
    {
        Intent intent = new Intent(this, Challenge1.class);
        startActivity(intent);
    }

    public void openChallengeListActivity()
    {
        Intent intent = new Intent(this, ChallengeList.class);
        startActivity(intent);
    }
}
