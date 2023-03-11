package com.example.menu1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    FragmentHome fragmentHome;
    RedFragment fragmentRed;
    GreenFragment fragmentGreen;
    BlueFragment fragmentBlue;
    YellowFragment fragmentYellow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // add a home icon in the toolbar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_home_round);

        fragmentHome = new FragmentHome();
        fragmentRed = new RedFragment();
        fragmentGreen = new GreenFragment();
        fragmentBlue = new BlueFragment();
        fragmentYellow = new YellowFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.flContainer, fragmentHome ).commit();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_layout, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mnuRojo:
                getSupportFragmentManager().beginTransaction().replace(R.id.flContainer, fragmentRed).commit();
                Toast.makeText(this, "Item a rojo", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mnuVerde:
                getSupportFragmentManager().beginTransaction().replace(R.id.flContainer, fragmentGreen).commit();
                Toast.makeText(this, "Item verde", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mnuAzul:
                getSupportFragmentManager().beginTransaction().replace(R.id.flContainer, fragmentBlue).commit();
                Toast.makeText(this, "Item azul", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mnuAmarillo:
                getSupportFragmentManager().beginTransaction().replace(R.id.flContainer, fragmentYellow).commit();
                Toast.makeText(this, "Item amarillo", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);

    }
}