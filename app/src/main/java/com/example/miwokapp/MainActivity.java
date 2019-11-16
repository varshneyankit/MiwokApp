package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = findViewById(R.id.numbersTV);
        TextView colors = findViewById(R.id.colorsTV);
        TextView phrases = findViewById(R.id.phrasesTV);
        TextView family = findViewById(R.id.familyTV);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) v;
                String text = textView.getText().toString();

                if (text.equals(getString(R.string.numbers_activity_title)))
                    startActivity(new Intent(MainActivity.this, NumbersActivity.class));
                else if (text.equals(getString(R.string.colors_activity_title)))
                    startActivity(new Intent(MainActivity.this, ColourActivity.class));
                else if (text.equals(getString(R.string.phrases_activity_title)))
                    startActivity(new Intent(MainActivity.this,PhrasesActivity.class));
                else if (text.equals(getString(R.string.family_activity_title)))
                    startActivity(new Intent(MainActivity.this, FamilyMembersActivity.class));

                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();

            }
        };

        numbers.setOnClickListener(listener);
        colors.setOnClickListener(listener);
        phrases.setOnClickListener(listener);
        family.setOnClickListener(listener);

    }
}
