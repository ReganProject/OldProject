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

public class AOMUnitsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aomunits_screen);

        String[] aomunits = {"Achilles", "Hercules", "Hippikoni", "Hoplite", "Manticore", "Odysseus", "Pegasus", "Villager"};
        String[] aomimages = {"achilles", "hercules", "hippikoni", "hoplite", "manticore", "odysseus", "pegasus", "villager4"};
        ListAdapter aomAdapter = new CustomAdapter4(this, aomunits);
        ListView aomListView = (ListView) findViewById(R.id.aomListView);
        aomListView.setAdapter(aomAdapter);
    }

    public void Back(View view){
        Intent i = new Intent(this, AOMScreen.class);
        startActivity(i);
    }
}
