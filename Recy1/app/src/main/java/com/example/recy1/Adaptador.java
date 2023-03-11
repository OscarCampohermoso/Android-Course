package com.example.recy1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    ArrayList<ModeloItem> lista;

    public Adaptador(ArrayList<ModeloItem> lista) {
        this.lista = lista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_2, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador.ViewHolder holder, int position) {
        holder.ivfoto.setImageResource(lista.get(position).getFoto());
        holder.tvtitulo.setText(lista.get(position).getTitulo());
        holder.tvdetalle.setText(lista.get(position).getDetalle());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivfoto;
        TextView tvtitulo, tvdetalle;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivfoto = itemView.findViewById(R.id.ivFoto);
            tvtitulo = itemView.findViewById(R.id.tvTitulo);
            tvdetalle = itemView.findViewById(R.id.tvDetalle);
        }
    }
}
