package com.example.app004;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;

public class Main9Activity extends AppCompatActivity {

    MultiAutoCompleteTextView multi;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        String[] caffe = {"americano", "latte", "juice", "water", "cake", "chocolate", "wifi"};
        button = findViewById(R.id.button3);
        multi = findViewById(R.id.multiAutoCompleteTextView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, caffe);


        MultiAutoCompleteTextView.CommaTokenizer token = new MultiAutoCompleteTextView.CommaTokenizer();
        multi.setAdapter(adapter);



    }
}
