package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;

import com.example.myapplication.adatper.BoardAdapter;
import com.example.myapplication.db.sqlite.BoarderDao;
import com.example.myapplication.model.BoardModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_board;
    private Activity mActivity;
    private RecyclerView.LayoutManager centerLayoutManager;
    public ArrayList<BoardModel> boardModels;
    private BoardAdapter boardAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_board = findViewById(R.id.rv_board);
        mActivity = this;

        BoarderDao boarderDao = new BoarderDao();
        boardModels = boarderDao.selectBoardDao(mActivity);
        boardAdapter = new BoardAdapter(this);
        centerLayoutManager = new LinearLayoutManager(mActivity);
        rv_board.setAdapter(boardAdapter);
        rv_board.setLayoutManager(centerLayoutManager);

    }
}