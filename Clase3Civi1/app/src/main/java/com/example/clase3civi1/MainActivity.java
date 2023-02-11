package com.example.clase3civi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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

        Log.d("Ciclo de vida", "onCreate() dentro de A1");

        tvinvocaa2 = findViewById(R.id.tvInvocaA2);

        tvinvocaa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String clave = etclave.getText().toString().trim();
//                String nombre = etnombre.getText().toString().trim();
//                if (clave.length() > 0 && nombre.length() > 0){
//                    bolsa.putInt("clave", Integer.parseInt(etclave.getText().toString()));
//                    bolsa.putString("nombre", etnombre.getText().toString());
//                    Intent invocador = new Intent(MainActivity.this, MainActivity2.class);
//                    invocador.putExtras(bolsa);
//                    startActivity(invocador);
//                } else{
//                    Toast.makeText(MainActivity.this, "Faltan datos", Toast.LENGTH_LONG).show();
//                }
                try{
                    bolsa.putInt("clave", Integer.parseInt(etclave.getText().toString()));
                    bolsa.putString("nombre", etnombre.getText().toString());
                    Intent invocador = new Intent(MainActivity.this, MainActivity2.class);
                    invocador.putExtras(bolsa);
                    startActivity(invocador);
                }catch(Exception e){
                    Toast.makeText(MainActivity.this, "Faltan datos: " + e.getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    // Ciclo de vida de un activity
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Ciclo de vida", "onStart() dentro de A1");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Ciclo de vida", "onResume() dentro de A1");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Ciclo de vida", "onPause() dentro de A1");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Ciclo de vida", "onStop() dentro de A1");
    }

//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
//    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Ciclo de vida", "onRestart() dentro de A1");
    }

}