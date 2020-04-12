package com.example.first_partial;

import android.util.Log;

public class GameController {

    private int points;
    private int correctAns;


    public GameController(){
        this.points = 0;
    }

    public void Correct(){
        this.points +=1;
        Log.e("debug", "Correct: "+this.points);
    }

    public int getPoints(){
        return this.points;
    }

    public void setCorrectAnswer(int correct){
        this.correctAns = correct;
    }

    public int getCorrectAnswer(){
        return this.correctAns;
    }


}
