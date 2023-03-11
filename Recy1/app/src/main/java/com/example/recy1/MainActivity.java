package com.example.recy1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ModeloItem> lista;
    RecyclerView rvdata;
    Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = new ArrayList<>();
        rvdata = findViewById(R.id.rvData);
        adaptador = new Adaptador(lista);

        rvdata.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
//        rvdata.setLayoutManager(new GridLayoutManager(this, 2));
        rvdata.setAdapter(adaptador);

        cargaDatos();
    }

    void cargaDatos(){
        lista.add(new ModeloItem(R.drawable.ic_launcher_background, "BOLIVIA", "Detalle 1"));
        lista.add(new ModeloItem(R.drawable.ic_launcher_background, "CHILE", "Detalle 2"));
        lista.add(new ModeloItem(R.drawable.ic_launcher_background, "PERU", "Detalle 3"));
        lista.add(new ModeloItem(R.drawable.ic_launcher_background, "ARGENTINA", "Detalle 4"));
        lista.add(new ModeloItem(R.drawable.ic_launcher_background, "COLOMBIA", "Detalle 5"));
        lista.add(new ModeloItem(R.drawable.ic_launcher_background, "ECUADOR", "Detalle 6"));
        lista.add(new ModeloItem(R.drawable.ic_launcher_background, "PARAGUAY", "Detalle 7"));
        lista.add(new ModeloItem(R.drawable.ic_launcher_background, "URUGUAY", "Detalle 8"));
        lista.add(new ModeloItem(R.drawable.ic_launcher_background, "VENEZUELA", "Detalle 9"));
    }
}