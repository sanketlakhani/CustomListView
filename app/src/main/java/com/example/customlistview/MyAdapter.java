package com.example.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    String[] contactList;
    Context mycontext;
    String[] number;

    public MyAdapter(String[] contactList, Context mycontext,String[] number) {

        this.number=number;
        this.contactList = contactList;
        this.mycontext = mycontext;

    }

    @Override
    public int getCount() {
        return contactList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        view = LayoutInflater.from(mycontext).inflate(R.layout.listview_item, null);
        TextView txtView = view.findViewById(R.id.txtView);
        TextView txtNumber = view.findViewById(R.id.txtNumber);

        txtNumber.setText(number[i]);
        txtView.setText(contactList[i]);

        return view;
    }
}
