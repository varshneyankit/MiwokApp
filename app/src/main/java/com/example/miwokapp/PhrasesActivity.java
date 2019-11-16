package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list_view);

        Word[] phrases=new Word[10];
        phrases[0] = new Word(R.string.phrase_are_you_coming,R.string.miwok_phrase_are_you_coming,null);
        phrases[1] = new Word(R.string.phrase_come_here,R.string.miwok_phrase_come_here,null);
        phrases[2] = new Word(R.string.phrase_how_are_you_feeling,R.string.miwok_phrase_how_are_you_feeling,null);
        phrases[3] = new Word(R.string.phrase_im_coming,R.string.miwok_phrase_im_coming,null);
        phrases[4] = new Word(R.string.phrase_im_feeling_good,R.string.miwok_phrase_im_feeling_good,null);
        phrases[5] = new Word(R.string.phrase_lets_go,R.string.miwok_phrase_lets_go,null);
        phrases[6] = new Word(R.string.phrase_what_is_your_name,R.string.miwok_phrase_what_is_your_name,null);
        phrases[7] = new Word(R.string.phrase_yes_im_coming,R.string.miwok_phrase_yes_im_coming,null);
        phrases[8] = new Word(R.string.phrase_my_name_is, R.string.miwok_phrase_my_name_is, null);
        phrases[9] = new Word(R.string.phrase_where_are_you_going, R.string.miwok_phrase_where_are_you_going, null);

        ((ListView) findViewById(R.id.listView)).setAdapter(new WordAdapter(this,R.layout.list_item, phrases));

    }
}
