package com.example.myapplication41;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView weight;
    private TextView height;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        weight = (TextView)findViewById(R.id.weightinput);
        height = (TextView)findViewById(R.id.heightinput);

        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String weightinput = weight.getText().toString();
                String heightinput = height.getText().toString();

                if (weightinput.isEmpty() || heightinput.isEmpty()) {
                    Toast.makeText(MainActivity.this, "An input is missing!", Toast.LENGTH_SHORT).show();
                } else {

                    double userweight = Double.parseDouble(weightinput);
                    double userheight = Double.parseDouble(heightinput);
                    int semiOutput =(int)Math.pow(userheight,2);
                    double output = userweight/semiOutput;
                    String BMI = Double.toString(output);

                    Toast.makeText(MainActivity.this, "BMI: " + BMI, Toast.LENGTH_SHORT).show();


            }

            }

        });



    }
}