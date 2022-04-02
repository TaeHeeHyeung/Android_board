package com.example.myapplication.db.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DB_ extends SQLiteOpenHelper {
    private String TAG = DB_.class.getSimpleName();
    private static final String DB_NAME = "BOARD";
    private static final int DB_VERSION = 1;
    private static DB_ instance;
    public SQLiteDatabase db;


    private DB_(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        dbOpen();
    }

    public static DB_ getInstance(Context context) {
        if (instance == null) {
            instance = new DB_(context);
        }
        return instance;
    }

    public void dbOpen() {
        if (db != null) {
            if (!db.isOpen()) {
                db = getWritableDatabase();
            }
        } else {
            db = getWritableDatabase();
        }
    }

    @Override
    public void onCreate(android.database.sqlite.SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS " + BoardColumn.TABLE_NAME_BOARD + "( " +
                BoardColumn.BOARD_NUMBER + " INTEGER DEFAULT ''," +
                BoardColumn.BOARD_TITLE + " TEXT DEFAULT ''," +
                BoardColumn.BOARD_TEXT + " TEXT DEFAULT ''," +
                BoardColumn.BOARD_DATE + " LONG DEFAULT '' " +
                " )");

    }

    @Override
    public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
