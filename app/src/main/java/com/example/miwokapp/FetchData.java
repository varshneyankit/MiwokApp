package com.example.miwokapp;

class FetchData {

    static final String ACTIVITY_IDENTIFIER_KEY = "identifier";

    static final int NUMBERS_ACTIVITY = 0;
    static final int COLOURS_ACTIVITY = 1;
    static final int PHRASES_ACTIVITY = 2;
    static final int FAMILY_ACTIVITY = 3;

    static Word[] getNumbersArray() {

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

        return numbers;


    }

    static Word[] getPhrasesArray() {
        Word[] phrases = new Word[10];
        phrases[0] = new Word(R.string.phrase_are_you_coming, R.string.miwok_phrase_are_you_coming, null);
        phrases[1] = new Word(R.string.phrase_come_here, R.string.miwok_phrase_come_here, null);
        phrases[2] = new Word(R.string.phrase_how_are_you_feeling, R.string.miwok_phrase_how_are_you_feeling, null);
        phrases[3] = new Word(R.string.phrase_im_coming, R.string.miwok_phrase_im_coming, null);
        phrases[4] = new Word(R.string.phrase_im_feeling_good, R.string.miwok_phrase_im_feeling_good, null);
        phrases[5] = new Word(R.string.phrase_lets_go, R.string.miwok_phrase_lets_go, null);
        phrases[6] = new Word(R.string.phrase_what_is_your_name, R.string.miwok_phrase_what_is_your_name, null);
        phrases[7] = new Word(R.string.phrase_yes_im_coming, R.string.miwok_phrase_yes_im_coming, null);
        phrases[8] = new Word(R.string.phrase_my_name_is, R.string.miwok_phrase_my_name_is, null);
        phrases[9] = new Word(R.string.phrase_where_are_you_going, R.string.miwok_phrase_where_are_you_going, null);

        return phrases;
    }

    static Word[] getFamilyArray() {
        Word[] family = new Word[10];
        family[0] = new Word(R.string.family_father, R.string.miwok_family_father, R.drawable.family_father);
        family[1] = new Word(R.string.family_mother, R.string.miwok_family_mother, R.drawable.family_mother);
        family[2] = new Word(R.string.family_son, R.string.miwok_family_son, R.drawable.family_son);
        family[3] = new Word(R.string.family_daughter, R.string.miwok_family_daughter, R.drawable.family_daughter);
        family[4] = new Word(R.string.family_grandfather, R.string.miwok_family_grandfather, R.drawable.family_grandfather);
        family[5] = new Word(R.string.family_grandmother, R.string.miwok_family_grandmother, R.drawable.family_grandmother);
        family[6] = new Word(R.string.family_older_brother, R.string.miwok_family_older_brother, R.drawable.family_older_brother);
        family[7] = new Word(R.string.family_older_sister, R.string.miwok_family_older_sister, R.drawable.family_older_sister);
        family[8] = new Word(R.string.family_younger_brother, R.string.miwok_family_younger_brother, R.drawable.family_younger_brother);
        family[9] = new Word(R.string.family_younger_sister, R.string.miwok_family_younger_sister, R.drawable.family_younger_sister);

        return family;
    }

    static Word[] getColoursArray() {
        Word[] colours = new Word[8];
        colours[0] = new Word(R.string.color_black, R.string.miwok_color_black, R.drawable.color_black);
        colours[1] = new Word(R.string.color_brown, R.string.miwok_color_brown, R.drawable.color_brown);
        colours[2] = new Word(R.string.color_dusty_yellow, R.string.miwok_color_dusty_yellow, R.drawable.color_dusty_yellow);
        colours[3] = new Word(R.string.color_gray, R.string.miwok_color_gray, R.drawable.color_gray);
        colours[4] = new Word(R.string.color_green, R.string.color_green, R.drawable.color_green);
        colours[5] = new Word(R.string.color_mustard_yellow, R.string.miwok_color_mustard_yellow, R.drawable.color_mustard_yellow);
        colours[6] = new Word(R.string.color_red, R.string.miwok_color_red, R.drawable.color_red);
        colours[7] = new Word(R.string.color_white, R.string.miwok_color_white, R.drawable.color_white);

        return colours;
    }
}
