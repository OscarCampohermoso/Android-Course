package com.example.clase3civi1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
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

        tvrecibido.setText("Clave: " + String.valueOf(bolsa.getInt("clave"))
                            + " Nombre: " + bolsa.getString("nombre"));
        tvvolvera1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}