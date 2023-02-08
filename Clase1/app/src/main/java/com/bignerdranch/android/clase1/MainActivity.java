package com.bignerdranch.android.clase1;

import static com.bignerdranch.android.clase1.R.id.etNumero;
import static com.bignerdranch.android.clase1.R.id.tvResultado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etnumero;
    TextView tvresultado;
    Button btprimo, btnuevo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnumero = findViewById(etNumero);
        tvresultado = findViewById(tvResultado);
        btprimo = findViewById(R.id.btPrimo);
        btnuevo = findViewById(R.id.btNuevo);

        btprimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(etnumero.getText().toString());
                Primo p = new Primo(n);
                if (p.esPrimo()) {
                    tvresultado.setText("El número " + p.getN() + " es primo");
                } else {
                    tvresultado.setText("El número " + p.getN() + " no es primo");
                }

            }
        });
    }

}