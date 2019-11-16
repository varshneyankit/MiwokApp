package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list_view);

        Word[] family = new Word[10];
        family[0] = new Word(R.string.family_father, R.string.miwok_family_father, R.drawable.family_father);
        family[1] = new Word(R.string.family_mother, R.string.miwok_family_mother, R.drawable.family_mother);
        family[2] = new Word(R.string.family_son,R.string.miwok_family_son, R.drawable.family_son);
        family[3] = new Word(R.string.family_daughter, R.string.miwok_family_daughter, R.drawable.family_daughter);
        family[4] = new Word(R.string.family_grandfather, R.string.miwok_family_grandfather, R.drawable.family_grandfather);
        family[5] = new Word(R.string.family_grandmother, R.string.miwok_family_grandmother, R.drawable.family_grandmother);
        family[6] = new Word(R.string.family_older_brother,R.string.miwok_family_older_brother,R.drawable.family_older_brother);
        family[7] = new Word(R.string.family_older_sister,R.string.miwok_family_older_sister,R.drawable.family_older_sister);
        family[8] = new Word(R.string.family_younger_brother,R.string.miwok_family_younger_brother,R.drawable.family_younger_brother);
        family[9] = new Word(R.string.family_younger_sister,R.string.miwok_family_younger_sister,R.drawable.family_younger_sister);

        ((ListView) findViewById(R.id.listView)).setAdapter(new WordAdapter(this,R.layout.list_item,family));
    }
}
