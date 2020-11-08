package com.example.crudmysql.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.crudmysql.MainActivity;
import com.example.crudmysql.R;
import com.example.crudmysql.data.Data;

import java.util.List;

public class Adapter extends BaseAdapter {
    Activity activity;
    LayoutInflater inflater;
    List<Data> items;

    public Adapter(Activity activity, List<Data> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int location) {
        return items.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null)
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null)
            convertView = inflater.inflate(R.layout.list_row, null);

        TextView id = (TextView) convertView.findViewById(R.id.id);
        TextView nama = (TextView) convertView.findViewById(R.id.nama);
        TextView posisi = (TextView) convertView.findViewById(R.id.posisi);
        TextView gajih = (TextView) convertView.findViewById(R.id.gajih);

        Data data = items.get(position);

        id.setText(data.getId());
        nama.setText(data.getNama());
        posisi.setText(data.getPosisi());
        gajih.setText(data.getGajih());

        return convertView;
    }
}
