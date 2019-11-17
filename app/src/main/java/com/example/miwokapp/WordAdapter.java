package com.example.miwokapp;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

final class WordAdapter extends ArrayAdapter<Word> {

    private String LOG_TAG = WordAdapter.class.getSimpleName();

    private Word[] data;
    private int resource;
    private Context context;

    public WordAdapter(@NonNull Context context, int resource, @NonNull Word[] objects) {
        super(context, resource, objects);
        this.data = objects;
        this.resource = resource;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View oldView, @NonNull ViewGroup parent) {

        Log.d("GetView", "Need view: " + position);

        // Inflates new view if old doesn't exist yet
        if (oldView == null) {
            Log.d("GetView", "Inflated view: " + position);
            oldView = LayoutInflater.from(context).inflate(resource,parent,false);
        }

        TextView englishTextView = oldView.findViewById(R.id.et1);
        TextView miwokTextView = oldView.findViewById(R.id.mt1);
        ImageView image = oldView.findViewById(R.id.image);

        final Word currentWord = data[position];

        englishTextView.setText(currentWord.getEnglish());
        miwokTextView.setText(currentWord.getMiwok());

        if (currentWord.getImage() != null) {
            image.setImageResource(currentWord.getImage());
        }else image.setVisibility(View.GONE);

        oldView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        MediaPlayer player = MediaPlayer.create(context, currentWord.getAudio());
                        player.start();
                        while(player.isPlaying()){
                            //Do nothing wait
                        }player.release();
                    }
                }).start();

            }
        });

        return oldView;
    }
}
