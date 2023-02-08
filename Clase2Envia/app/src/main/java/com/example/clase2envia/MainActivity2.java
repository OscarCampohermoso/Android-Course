package com.example.clase2envia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tvrecibido;
    Button btva1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvrecibido = findViewById(R.id.tvRecibido);
        btva1 = findViewById(R.id.btVolverA1);

        String clave = getIntent().getStringExtra("clave");
        String nombre = getIntent().getStringExtra("nombre");
        String mensaje_final = "Clave: " + clave + " Nombre: " + nombre;
        tvrecibido.setText(mensaje_final);

        btva1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // back to the other activity or simple back
                finish();
            }
        });
    }
}