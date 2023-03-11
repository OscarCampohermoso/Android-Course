package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    HomeFragment homeFragment;
    RedFragment redFragment;
    GreenFragment greenFragment;
    VioletFragment violetFragment;

    Button bthome, btred, btgreen, btviolet;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homeFragment = new HomeFragment();
        redFragment = new RedFragment();
        greenFragment = new GreenFragment();
        violetFragment = new VioletFragment();

        bthome = findViewById(R.id.btHome);
        btred = findViewById(R.id.btRed);
        btgreen = findViewById(R.id.btGreen);
        btviolet = findViewById(R.id.btViolet);
        btgreen.setOnClickListener(this);
        btred.setOnClickListener(this);
        bthome.setOnClickListener(this);
        btviolet.setOnClickListener(this);

        getSupportFragmentManager().beginTransaction().add(R.id.flContainer, homeFragment).commit();


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btHome:
                getSupportFragmentManager().beginTransaction().replace(R.id.flContainer, homeFragment).commit();
                break;
            case R.id.btRed:
                getSupportFragmentManager().beginTransaction().replace(R.id.flContainer, redFragment).commit();
                break;
            case R.id.btGreen:
                getSupportFragmentManager().beginTransaction().replace(R.id.flContainer, greenFragment).commit();
                break;
            case R.id.btViolet:
                getSupportFragmentManager().beginTransaction().replace(R.id.flContainer, violetFragment).commit();
                break;
        }
    }
}