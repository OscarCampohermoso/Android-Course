package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] paises = {"Argentina", "Brasil", "Chile", "Colombia", "Ecuador", "Paraguay", "Perú", "Uruguay", "Venezuela", "Bolivia"};
    String[] poblacion = {"44", "209", "18", "49", "16", "7", "31", "3", "28", "11"};

    ListView lvdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvdata = findViewById(R.id.lvdata);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, paises);
        lvdata.setAdapter(adapter);

        lvdata.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, " pais"+lvdata.getItemAtPosition(position)+" poblacion = " + poblacion[position] + "mill", Toast.LENGTH_SHORT).show();
            }
        });
    }
}