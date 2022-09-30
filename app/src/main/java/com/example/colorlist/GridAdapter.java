package com.example.colorlist;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import java.util.ArrayList;

public class GridAdapter extends ArrayAdapter<ColorNameModel> {

    private ArrayList<ColorNameModel> listColorName;
    Context myContext;
    int myResource;
    GridView myGridView;
    TextView myTextView;
    ImageView myImageView;
    CardView showLayout;


    public GridAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ColorNameModel> objects, TextView hexShow, ImageView imageView, CardView showLayout) {
        super(context, resource, objects);
        myContext=context;
        myResource=resource;
        this.myTextView=hexShow;
        this.myImageView=imageView;
        this.showLayout=showLayout;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {

            LayoutInflater layoutInflater = LayoutInflater.from(myContext);
            convertView=layoutInflater.inflate(myResource,parent,false);

            ImageView imgColor = (ImageView)convertView.findViewById(R.id.imageColorItem);
            TextView nameColor = (TextView)convertView.findViewById(R.id.nameColorItem);

            imgColor.setBackgroundColor(Color.parseColor("#"+getItem(position).getHexCode()));
            nameColor.setText("#"+getItem(position).getNameColor());


            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String hexCode="#"+getItem(position).getHexCode();
                    int RR= Integer.valueOf(hexCode.substring(1,3),16);
                    int GG= Integer.valueOf(hexCode.substring(3,5),16);
                    int BB= Integer.valueOf(hexCode.substring(5,7),16);


                    myTextView.setText("HEX: #"+getItem(position).getHexCode().toUpperCase()+" / RGB("+RR+","+GG+","+BB+")");
                    myImageView.setBackgroundColor(Color.parseColor("#"+getItem(position).getHexCode()));
                    showLayout.setVisibility(View.VISIBLE);


                }
            });

            return  convertView;
        }
}
