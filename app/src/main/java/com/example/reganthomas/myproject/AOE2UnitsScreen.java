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

public class AOE2UnitsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aoe2_units_screen);

        String[] aoe2units = {"Champion", "Galleon", "Cavalry Archer", "Monk", "Paladin", "Pikeman", "Skirmisher", "Villager"};
        String[] aoe2images = {"champion", "galleon", "horse2", "monk", "paladin", "pikeman", "skirmisher", "villager2"};
        ListAdapter aoe2Adapter = new CustomAdapter2(this, aoe2units);
        ListView aoe2ListView = (ListView) findViewById(R.id.aoe2ListView);
        aoe2ListView.setAdapter(aoe2Adapter);
    }

    public void Back(View view){
        Intent i = new Intent(this, AOE2Screen.class);
        startActivity(i);
    }
}
