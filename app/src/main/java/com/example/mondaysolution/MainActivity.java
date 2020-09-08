package com.example.mondaysolution;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Spinner sellorcategory;
    String[] sellor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sellorcategory = (Spinner) findViewById(R.id.sellcategory);
        sellor = getResources().getStringArray(R.array.sellercategory);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,sellor);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sellorcategory.setAdapter(adapter);
    }
}
