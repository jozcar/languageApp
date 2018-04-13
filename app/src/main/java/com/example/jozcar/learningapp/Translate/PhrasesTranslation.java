package com.example.jozcar.learningapp.Translate;

import com.example.jozcar.learningapp.Util.Word;

import java.util.ArrayList;

import com.example.jozcar.learningapp.Util.Mapping;

/**
 * Created by jozca on 4/6/2018.
 */

public class PhrasesTranslation implements Mapping {
    @Override
    public ArrayList<Word> TranslationList() {
        ArrayList<Word> list = new ArrayList<Word>();
        list.add(new Word("Hi","Hola"));
        list.add(new Word("How are you","Como estas"));
        list.add(new Word("What is the time","Que hora es"));
        return list;
    }

}
