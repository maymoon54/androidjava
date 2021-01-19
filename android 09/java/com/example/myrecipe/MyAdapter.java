package com.example.myrecipe;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    Context mContext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<list_item> list;

    public MyAdapter(Context context, ArrayList<list_item> data) {
        mContext = context;
        list = data;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public list_item getItem(int position) {
        return list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.item, null);

        ImageView icon = (ImageView)view.findViewById(R.id.icon);
        TextView title = (TextView)view.findViewById(R.id.title);
        TextView name = (TextView)view.findViewById(R.id.name);

        String fileStr ="file:///sdcard/DCIM/Camera/" + list.get(position).getImg();
        Uri uri = Uri.parse(fileStr);
        icon.setImageURI(uri);
        title.setText(list.get(position).getTitle());
        name.setText("by " + list.get(position).getName());

        return view;
    }
}