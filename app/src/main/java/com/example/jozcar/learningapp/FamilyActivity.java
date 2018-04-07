package com.example.jozcar.learningapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.jozcar.learningapp.Util.Mapping;
import com.example.jozcar.learningapp.Util.TranslationFactory;
import com.example.jozcar.learningapp.Util.Word;
import com.example.jozcar.learningapp.Util.WordAdapter;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        Mapping list = TranslationFactory.Translate("Numbers");
        ArrayList<Word> _list = list.TranslationList();

        WordAdapter learn = new WordAdapter(this,_list);
        ListView listView = findViewById(R.id.rootView);
        listView.setAdapter(learn);
    }
}
