package com.example.jozcar.learningapp.Translate;
import com.example.jozcar.learningapp.R;
import com.example.jozcar.learningapp.Util.Mapping;
import com.example.jozcar.learningapp.Util.Word;

import java.util.ArrayList;



/**
 * Created by jozca on 4/6/2018.
 */

public class FamilyTranslation implements Mapping {
    @Override
    public ArrayList<Word> TranslationList() {
        ArrayList<Word> list = new ArrayList<Word>();
        list.add(new Word("Father","Papa", R.drawable.family_father));
        list.add(new Word("Mother","Mama",R.drawable.family_mother));
        list.add(new Word("Brother","Hermano",R.drawable.family_older_brother));
        return list;
    }

}
