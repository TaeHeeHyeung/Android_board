package com.example.myapplication.holder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

public class BoardHolder extends RecyclerView.ViewHolder {

    public final TextView tv_number;
    public final TextView tv_title;
    public final TextView tv_date;
    public final TextView tv_user;

    public BoardHolder(@NonNull View itemView) {
        super(itemView);
        tv_number= itemView.findViewById(R.id.tv_number);
        tv_title= itemView.findViewById(R.id.tv_title);
        tv_date= itemView.findViewById(R.id.tv_date);
        tv_user= itemView.findViewById(R.id.tv_user);
    }
}
