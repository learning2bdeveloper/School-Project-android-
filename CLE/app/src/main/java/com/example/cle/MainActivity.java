package com.example.cle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridlayout);

        ImageView roadbike = findViewById(R.id.imageViewRoadbike);
        ImageView mountainbike = findViewById(R.id.imageViewMountainbike);
        ImageView foldingbike = findViewById(R.id.imageViewFoldingbike);
        ImageView electricbike = findViewById(R.id.imageViewElectricbike);
        ImageView gravelbike = findViewById(R.id.imageViewGravelbike);

        roadbike.setOnClickListener(this);
        mountainbike.setOnClickListener(this);
        foldingbike.setOnClickListener(this);
        electricbike.setOnClickListener(this);
        gravelbike.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.imageViewRoadbike:
                Intent intent = new Intent(this, MainActivity2.class);
                startActivity(intent);
                break;
            case R.id.imageViewMountainbike:
                intent = new Intent(this, MainActivity3.class);
                startActivity(intent);
                break;
            case R.id.imageViewGravelbike:
                intent = new Intent(this, MainActivity4.class);
                startActivity(intent);
                break;
            case R.id.imageViewFoldingbike:
                intent = new Intent(this, MainActivity5.class);
                startActivity(intent);
                break;
            case R.id.imageViewElectricbike:
                intent = new Intent(this, MainActivity6.class);
                startActivity(intent);
                break;
            default:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}