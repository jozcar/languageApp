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
        list.add(new Word("Ten","Diez"));
        list.add(new Word("Eleven","Once"));
        list.add(new Word("Twelve","Doce"));
        list.add(new Word("Thirteen","Trece"));
        list.add(new Word("Fourteen","Catorze"));
        list.add(new Word("Fifteen","Quinze"));
        list.add(new Word("Sixteen","Diese Seis"));
        list.add(new Word("Seventeen","Diese Siete"));
        list.add(new Word("Eighteen","Diese Ocho"));
        list.add(new Word("Nineteen","Diese Nueve"));
        list.add(new Word("Twenty","Veinty"));

        return list;
    }

}
