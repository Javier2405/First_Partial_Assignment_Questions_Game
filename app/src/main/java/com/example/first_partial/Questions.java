package com.example.first_partial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class Questions extends AppCompatActivity {

    DBHelper db;
    GameController gc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        db = new DBHelper(getApplicationContext());
        gc = new GameController();

        TextView question = findViewById(R.id.question);

        Button answer1 = findViewById(R.id.answer1);
        Button answer2 = findViewById(R.id.answer2);
        Button answer3 = findViewById(R.id.answer3);
        Button answer4 = findViewById(R.id.answer4);

        db.setQuestions();
        Cursor questions = db.getQuestions();


        questions.moveToFirst();
        question.setText(questions.getString(questions.getColumnIndex("question")));
        answer1.setText(questions.getString(questions.getColumnIndex("answer1")));
        answer2.setText(questions.getString(questions.getColumnIndex("answer2")));
        answer3.setText(questions.getString(questions.getColumnIndex("answer3")));
        answer4.setText(questions.getString(questions.getColumnIndex("answer4")));
        gc.setCorrectAnswer(questions.getInt(questions.getColumnIndex("correctAnswer")));

        answer1.setOnClickListener((v)->{
            if(gc.getCorrectAnswer()==1){
                gc.Correct();
            }
            if(questions.moveToNext()) {
                question.setText(questions.getString(questions.getColumnIndex("question")));
                answer1.setText(questions.getString(questions.getColumnIndex("answer1")));
                answer2.setText(questions.getString(questions.getColumnIndex("answer2")));
                answer3.setText(questions.getString(questions.getColumnIndex("answer3")));
                answer4.setText(questions.getString(questions.getColumnIndex("answer4")));
                gc.setCorrectAnswer(questions.getInt(questions.getColumnIndex("correctAnswer")));
            }else{
                Intent changeActivity = new Intent(this, Score.class);
                changeActivity.putExtra("points", gc.getPoints());
                startActivity(changeActivity);
            }
        });

        answer2.setOnClickListener((v)->{
            if(gc.getCorrectAnswer()==2){
                gc.Correct();
            }
            if(questions.moveToNext()) {
                question.setText(questions.getString(questions.getColumnIndex("question")));
                answer1.setText(questions.getString(questions.getColumnIndex("answer1")));
                answer2.setText(questions.getString(questions.getColumnIndex("answer2")));
                answer3.setText(questions.getString(questions.getColumnIndex("answer3")));
                answer4.setText(questions.getString(questions.getColumnIndex("answer4")));
                gc.setCorrectAnswer(questions.getInt(questions.getColumnIndex("correctAnswer")));
            }else{
                Intent changeActivity = new Intent(this, Score.class);
                changeActivity.putExtra("points", gc.getPoints());
                startActivity(changeActivity);
            }
        });

        answer3.setOnClickListener((v)->{
            if(gc.getCorrectAnswer()==3){
                gc.Correct();
            }
            if(questions.moveToNext()) {
                question.setText(questions.getString(questions.getColumnIndex("question")));
                answer1.setText(questions.getString(questions.getColumnIndex("answer1")));
                answer2.setText(questions.getString(questions.getColumnIndex("answer2")));
                answer3.setText(questions.getString(questions.getColumnIndex("answer3")));
                answer4.setText(questions.getString(questions.getColumnIndex("answer4")));
                gc.setCorrectAnswer(questions.getInt(questions.getColumnIndex("correctAnswer")));
            }else{
                Intent changeActivity = new Intent(this, Score.class);
                Log.e("debug", "onCreate: "+gc.getPoints());
                changeActivity.putExtra("points", gc.getPoints());
                startActivity(changeActivity);
            }
        });

        answer4.setOnClickListener((v)->{
            if(gc.getCorrectAnswer()==4){
                gc.Correct();
            }
            if(questions.moveToNext()) {
                question.setText(questions.getString(questions.getColumnIndex("question")));
                answer1.setText(questions.getString(questions.getColumnIndex("answer1")));
                answer2.setText(questions.getString(questions.getColumnIndex("answer2")));
                answer3.setText(questions.getString(questions.getColumnIndex("answer3")));
                answer4.setText(questions.getString(questions.getColumnIndex("answer4")));
                gc.setCorrectAnswer(questions.getInt(questions.getColumnIndex("correctAnswer")));
            }else{
                Intent changeActivity = new Intent(this, Score.class);
                changeActivity.putExtra("points", gc.getPoints());
                startActivity(changeActivity);
            }
        });









    }
}
