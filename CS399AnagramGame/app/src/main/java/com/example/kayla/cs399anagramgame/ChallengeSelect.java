package com.example.kayla.cs399anagramgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class ChallengeSelect extends AppCompatActivity {

    private Button mainMenuButton;
    private Button easyButton;
    private Button mediumButton;
    private Button hardButton;
    private Button extremeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_select);

        mainMenuButton = (Button) findViewById(R.id.mainMenu);
        easyButton = (Button) findViewById(R.id.easyButton);
        mediumButton = (Button) findViewById(R.id.mediumButton);
        hardButton = (Button) findViewById(R.id.hardButton);
        extremeButton = (Button) findViewById(R.id.extremeButton);

        mainMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchMainActivity();
            }
        });
        easyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchPlayActivity();
            }
        });
        mediumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchPlayActivity();
            }
        });
        hardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchPlayActivity();
            }
        });
        extremeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchPlayActivity();
            }
        });
    }
    private void launchMainActivity() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void launchPlayActivity() {
        Intent intent = new Intent(this, Play.class);
        startActivity(intent);
    }
}
