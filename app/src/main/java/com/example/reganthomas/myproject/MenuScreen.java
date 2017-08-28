package com.example.reganthomas.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;
import android.content.Intent;
import android.view.View;

public class MenuScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.aboutmeButton:
                Intent a = new Intent(this, AboutMeScreen.class);
                startActivity(a);
                break;
            case R.id.linksButton:
                Intent l = new Intent(this, WebpageListActivity.class);
                startActivity(l);
                break;
            case R.id.historyButton:
                Intent h = new Intent(this, HistoryScreen.class);
                startActivity(h);
                break;
            case R.id.aoe1Button:
                Intent ae1 = new Intent(this, AOE1Screen.class);
                startActivity(ae1);
                break;
            case R.id.aoe2Button:
                Intent ae2 = new Intent(this, AOE2Screen.class);
                startActivity(ae2);
                break;
            case R.id.aoe3Button:
                Intent ae3 = new Intent(this, AOE3Screen.class);
                startActivity(ae3);
                break;
            case R.id.expansionsButton:
                Intent e = new Intent(this, ExpansionsScreen.class);
                startActivity(e);
                break;
            case R.id.aomButton:
                Intent am = new Intent(this, AOMScreen.class);
                startActivity(am);
                break;
            case R.id.homeButton:
                Intent home = new Intent(this, TitleScreen.class);
                startActivity(home);
                break;
        }
    }
}
