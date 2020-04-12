package com.example.first_partial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        TextView score = findViewById(R.id.score);
        Button playagain = findViewById(R.id.playagain);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        int points = bundle.getInt("points");
        score.setText(points+" / 5");

        playagain.setOnClickListener((v)->{
            Intent changeActivity = new Intent(this, MainActivity.class);
            startActivity(changeActivity);
        });
    }
}
