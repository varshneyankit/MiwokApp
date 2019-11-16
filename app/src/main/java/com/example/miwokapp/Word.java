package com.example.miwokapp;

public class Word {

    private int English;
    private int Miwok;
    private int Image;

    public Word(int english, int miwok, int image) {
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

    public int getImage() {
        return Image;
    }
}
