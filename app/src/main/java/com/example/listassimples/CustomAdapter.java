package com.example.listassimples;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    Context context;
    List<Mercurio> lst;

    public CustomAdapter(Context context, List<Mercurio> lst) {
        this.context = context;
        this.lst = lst;
    }

    @Override
    public int getCount() {
        return lst.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView ImageViewMercurio;
        TextView TextViewNombre;
        TextView TextViewDes;

        Mercurio m=lst.get(i);

        if (view==null)
            view= LayoutInflater.from(context).inflate(R.layout.listview_planetas,null);

        ImageViewMercurio=view.findViewById(R.id.imageViewMercurio);
        TextViewNombre=view.findViewById(R.id.textViewNombre);
        TextViewDes=view.findViewById(R.id.textView2Des);

        ImageViewMercurio.setImageResource(m.Mercurio);
        TextViewNombre.setText(m.Mercurio);
        TextViewDes.setText(m.Des);

        return view;
    }
}
