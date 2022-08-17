package com.example.englishquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create ArrayList
        ArrayList<String> quotes = new ArrayList<String>();

        //Add elements to the ArrayList
        quotes.add("Be yourself; everyone else is already taken. ― Oscar Wilde");
        quotes.add("I'm selfish, impatient and a little insecure. I make mistakes, I am out of control and at times hard to handle. But if you can't handle me at my worst, then you sure as hell don't deserve me at my best. ― Marilyn Monroe");
        quotes.add("Two things are infinite: the universe and human stupidity; and I'm not sure about the universe. ― Albert Einstein");
        quotes.add("A room without books is like a body without a soul. ― Marcus Tullius Cicero");
        quotes.add("Be who you are and say what you feel, because those who mind don't matter, and those who matter don't mind. ― Bernard M. Baruch");

        //Find rootVie
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        for (int i = 0; i < quotes.size(); i++){
            TextView quotesView = new TextView(this);
            quotesView.setText(quotes.get(i));
            rootView.addView(quotesView);
        }
    }
}