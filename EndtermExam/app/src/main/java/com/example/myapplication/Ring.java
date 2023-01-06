package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Ring extends AppCompatActivity {

    private RadioGroup radioGroup_materials;
    private RadioGroup radioGroup_prices;
    private Button button_order_ring;
    private RadioButton radioButtonMaterial;
    private RadioButton  radioButtonPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ring);

        radioGroup_materials = (RadioGroup) findViewById(R.id.radioGroup_ring_materials);
        radioGroup_prices = (RadioGroup) findViewById(R.id.radioGroup_ring_prices);

        button_order_ring = (Button) findViewById(R.id.button_order_ring);

        button_order_ring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int radioMaterial = radioGroup_materials.getCheckedRadioButtonId();
                int radioPrice = radioGroup_prices.getCheckedRadioButtonId();

                radioButtonMaterial = (RadioButton) findViewById(radioMaterial);
                radioButtonPrice = (RadioButton) findViewById(radioPrice);

                if (radioButtonPrice.getText().equals("Retail") && radioButtonMaterial.getText().equals("Gold")) {
                    Toast.makeText(Ring.this, "Overhead is 4500, Labor is 6000, Gold ring is 6500 = 17000 (retail price).", Toast.LENGTH_LONG).show();
                }

                if (radioButtonPrice.getText().equals("WholeSale") && radioButtonMaterial.getText().equals("Gold")) {
                    Toast.makeText(Ring.this, "Overhead is 4500, Labor is 6000, Gold ring is 6500 = 17000 x 20 = 340000 /2 = 170000(wholesale price) .Only legible for wholesale if 20 orders or more!", Toast.LENGTH_LONG).show();
                }

                if (radioButtonPrice.getText().equals("Retail") && radioButtonMaterial.getText().equals("Silver")) {
                    Toast.makeText(Ring.this, "Overhead is 4500, Labor is 6000, Silver ring is 561 = 11061 (retail price).", Toast.LENGTH_LONG).show();
                }

                if (radioButtonPrice.getText().equals("WholeSale") && radioButtonMaterial.getText().equals("Silver")) {
                    Toast.makeText(Ring.this, "Overhead is 4500, Labor is 6000, Silver ring is 561 = 11061   x 20 = 221220 /2 = 110610(wholesale price) .Only legible for wholesale if 20 orders or more!", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}