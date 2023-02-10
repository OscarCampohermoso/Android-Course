package com.example.clase3civi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etclave, etnombre;
    TextView tvinvocaa2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bolsa = new Bundle();

        etclave = findViewById(R.id.etClave);
        etnombre = findViewById(R.id.etNombre);


        tvinvocaa2 = findViewById(R.id.tvInvocaA2);

        tvinvocaa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String clave = etclave.getText().toString().trim();
                String nombre = etnombre.getText().toString().trim();
                if (clave.length() > 0 && nombre.length() > 0){
                    bolsa.putInt("clave", Integer.parseInt(etclave.getText().toString()));
                    bolsa.putString("nombre", etnombre.getText().toString());
                    Intent invocador = new Intent(MainActivity.this, MainActivity2.class);
                    invocador.putExtras(bolsa);
                    startActivity(invocador);

                } else{
                    Toast.makeText(MainActivity.this, "Faltan datos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}