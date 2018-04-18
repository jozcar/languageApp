package com.example.jozcar.learningapp.Translate;

import com.example.jozcar.learningapp.R;
import com.example.jozcar.learningapp.Util.Mapping;
import com.example.jozcar.learningapp.Util.Word;

import java.util.ArrayList;

/**
 * Created by jozca on 4/6/2018.
 */

public class NumberTraslation implements Mapping {
    @Override
    public ArrayList<Word> TranslationList() {
        ArrayList<Word> list = new ArrayList<Word>();
        list.add(new Word("One","Uno", R.drawable.number_one));
        list.add(new Word("Two","Dos",R.drawable.number_two));
        list.add(new Word("Three","Tres",R.drawable.number_three));
        list.add(new Word("Four","Cuatro",R.drawable.number_four));
        list.add(new Word("Five","Cinco",R.drawable.number_five));
        list.add(new Word("Six","Seis",R.drawable.number_six));
        list.add(new Word("Seven","Siete",R.drawable.number_seven));
        list.add(new Word("Eight","Ocho",R.drawable.number_eight));
        list.add(new Word("Nine","Nueve",R.drawable.number_nine));
        list.add(new Word("Ten","Diez",R.drawable.number_ten));


        return list;
    }

}
