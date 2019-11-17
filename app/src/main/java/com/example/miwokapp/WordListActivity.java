package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class WordListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list_view);

        int identity = getIntent().getIntExtra(FetchData.ACTIVITY_IDENTIFIER_KEY,/*Default value*/FetchData.NUMBERS_ACTIVITY);

        Word[] data = null;

        switch (identity) {
            case FetchData.NUMBERS_ACTIVITY: {
                data = FetchData.getNumbersArray();
                break;
            }

            case FetchData.COLOURS_ACTIVITY: {
                data = FetchData.getColoursArray();
                break;
            }

            case FetchData.FAMILY_ACTIVITY: {
                data = FetchData.getFamilyArray();
                break;
            }

            case FetchData.PHRASES_ACTIVITY: {
                data = FetchData.getPhrasesArray();
                break;
            }

        }

        WordAdapter wordAdapter = new WordAdapter(this, R.layout.list_item, data);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(wordAdapter);

    }

}
