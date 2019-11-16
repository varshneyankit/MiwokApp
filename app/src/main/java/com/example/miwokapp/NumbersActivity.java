package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        Word[] numbers = new Word[10];
        numbers[0] = new Word(R.string.number_one, R.string.miwok_number_one, R.drawable.number_one);
        numbers[1] = new Word(R.string.number_two, R.string.miwok_number_two, R.drawable.number_two);
        numbers[2] = new Word(R.string.number_three, R.string.miwok_number_three, R.drawable.number_three);
        numbers[3] = new Word(R.string.number_four, R.string.miwok_number_four, R.drawable.number_four);
        numbers[4] = new Word(R.string.number_five, R.string.miwok_number_five, R.drawable.number_five);
        numbers[5] = new Word(R.string.number_six, R.string.miwok_number_six, R.drawable.number_six);
        numbers[6] = new Word(R.string.number_seven, R.string.miwok_number_seven, R.drawable.number_seven);
        numbers[7] = new Word(R.string.number_eight, R.string.miwok_number_eight, R.drawable.number_eight);
        numbers[8] = new Word(R.string.number_nine, R.string.miwok_number_nine, R.drawable.number_nine);
        numbers[9] = new Word(R.string.number_ten, R.string.miwok_number_ten, R.drawable.number_ten);

        WordAdapter wordAdapter = new WordAdapter(this, R.layout.list_item, numbers);

        ListView listView=findViewById(R.id.listView);
        listView.setAdapter(wordAdapter);

    }

}
