package com.example.jozcar.learningapp.Listener;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.example.jozcar.learningapp.ColorsActivity;
import com.example.jozcar.learningapp.FamilyActivity;
import com.example.jozcar.learningapp.NumberActivity;
import com.example.jozcar.learningapp.PhrasesActivity;
import com.example.jozcar.learningapp.R;

/**
 * Created by jozca on 3/25/2018.
 */

public class TranslationClickListener implements View.OnClickListener {



    @Override
    public void onClick(View view){

        switch (view.getId()){
            case R.id.numbers:
                Toast.makeText(view.getContext(),"Open the list of Numbers",Toast.LENGTH_SHORT).show();
                Intent numbers  = new Intent(view.getContext(), NumberActivity.class);
                view.getContext().startActivity(numbers);
                break;
            case R.id.family:
                Toast.makeText(view.getContext(),"Open the list of Family",Toast.LENGTH_SHORT).show();
                Intent   family  = new Intent(view.getContext(),FamilyActivity.class);
                view.getContext().startActivity(family);
                break;
            case R.id.colors:
                Toast.makeText(view.getContext(),"Open the list of Colors",Toast.LENGTH_SHORT).show();
                Intent  color  = new Intent(view.getContext(),ColorsActivity.class);
                view.getContext().startActivity(color);
                break;
            case R.id.phrases:
                Toast.makeText(view.getContext(),"Open the list of Phrases",Toast.LENGTH_SHORT).show();
                Intent  phrases  = new Intent(view.getContext(),PhrasesActivity.class);
                view.getContext().startActivity(phrases);
                break;

        }

    }


}

