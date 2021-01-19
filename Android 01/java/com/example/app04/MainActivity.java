package com.example.app04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView img;
    Button next;
    Button search;
    Button b2;
    EditText input;
    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("11월 가볼만한 여행지");

        img = findViewById(R.id.img);
        next = findViewById(R.id.next);
        search = findViewById(R.id.search);
        input = findViewById(R.id.input);
        b2 = findViewById(R.id.b2);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag++;
                System.out.println(flag);
                if (flag == 0) {
                    img.setImageResource(R.drawable.k1);
                } else if (flag == 1) {
                    img.setImageResource(R.drawable.k2);
                } else if (flag == 2) {
                    img.setImageResource(R.drawable.k3);
                } else if (flag == 3) {
                    img.setImageResource(R.drawable.k4);
                    flag = -1;
                }
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri = "https://www.google.com/search?q=" + input.getText().toString() + "여행";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);
            }
        });


    }
}
