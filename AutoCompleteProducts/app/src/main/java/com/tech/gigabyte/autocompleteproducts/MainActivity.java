package com.tech.gigabyte.autocompleteproducts;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    //Product data
    String[] products = {"HP Injet Printer", "Rebook Shoes", "Shirts",
            "T-Shirt", "T-mobile", "Sprint", "Lime-rode",
            "iPhone", "Android", "Logitech", "Antivirus"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating the instance of ArrayAdapter containing list of language names
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, products);

        //Getting the instance of AutoCompleteTextView
        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);

        actv.setThreshold(1);//will start working from first character

        actv.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView

        actv.setTextColor(Color.BLACK);

    }

}