package com.example.reganthomas.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;
import android.content.Intent;
import android.view.View;

public class AOE1Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aoe1_screen);
    }

    public void Back(View view){
        Intent i = new Intent(this, MenuScreen.class);
        startActivity(i);
    }

    public void Units(View view){
        Intent i = new Intent(this, AOE1UnitsScreen.class);
        startActivity(i);
    }

    public void AOE2(View view){
        Intent i = new Intent(this, AOE2Screen.class);
        startActivity(i);
    }
}
