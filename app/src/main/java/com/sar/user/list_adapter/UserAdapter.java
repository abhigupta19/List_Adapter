package com.sar.user.list_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;

import java.util.List;

public class UserAdapter extends BaseAdapter {
    private ListView listView;
    private List<String> list;
    Context context;

    public UserAdapter(Context context,ListView listView, List<String> list) {
        this.listView = listView;
        this.list = list;
        this.context=context;
    }

    @Override
    public int getCount() {
        return list.size();
    }


    @Override
    public Object getItem(int position) {
        return list.get(position);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
           View view=LayoutInflater.from(context).inflate(R.layout.card,parent,false);
        TextView textView=view.findViewById(R.id.textView);
        textView.setText(list.get(position));
        return view;
    }
}
