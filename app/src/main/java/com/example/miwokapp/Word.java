package com.example.miwokapp;

public class Word {

    private int English;
    private int Miwok;
    private Integer Image;

    public Word(int english, int miwok, Integer image) {
        English = english;
        Miwok = miwok;
        Image = image;
    }

    public int getEnglish() {
        return English;
    }

    public int getMiwok() {
        return Miwok;
    }

    public Integer getImage() {
        return Image;
    }
}
