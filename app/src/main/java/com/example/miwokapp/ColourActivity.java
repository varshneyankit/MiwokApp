package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ColourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list_view);

        Word[] colours = new Word[8];
        colours[0] = new Word(R.string.color_black, R.string.miwok_color_black, R.drawable.color_black);
        colours[1] = new Word(R.string.color_brown, R.string.miwok_color_brown, R.drawable.color_brown);
        colours[2] = new Word(R.string.color_dusty_yellow, R.string.miwok_color_dusty_yellow, R.drawable.color_dusty_yellow);
        colours[3] = new Word(R.string.color_gray, R.string.miwok_color_gray, R.drawable.color_gray);
        colours[4] = new Word(R.string.color_green, R.string.color_green, R.drawable.color_green);
        colours[5] = new Word(R.string.color_mustard_yellow, R.string.miwok_color_mustard_yellow, R.drawable.color_mustard_yellow);
        colours[6] = new Word(R.string.color_red, R.string.miwok_color_red, R.drawable.color_red);
        colours[7] = new Word(R.string.color_white, R.string.miwok_color_white, R.drawable.color_white);

        WordAdapter wordAdapter= new WordAdapter(this,R.layout.list_item, colours);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(wordAdapter);
    }
}
