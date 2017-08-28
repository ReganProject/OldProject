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

public class AOE3UnitsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aoe3_units_screen);

        String[] aoe3units = {"Dragoon", "Gatling Gun", "Militia", "Minuteman", "Musketeer", "Priest", "Samurai", "Spy"};
        String[] aoe3images = {"dragoon", "gatling", "militia", "minuteman", "musketeer", "priest", "samurai", "spy"};
        ListAdapter aoe3Adapter = new CustomAdapter3(this, aoe3units);
        ListView aoe3ListView = (ListView) findViewById(R.id.aoe3ListView);
        aoe3ListView.setAdapter(aoe3Adapter);
    }

    public void Back(View view){
        Intent i = new Intent(this, AOE3Screen.class);
        startActivity(i);
    }
}
