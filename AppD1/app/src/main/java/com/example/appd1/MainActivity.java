package com.example.appd1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bta, btb, btc, btd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bta = findViewById(R.id.btA);
        btb = findViewById(R.id.btB);
        btc = findViewById(R.id.btC);
        btd = findViewById(R.id.btD);

        bta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable bgtmp = bta.getBackground();
                String msgtmp = bta.getText().toString();
                // check if background is not white
                if (((ColorDrawable) btb.getBackground()).getColor() == Color.WHITE && ((ColorDrawable) bta.getBackground()).getColor() != Color.WHITE ) {
                    bta.setBackground(btb.getBackground()); // set background
                    bta.setText(btb.getText()); // set text
                    btb.setBackground(bgtmp); // set background
                    btb.setText(msgtmp);   // set text
                }
                // check if bta and btd are white if so swap in the white space
                if (((ColorDrawable) bta.getBackground()).getColor() != Color.WHITE && ((ColorDrawable) btc.getBackground()).getColor() == Color.WHITE) {
                    bta.setBackground(btc.getBackground()); // set background
                    bta.setText(btc.getText()); // set text
                    btc.setBackground(bgtmp); // set background
                    btc.setText(msgtmp);   // set text
                }
            }
        });
        btb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable bgtmp = btb.getBackground();
                String msgtmp = btb.getText().toString();

                if (((ColorDrawable) btb.getBackground()).getColor() != Color.WHITE && ((ColorDrawable) bta.getBackground()).getColor() == Color.WHITE ) {
                    btb.setBackground(bta.getBackground()); // set background
                    btb.setText(bta.getText()); // set text
                    bta.setBackground(bgtmp); // set background
                    bta.setText(msgtmp);   // set text
                }
                // bt b and bt d
                if (((ColorDrawable) btb.getBackground()).getColor() != Color.WHITE && ((ColorDrawable) btd.getBackground()).getColor() == Color.WHITE ) {
                    btb.setBackground(btd.getBackground()); // set background
                    btb.setText(btd.getText()); // set text
                    btd.setBackground(bgtmp); // set background
                    btd.setText(msgtmp);   // set text
                }
            }
        });
        btc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable bgtmp = btc.getBackground();
                String msgtmp = btc.getText().toString();

                if (((ColorDrawable) btc.getBackground()).getColor() != Color.WHITE && ((ColorDrawable) btd.getBackground()).getColor() == Color.WHITE ) {
                    btc.setBackground(btd.getBackground()); // set background
                    btc.setText(btd.getText()); // set text
                    btd.setBackground(bgtmp); // set background
                    btd.setText(msgtmp);   // set text
                }
                if (((ColorDrawable) btc.getBackground()).getColor() != Color.WHITE && ((ColorDrawable) bta.getBackground()).getColor() == Color.WHITE ) {
                    btc.setBackground(bta.getBackground()); // set background
                    btc.setText(bta.getText()); // set text
                    bta.setBackground(bgtmp); // set background
                    bta.setText(msgtmp);   // set text
                }
            }
        });

        btd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable bgtmp = btd.getBackground();
                String msgtmp = btd.getText().toString();

                if (((ColorDrawable) btd.getBackground()).getColor() != Color.WHITE && ((ColorDrawable) btb.getBackground()).getColor() == Color.WHITE ) {
                    btd.setBackground(btb.getBackground()); // set background
                    btd.setText(btb.getText()); // set text
                    btb.setBackground(bgtmp); // set background
                    btb.setText(msgtmp);   // set text
                }
                if (((ColorDrawable) btd.getBackground()).getColor() != Color.WHITE && ((ColorDrawable) btc.getBackground()).getColor() == Color.WHITE ) {
                    btd.setBackground(btc.getBackground()); // set background
                    btd.setText(btc.getText()); // set text
                    btc.setBackground(bgtmp); // set background
                    btc.setText(msgtmp);   // set text
                }
            }
        });
    }
}