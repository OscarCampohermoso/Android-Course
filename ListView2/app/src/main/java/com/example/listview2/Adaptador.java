package com.example.listview2;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    Context context;

    ArrayList<ModeloItem> lista = new ArrayList<ModeloItem>();

    public Adaptador(Context context, ArrayList<ModeloItem> lista) {
        this.context = context;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ModeloItem item = lista.get(position);
        convertView = LayoutInflater.from(context).inflate(R.layout.layout_item, null);
        ImageView ivfoto = convertView.findViewById(R.id.ivImagen);
        TextView tvtitulo = convertView.findViewById(R.id.tvTitulo);
        TextView tvdetalle = convertView.findViewById(R.id.tvDetalle);

        ivfoto.setImageResource(item.getFoto());
        tvtitulo.setText(item.getTitulo());
        tvdetalle.setText(item.getDetalle());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // change background color to random color
                Drawable background = v.getBackground();
//                if (((ColorDrawable) v.getBackground()).getColor() == Color.WHITE){
//                    v.setBackgroundColor(Color.rgb(0, 255, 0));
//                } else if (((ColorDrawable) v.getBackground()).getColor() == Color.rgb(0, 255, 0)){
//                    v.setBackgroundColor(Color.WHITE);
//                }
            }
        });

        return convertView;
    }
}
