package com.example.aurora.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.aurora.R;
import com.example.aurora.models.Service;

import java.util.ArrayList;

public class ServiceAdapter extends BaseAdapter {

    Context context;
    ArrayList<Service> list;

    public ServiceAdapter(Context context, ArrayList<Service> list) {
        this.context = context;
        this.list = list;
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

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_service, null);

        TextView name = view.findViewById(R.id.textName);
        TextView description = view.findViewById(R.id.textDescription);

        Service service = list.get(position);

        name.setText(service.getName());
        description.setText(service.getDescription());

        return view;
    }
}