package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class MyFruitsAdapter extends ArrayAdapter<MyFruits> {

    public MyFruitsAdapter(Context context, MyFruits[] arr) {
        super(context, R.layout.adapter_item, arr);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final MyFruits month = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_item, null);
        }

        ((TextView) convertView.findViewById(R.id.textView)).setText(month.month);
        ((ImageView) convertView.findViewById(R.id.imageView)).setImageResource(month.image);


        return convertView;
    }
}