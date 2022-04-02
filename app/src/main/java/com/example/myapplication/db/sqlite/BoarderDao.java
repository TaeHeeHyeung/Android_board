package com.example.myapplication.db.sqlite;

import android.app.Activity;
import android.database.Cursor;

import com.example.myapplication.db.sqlite.DB_;
import com.example.myapplication.model.BoardModel;

import java.util.ArrayList;

public class BoarderDao {

    public ArrayList<BoardModel> selectBoardDao(Activity activity) {
        ArrayList<BoardModel> lists = new ArrayList<>();
        DB_ db_ = DB_.getInstance(activity);

        String queryStr = "SELECT * FROM " + BoardColumn.TABLE_NAME_BOARD;
        Cursor cursor = db_.db.rawQuery(queryStr, null);
        if (cursor != null) {
            int boardNumber = cursor.getInt(cursor.getColumnIndexOrThrow(BoardColumn.BOARD_NUMBER));
            String title = cursor.getString(cursor.getColumnIndexOrThrow(BoardColumn.BOARD_TITLE));
            String text = cursor.getString(cursor.getColumnIndexOrThrow(BoardColumn.BOARD_TEXT));
            long date = cursor.getLong(cursor.getColumnIndexOrThrow(BoardColumn.BOARD_DATE));

            BoardModel boardModel = new BoardModel(boardNumber, title, text, date);
        }
        while (cursor.moveToNext()) {

        }

        db_.db.close();
        return lists;
    }
}
