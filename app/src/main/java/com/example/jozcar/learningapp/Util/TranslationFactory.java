package com.example.jozcar.learningapp.Util;

import com.example.jozcar.learningapp.Translate.ColorsTranslation;
import com.example.jozcar.learningapp.Translate.FamilyTranslation;
import com.example.jozcar.learningapp.Translate.NumberTraslation;
import com.example.jozcar.learningapp.Translate.PhrasesTranslation;

/**
 * Created by jozca on 4/6/2018.
 */

public class TranslationFactory {
    public  static Mapping Translate(String type){
        if(type.equals("Numbers")){
            return new NumberTraslation();
        }else if(type.equals("Colors")){
            return  new ColorsTranslation();
        }else if(type.equals("Family")){
            return new FamilyTranslation();
        }else if(type.equals("Phrases")){
            return  new PhrasesTranslation();
        }

        return  null;
    }
}
