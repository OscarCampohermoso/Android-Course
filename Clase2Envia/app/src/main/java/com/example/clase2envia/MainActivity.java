package com.example.clase2envia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etclave;
    EditText etnombre;
    Button btia2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etclave = findViewById(R.id.etClave);
        etnombre = findViewById(R.id.etNombre);
        btia2 = findViewById(R.id.btA2);

        btia2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String clave = etclave.getText().toString();
                String nombre = etnombre.getText().toString();

                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                // Intent is a message object that is used to communicate between components
                i.putExtra("clave", clave);
                // putExtra is a method that adds extended data to the intent
                // because the intent is a message object, it can carry data types as key-value pairs
                i.putExtra("nombre", nombre);
                startActivity(i);
            }
        });


    }
}