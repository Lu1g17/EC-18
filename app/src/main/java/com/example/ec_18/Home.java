package com.example.ec_18;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homeboundary); //per dare la relazione tra classe java e layout

        Button login = findViewById(R.id.buttonLogin);  //dichiaro una variabile di tipo bottone e gli assegno il bottone creato nel layout

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new autenticazione().show(Home.this);
            }
        });
    }
}