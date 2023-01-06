package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Necklace extends AppCompatActivity {

    private RadioGroup radioGroup_materials;
    private RadioGroup radioGroup_prices;
    private Button button_order_necklace;
    private RadioButton radioButtonMaterial;
    private RadioButton  radioButtonPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_necklace);

        radioGroup_materials = (RadioGroup) findViewById(R.id.radioGroup_necklace_materials);
        radioGroup_prices = (RadioGroup) findViewById(R.id.radioGroup_necklace_prices);

        button_order_necklace = (Button) findViewById(R.id.button_order_necklace);

        button_order_necklace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int radioMaterial = radioGroup_materials.getCheckedRadioButtonId();
                int radioPrice = radioGroup_prices.getCheckedRadioButtonId();

                radioButtonMaterial = (RadioButton) findViewById(radioMaterial);
                radioButtonPrice = (RadioButton) findViewById(radioPrice);

                if (radioButtonPrice.getText().equals("Retail") && radioButtonMaterial.getText().equals("Gold")) {
                    Toast.makeText(Necklace.this, "Overhead is 4500, Labor is 6000, Gold necklace is 3107 = 13607 (retail price).", Toast.LENGTH_LONG).show();
                }

                if (radioButtonPrice.getText().equals("WholeSale") && radioButtonMaterial.getText().equals("Gold")) {
                    Toast.makeText(Necklace.this, "Overhead is 4500, Labor is 6000, Gold necklace is 3107 = 13607 x 20 = 272140 /2 = 136070(wholesale price) .Only legible for wholesale if 20 orders or more!", Toast.LENGTH_LONG).show();
                }

                if (radioButtonPrice.getText().equals("Retail") && radioButtonMaterial.getText().equals("Silver")) {
                    Toast.makeText(Necklace.this, "Overhead is 4500, Labor is 6000, Silver necklace is 2102 = 12602 (retail price).", Toast.LENGTH_LONG).show();
                }

                if (radioButtonPrice.getText().equals("WholeSale") && radioButtonMaterial.getText().equals("Silver")) {
                    Toast.makeText(Necklace.this, "Overhead is 4500, Labor is 6000, Silver necklace is 2102 = 12602 x 20 = 252040 /2 = 126020(wholesale price) .Only legible for wholesale if 20 orders or more!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}