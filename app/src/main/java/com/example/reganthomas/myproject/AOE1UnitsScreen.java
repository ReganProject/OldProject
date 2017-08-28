package com.example.reganthomas.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class AOE1UnitsScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aoe1_units_screen);

        String[] aoe1units = {"Archer", "Axeman", "Chariot Archer", "Elephant Archer", "Horse Archer", "Legionnaire", "Slinger", "Villager"};
        String[] aoe1images = {"archer", "axeman", "chariot", "elephant", "horse", "legion", "slinger", "villager"};
        ListAdapter aoe1Adapter = new customAdapter(this, aoe1units);
        ListView aoe1ListView = (ListView) findViewById(R.id.aoe1ListView);
        aoe1ListView.setAdapter(aoe1Adapter);
    }

    public void Back(View view){
        Intent i = new Intent(this, AOE1Screen.class);
        startActivity(i);
    }
}
