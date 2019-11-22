package com.example.miwokapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class WordListFragment extends Fragment {

    private int identifier;

    public WordListFragment(int identifier){
        this.identifier = identifier;
    }

    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.words_list_view,container,false);

        listView = rootView.findViewById(R.id.listView);

        setData();

        return rootView;
    }


    public void setData(){

        Word[] data = null;

        switch (this.identifier) {
            case FetchData.NUMBERS_FRAGMENT:{
                data = FetchData.getNumbersArray();
                break;
            }

            case FetchData.COLOURS_FRAGMENT: {
                data = FetchData.getColoursArray();
                break;
            }

            case FetchData.FAMILY_FRAGMENT: {
                data = FetchData.getFamilyArray();
                break;
            }

            case FetchData.PHRASES_FRAGMENT: {
                data = FetchData.getPhrasesArray();
                break;
            }

        }

        listView.setAdapter(new WordAdapter(getContext(),R.layout.list_item,data));


    }

}
