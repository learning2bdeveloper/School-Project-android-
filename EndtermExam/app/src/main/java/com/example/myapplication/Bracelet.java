package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class Bracelet extends AppCompatActivity {

    private RadioGroup radioGroup_materials;
    private RadioGroup radioGroup_prices;
    private Button button_order_bracelet;
    private RadioButton radioButtonMaterial;
    private RadioButton  radioButtonPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bracelet);

        radioGroup_materials = (RadioGroup) findViewById(R.id.radioGroup_bracelet_materials);
        radioGroup_prices = (RadioGroup) findViewById(R.id.radioGroup_bracelet_prices);

        button_order_bracelet = (Button) findViewById(R.id.button_order_bracelet);

        button_order_bracelet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int radioMaterial = radioGroup_materials.getCheckedRadioButtonId();
                int radioPrice = radioGroup_prices.getCheckedRadioButtonId();

                radioButtonMaterial = (RadioButton) findViewById(radioMaterial);
                radioButtonPrice = (RadioButton) findViewById(radioPrice);

                if (radioButtonPrice.getText().equals("Retail") && radioButtonMaterial.getText().equals("Gold")) {
                    Toast.makeText(Bracelet.this, "Overhead is 4500, Labor is 6000, Gold bracelet is 14820 = 25320 (retail price).", Toast.LENGTH_LONG).show();
                }

                if (radioButtonPrice.getText().equals("WholeSale") && radioButtonMaterial.getText().equals("Gold")) {
                    Toast.makeText(Bracelet.this, "Overhead is 4500, Labor is 6000, Gold bracelet is 14820 = 25320 x 20 = 506400 /2 = 253200(wholesale price) .Only legible for wholesale if 20 orders or more!", Toast.LENGTH_LONG).show();
                }

                if (radioButtonPrice.getText().equals("Retail") && radioButtonMaterial.getText().equals("Silver")) {
                    Toast.makeText(Bracelet.this, "Overhead is 4500, Labor is 6000, Silver bracelet is 1729 = 12299 (retail price).", Toast.LENGTH_LONG).show();
                }

                if (radioButtonPrice.getText().equals("WholeSale") && radioButtonMaterial.getText().equals("Silver")) {
                    Toast.makeText(Bracelet.this, "Overhead is 4500, Labor is 6000, Silver bracelet is 1729 = 12299 x 20 = 244580 /2 = 122290(wholesale price) .Only legible for wholesale if 20 orders or more!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
