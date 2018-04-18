package com.example.jozcar.learningapp.Util;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jozcar.learningapp.R;
import com.example.jozcar.learningapp.Util.Word;

import java.util.ArrayList;

/**
 * Created by jozca on 4/3/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public  WordAdapter(Activity context, ArrayList<Word> _words){
        super(context,0,_words);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word currentWord = getItem(position);
        TextView miwokTextView = (TextView)listItemView.findViewById(R.id.miwok);
        miwokTextView.setText(currentWord.getDefaultTranslation());


        TextView translationTextView = (TextView)listItemView.findViewById(R.id.translation);
        translationTextView.setText(currentWord.getMiwokTranslation());

        if(currentWord.getImageResourceID() != -1){
            ImageView iconView = (ImageView)listItemView.findViewById(R.id.image);
            iconView.setImageResource(currentWord.getImageResourceID());

        }


        return  listItemView;

        // return super.getView(position, convertView, parent);
    }
}
