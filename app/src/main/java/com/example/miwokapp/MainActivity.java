package com.example.miwokapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private String[] tabs = {
            "Numbers",
            "Colors",
            "Phrases",
            "Family Members"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO create tabs for view pager
        // https://javapapers.com/android/android-tab-layout-with-swipe-views/

        ViewPager pager = findViewById(R.id.pager);
        pager.setAdapter(new TabPagerAdapter(getSupportFragmentManager()));

    }

    private class TabPagerAdapter extends FragmentPagerAdapter {

        public TabPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {

            WordListFragment fragment;

            switch (position) {

                case 0: {
                     fragment= new WordListFragment(FetchData.NUMBERS_FRAGMENT);
                     break;
                }
                case 1: {
                    fragment= new WordListFragment(FetchData.COLOURS_FRAGMENT);
                    break;
                }
                case 2: {
                    fragment= new WordListFragment(FetchData.PHRASES_FRAGMENT);
                    break;
                }
                case 3: {
                    fragment= new WordListFragment(FetchData.FAMILY_FRAGMENT);
                    break;
                }
                default:
                    fragment = new WordListFragment(FetchData.NUMBERS_FRAGMENT);
            }

            return fragment;

        }

        @Override
        public int getCount() {
            return tabs.length;
        }

    }

}
