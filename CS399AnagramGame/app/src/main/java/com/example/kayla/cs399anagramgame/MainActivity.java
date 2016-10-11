package com.example.kayla.cs399anagramgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button start;
    private Button about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.startButton);
        about = (Button) findViewById(R.id.aboutButton);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchChallengeSelectActivity();
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchAboutActivity();
            }
        });
    }
    private void launchChallengeSelectActivity() {

        Intent intent = new Intent(this, ChallengeSelect.class);
        startActivity(intent);
    }

    private void launchAboutActivity() {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }
}
