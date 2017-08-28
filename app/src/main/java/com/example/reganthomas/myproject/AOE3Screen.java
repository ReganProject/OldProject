package com.example.reganthomas.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;
import android.content.Intent;
import android.view.View;

public class AOE3Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aoe3_screen);
    }

    public void Units(View view){
        Intent i = new Intent(this, AOE3UnitsScreen.class);
        startActivity(i);
    }

    public void Back(View view){
        Intent i = new Intent(this, MenuScreen.class);
        startActivity(i);
    }

    public void AOM(View view){
        Intent i = new Intent(this, AOMScreen.class);
        startActivity(i);
    }
}
