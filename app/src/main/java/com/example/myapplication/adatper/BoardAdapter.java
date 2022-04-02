package com.example.myapplication.adatper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.holder.BoardHolder;
import com.example.myapplication.model.BoardModel;

public class BoardAdapter extends RecyclerView.Adapter<BoardHolder> {
    private final MainActivity activity;

    public BoardAdapter(MainActivity activity) {
        super();
        this.activity = activity;
    }

    @NonNull
    @Override
    public BoardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View boardItem = inflater.inflate(R.layout.board_item, null, false);
        return new BoardHolder(boardItem);
    }

    @Override
    public void onBindViewHolder(@NonNull BoardHolder holder, int position) {
        BoardModel boardModel = activity.boardModels.get(0);
        holder.tv_number.setText(String.valueOf(boardModel.number));
        holder.tv_title.setText(boardModel.title);
        holder.tv_date.setText(boardModel.getDateFormatted());
    }


    @Override
    public int getItemCount() {
        if (activity.boardModels != null) {
            return activity.boardModels.size();
        } else {
            return 0;
        }
    }
}
