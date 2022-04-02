package com.example.myapplication.model;

public class BoardModel {
    public int number; //인덱스
    public String title; //제목
    public String name; //홍길동
    public long date; //2022-04-02
    public String text; //내용

    public BoardModel(int boardNumber, String title, String text, long date) {
    }


    public String getDateFormatted() {
        return String.valueOf(date);
    }
}
