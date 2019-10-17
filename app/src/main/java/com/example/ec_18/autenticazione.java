package com.example.ec_18;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class autenticazione extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autenticazione1);


    }

    public void show(final Context packageContext) {
        Intent i = new Intent(packageContext, autenticazione.class);
        packageContext.startActivity(i);
    }

}
