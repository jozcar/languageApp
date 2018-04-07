package com.example.jozcar.learningapp.Util;

import com.example.jozcar.learningapp.Translate.NumberTraslation;

/**
 * Created by jozca on 4/6/2018.
 */

public class TranslationFactory {
    public  static Mapping Translate(String type){
        if(type.equals("Numbers")){
            return new NumberTraslation();
        }

        return  null;
    }
}
