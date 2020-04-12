package com.example.first_partial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView name = findViewById(R.id.name);
        Button button1 = findViewById(R.id.enter);

        button1.setOnClickListener((v)->{
            Intent changeActivity = new Intent(this, Questions.class);
            startActivity(changeActivity);

        });
    }
}
