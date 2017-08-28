package com.example.reganthomas.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LinksScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_links_screen);
    }

    public void onClick(View view){
        Intent i = new Intent(this, WebpageListActivity.class);
        startActivity(i);
    }
}
