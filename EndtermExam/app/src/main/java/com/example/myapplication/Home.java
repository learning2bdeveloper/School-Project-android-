package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class Home extends AppCompatActivity {

    private Intent intent;

    private Button buttoncsv;

    private ImageView necklaceView;
    private ImageView braceletView;
    private ImageView earringView;
    private ImageView ringView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        buttoncsv = (Button) findViewById(R.id.csvbutton);
        necklaceView = (ImageView) findViewById(R.id.necklaceImageView);
        braceletView = (ImageView) findViewById(R.id.braceletImageView);
        earringView = (ImageView) findViewById(R.id.earringImageView);
        ringView = (ImageView) findViewById(R.id.ringImageView);


        buttoncsv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 intent = new Intent(Home.this, csvoutput.class);
                startActivity(intent);
            }
        });

        necklaceView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 intent = new Intent(Home.this, Necklace.class);
                startActivity(intent);
            }
        });

        braceletView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 intent = new Intent(Home.this, Bracelet.class);
                startActivity(intent);
            }
        });

        earringView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Home.this, Earring.class);
                startActivity(intent);
            }
        });

        ringView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Home.this, Ring.class);
                startActivity(intent);
            }
        });

    }
}
