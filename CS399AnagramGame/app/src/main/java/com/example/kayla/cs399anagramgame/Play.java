package com.example.kayla.cs399anagramgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Play extends AppCompatActivity {

    private Button mainMenuButton;
    private Button nextWord;
    private Button endGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        mainMenuButton = (Button) findViewById(R.id.mainMenu);
        nextWord = (Button) findViewById(R.id.enterButton);
        endGame = (Button) findViewById(R.id.endChallengeButton);

        mainMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchMainActivity();
            }
        });
        nextWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchCorrectAnswerActivity();
            }
        });
        endGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchResultsActivity();
            }
        });
    }
    private void launchMainActivity() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void launchCorrectAnswerActivity() {
        Intent intent = new Intent(this, CorrectAnswer.class);
        startActivity(intent);
    }

    private void launchResultsActivity() {
        Intent intent = new Intent(this, Results.class);
        startActivity(intent);
    }
}
