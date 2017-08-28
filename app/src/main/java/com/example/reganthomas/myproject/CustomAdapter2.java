package com.example.reganthomas.myproject;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter2 extends ArrayAdapter<String>{
    CustomAdapter2(Context context, String[] unit){super(context, R.layout.custom_row, unit);}

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater aoe2Inflater = LayoutInflater.from(getContext());
        View customView = aoe2Inflater.inflate(R.layout.custom_row, parent, false);
        String singleUnitItem = getItem(position);
        TextView unitText = (TextView) customView.findViewById(R.id.lvText);
        ImageView SingleunitImage = (ImageView) customView.findViewById(R.id.unitImage);
        unitText.setText(singleUnitItem);
        switch(position){
            case 0:
                SingleunitImage.setImageResource(R.drawable.champion);
                break;
            case 1:
                SingleunitImage.setImageResource(R.drawable.galleon);
                break;
            case 2:
                SingleunitImage.setImageResource(R.drawable.horse2);
                break;
            case 3:
                SingleunitImage.setImageResource(R.drawable.monk);
                break;
            case 4:
                SingleunitImage.setImageResource(R.drawable.paladin);
                break;
            case 5:
                SingleunitImage.setImageResource(R.drawable.pikeman);
                break;
            case 6:
                SingleunitImage.setImageResource(R.drawable.skirmisher);
                break;
            case 7:
                SingleunitImage.setImageResource(R.drawable.villager2);
                break;
        }
        return customView;
    }
}
