package com.example.jozcar.learningapp.Util;

/**
 * Created by jozca on 4/3/2018.
 */

public class Word {

    private  String mDefaultTranslation;
    private  String mMiwokTranslation;
    private  int mImageResourceID = -1;
    public Word(String defaultTranslation,String miwokTranslation){

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation,String miwokTranslation,int imageResourceID){

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public  String getMiwokTranslation(){
        return  mMiwokTranslation;
    }

    public  int getImageResourceID(){ return mImageResourceID;}
}
