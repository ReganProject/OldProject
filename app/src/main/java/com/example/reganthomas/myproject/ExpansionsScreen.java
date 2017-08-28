package com.example.reganthomas.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ExpansionsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expansions_screen);
    }

    public void Back(View view){
        Intent i = new Intent(this, MenuScreen.class);
        startActivity(i);
    }
}
