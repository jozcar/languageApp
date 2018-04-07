package com.example.jozcar.learningapp.Translate;

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
        list.add(new Word("One","Uno"));
        list.add(new Word("Two","Dos"));
        list.add(new Word("Three","Tres"));
        list.add(new Word("Four","Cuatro"));
        list.add(new Word("Five","Cinco"));
        list.add(new Word("Six","Seis"));
        list.add(new Word("Seven","Siete"));
        list.add(new Word("Eight","Ocho"));
        list.add(new Word("Nine","Nueve"));
        list.add(new Word("Ten","Dos"));
        list.add(new Word("Eleven","Dos"));
        list.add(new Word("Twelve","Dos"));
        list.add(new Word("Thirteen","Dos"));
        list.add(new Word("15","Dos"));
        list.add(new Word("16","Dos"));
        list.add(new Word("17","Dos"));
        list.add(new Word("18","Dos"));
        list.add(new Word("19","Dos"));
        list.add(new Word("20","Dos"));
        list.add(new Word("21","veinte uno"));

        return list;
    }

}
