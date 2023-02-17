package com.example.alerta1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btaceptar, btsino, btcustom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btaceptar = findViewById(R.id.btAceptar);
        btsino = findViewById(R.id.btSiNo);
        btcustom = findViewById(R.id.btCustom);
        btaceptar.setOnClickListener(this);
        btsino.setOnClickListener(this);
        btcustom.setOnClickListener(this);
//        btaceptar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                alertaAceptar();
//            }
//        });
    }
    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.btAceptar:
                Toast.makeText(this, "Aceptas vender tu alma", Toast.LENGTH_SHORT).show();
                alertaAceptar();
                break;
            case R.id.btSiNo:
                Toast.makeText(this, "Aceptas vender tu alma?", Toast.LENGTH_SHORT).show();
                alertaSiNo();
                break;
            case R.id.btCustom:
                alertaCustom();
                break;
        }
    }
    void alertaAceptar(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Alerta");
        builder.setMessage("Mensaje de alerta");
        builder.setCancelable(false);
        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }

    void alertaSiNo(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Favor Responda");
        builder.setMessage("Esta segur@ de eliminar?");
        builder.setCancelable(false);
        builder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
//                dialog.cancel();
//                finish();
                dialog.dismiss();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }
    void alertaCustom() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View view = LayoutInflater.from(this).inflate(R.layout.layout_alert, null);
        builder.setView(view);
        builder.setCancelable(false);
        AlertDialog alert = builder.create();
        alert.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        Button btsalir, btaceptar, btcancelar;
        btsalir = view.findViewById(R.id.btSalir);
        btaceptar = view.findViewById(R.id.btAceptar);
        btcancelar = view.findViewById(R.id.btCancelar);
        btsalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert.dismiss();
            }
        });
        btaceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert.dismiss();
            }
        });
        btcancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert.dismiss();
            }
        });
        alert.show();
    }
}