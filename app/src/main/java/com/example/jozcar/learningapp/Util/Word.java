package com.example.jozcar.learningapp.Util;

/**
 * Created by jozca on 4/3/2018.
 */

public class Word {

    private  String mDefaultTranslation;
    private  String mMiwokTranslation;
    public Word(String defaultTranslation,String miwokTranslation){

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public  String getMiwokTranslation(){
        return  mMiwokTranslation;
    }
}
