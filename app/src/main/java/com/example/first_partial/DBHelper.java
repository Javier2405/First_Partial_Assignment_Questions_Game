package com.example.first_partial;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASENAME = "questions.db";

    public static final int VERSION = 10;

    public DBHelper(Context context) {
        super(context, DATABASENAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Create table questions
        db.execSQL(" CREATE TABLE questions ( " +
                "questionId INTEGER PRIMARY KEY AUTOINCREMENT," +
                "question TEXT," +
                "answer1 TEXT," +
                "answer2 TEXT," +
                "answer3 TEXT," +
                "answer4 TEXT," +
                "correctAnswer int)"

        );



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

    public Cursor getQuestions(){
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM questions",null);

        /*Cursor cursor = db.query(
                "questions",   // The table to query
                null,             // The array of columns to return (pass null to get all)
                null,              // The columns for the WHERE clause
                null,          // The values for the WHERE clause
                null,                   // don't group the rows
                null,                   // don't filter by row groups
                null              // The sort order
        );*/

        cursor.moveToFirst();

        return cursor;
    }

    public void setQuestions(){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("questionId", 1);
        values.put("question", "¿Color favorito de Javier?");
        values.put("answer1", "Rojo");
        values.put("answer2", "Azul");
        values.put("answer3", "Negro");
        values.put("answer4", "Blanco");
        values.put("correctAnswer", 1);

        db.insert("questions", null, values);

        values.clear();

        values.put("questionId", 2);
        values.put("question", "¿Juego favorito de Javier?");
        values.put("answer1", "Minecraft");
        values.put("answer2", "Halo");
        values.put("answer3", "Lol");
        values.put("answer4", "Fortnite");
        values.put("correctAnswer", 3);

        db.insert("questions", null, values);

        values.clear();

        values.put("questionId", 3);
        values.put("question", "¿Donde nacio Javier?");
        values.put("answer1", "Ciudad de Mexico");
        values.put("answer2", "Guadalajara");
        values.put("answer3", "Lagos de Moreno");
        values.put("answer4", "Michoacan");
        values.put("correctAnswer", 2);

        db.insert("questions", null, values);

        values.clear();

        values.put("questionId", 4);
        values.put("question", "¿Ciudad favorita de Javier?");
        values.put("answer1", "Madrid");
        values.put("answer2", "Guadalajara");
        values.put("answer3", "Ciudad de Mexico");
        values.put("answer4", "Berlin");
        values.put("correctAnswer", 3);

        db.insert("questions", null, values);

        values.clear();

        values.put("questionId", 5);
        values.put("question", "¿Explorador favorito de Javier?");
        values.put("answer1", "Chrome");
        values.put("answer2", "Safari");
        values.put("answer3", "Firefox");
        values.put("answer4", "Omega");
        values.put("correctAnswer", 3);

        db.insert("questions", null, values);
    }
}
