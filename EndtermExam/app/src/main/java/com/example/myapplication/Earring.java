package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Earring extends AppCompatActivity {

    private RadioGroup radioGroup_materials;
    private RadioGroup radioGroup_prices;
    private Button button_order_earring;
    private RadioButton radioButtonMaterial;
    private RadioButton  radioButtonPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earring);

        radioGroup_materials = (RadioGroup) findViewById(R.id.radioGroup_earring_materials);
        radioGroup_prices = (RadioGroup) findViewById(R.id.radioGroup_earring_prices);

        button_order_earring = (Button) findViewById(R.id.button_order_earring);

        button_order_earring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int radioMaterial = radioGroup_materials.getCheckedRadioButtonId();
                int radioPrice = radioGroup_prices.getCheckedRadioButtonId();

                radioButtonMaterial = (RadioButton) findViewById(radioMaterial);
                radioButtonPrice = (RadioButton) findViewById(radioPrice);

                if (radioButtonPrice.getText().equals("Retail") && radioButtonMaterial.getText().equals("Gold")) {
                    Toast.makeText(Earring.this, "Overhead is 4500, Labor is 6000, Gold earrings is 4000 = 14500 (retail price).", Toast.LENGTH_LONG).show();
                }

                if (radioButtonPrice.getText().equals("WholeSale") && radioButtonMaterial.getText().equals("Gold")) {
                    Toast.makeText(Earring.this, "Overhead is 4500, Labor is 6000, Gold earrings is 4000 = 14500 x 20 = 290000 /2 = 145000(wholesale price) .Only legible for wholesale if 20 orders or more!", Toast.LENGTH_LONG).show();
                }

                if (radioButtonPrice.getText().equals("Retail") && radioButtonMaterial.getText().equals("Silver")) {
                    Toast.makeText(Earring.this, "Overhead is 4500, Labor is 6000, Silver earrings is 460 = 10960 (retail price).", Toast.LENGTH_LONG).show();
                }

                if (radioButtonPrice.getText().equals("WholeSale") && radioButtonMaterial.getText().equals("Silver")) {
                    Toast.makeText(Earring.this, "Overhead is 4500, Labor is 6000, Silver earrings is 460 = 10960 x 20 = 219200 /2 = 109600(wholesale price) .Only legible for wholesale if 20 orders or more!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}