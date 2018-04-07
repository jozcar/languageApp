package com.example.jozcar.learningapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.jozcar.learningapp.Listener.TranslationClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activy_main);

        TranslationClickListener clickListener = new TranslationClickListener();

        TextView numbers = findViewById(R.id.numbers);
        numbers.setOnClickListener(clickListener);

        TextView family = findViewById(R.id.family);
        family.setOnClickListener(clickListener);

        TextView colors = findViewById(R.id.colors);
        colors.setOnClickListener(clickListener);

        TextView phrases = findViewById(R.id.phrases);
        phrases.setOnClickListener(clickListener);



    }

}
