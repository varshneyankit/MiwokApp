package com.example.miwokapp;

public class Word {

    private int English;
    private int Miwok;
    private Integer Image;
    private int Audio;

    public Word(int english, int miwok, Integer image, int audio) {
        English = english;
        Miwok = miwok;
        Image = image;
        Audio = audio;
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

    public int getAudio() { return Audio;}
}
