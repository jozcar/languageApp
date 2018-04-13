package com.example.jozcar.learningapp.Translate;

import com.example.jozcar.learningapp.Util.Mapping;
import com.example.jozcar.learningapp.Util.Word;

import java.util.ArrayList;

/**
 * Created by jozca on 4/6/2018.
 */

public class ColorsTranslation implements Mapping {
    @Override
    public ArrayList<Word> TranslationList() {
        ArrayList<Word> list = new ArrayList<Word>();
        list.add(new Word("Black","Negro"));
        list.add(new Word("Yellow","Amarillo"));
        list.add(new Word("White","Blanco"));
        return list;
    }
}
