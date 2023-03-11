package com.example.listview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvdata;
    ArrayList<ModeloItem> lista = new ArrayList<ModeloItem>();
    Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvdata = findViewById(R.id.lvData);
        lista = new ArrayList<>();
        adaptador = new Adaptador(this, lista);
        lvdata.setAdapter(adaptador);

        cargarDatos();

    }

    private void cargarDatos() {
        lista.add(new ModeloItem(R.drawable.ic_launcher_background, "Adidas", "Adidas"));
        lista.add(new ModeloItem(R.drawable.ic_launcher_background, "Nike", "No inventes, ke kieres"));
        lista.add(new ModeloItem(R.drawable.ic_launcher_background, "Puma", "Pumas unidos"));
        lista.add(new ModeloItem(R.drawable.ic_launcher_background, "Reebok", "Reebok"));
        lista.add(new ModeloItem(R.drawable.ic_launcher_background, "Vans", "Vans"));
        lista.add(new ModeloItem(R.drawable.ic_launcher_background, "Converse", "Converse"));
    }
}