package com.example.movie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    TextView name;
    Button call, call2, call3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //메인액티비티에서 넘어온 영화제목 받기
        final Intent intent = getIntent();
        final String title = intent.getStringExtra("title");

        name = findViewById(R.id.name);
        call = findViewById(R.id.call);
        call2 = findViewById(R.id.call2);
        call3 = findViewById(R.id.call3);

        name.setText(title + " 예매하기");
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:15441122");
                Intent intent1 = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent1);
            }
        });

        call2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent2);
            }
        });

        call3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.cgv.co.kr/movies/");
                Intent intent3 = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent3);
            }
        });


    }
}
