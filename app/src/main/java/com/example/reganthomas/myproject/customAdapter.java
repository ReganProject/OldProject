package com.example.reganthomas.myproject;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class customAdapter extends ArrayAdapter<String> {
    customAdapter(Context context, String[] unit){
        super(context, R.layout.custom_row, unit);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater aoeInflater = LayoutInflater.from(getContext());
        View customView = aoeInflater.inflate(R.layout.custom_row, parent, false);
        String singleUnitItem = getItem(position);
        TextView unitText = (TextView) customView.findViewById(R.id.lvText);
        ImageView SingleunitImage = (ImageView) customView.findViewById(R.id.unitImage);
        unitText.setText(singleUnitItem);
        switch(position){
            case 0:
                SingleunitImage.setImageResource(R.drawable.archer);
                break;
            case 1:
                SingleunitImage.setImageResource(R.drawable.axeman);
                break;
            case 2:
                SingleunitImage.setImageResource(R.drawable.chariot);
                break;
            case 3:
                SingleunitImage.setImageResource(R.drawable.elephant);
                break;
            case 4:
                SingleunitImage.setImageResource(R.drawable.horse);
                break;
            case 5:
                SingleunitImage.setImageResource(R.drawable.legion);
                break;
            case 6:
                SingleunitImage.setImageResource(R.drawable.slinger);
                break;
            case 7:
                SingleunitImage.setImageResource(R.drawable.villager);
                break;
        }
        return customView;
    }
}
