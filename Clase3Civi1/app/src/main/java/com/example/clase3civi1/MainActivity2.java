package com.example.clase3civi1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tvrecibido, tvvolvera1;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvrecibido = findViewById(R.id.tvRecibido);
        tvvolvera1 = findViewById(R.id.tvVolverA1);
        Bundle bolsa = getIntent().getExtras();

        Log.d("Ciclo de vida", "onCreate() dentro de A2");


        tvrecibido.setText("Clave: " + String.valueOf(bolsa.getInt("clave"))
                            + " \nNombre: " + bolsa.getString("nombre"));
        tvvolvera1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    // Ciclo de vida de un activity
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Ciclo de vida", "onStart() dentro de A2");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Ciclo de vida", "onResume() dentro de A2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Ciclo de vida", "onPause() dentro de A2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Ciclo de vida", "onStop() dentro de A2");
    }

//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
//    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Ciclo de vida", "onRestart() dentro de A2");
    }
}