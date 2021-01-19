package com.example.app05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // inflation (인플레이션) : 레이아웃을 붙여주는 것
        // 액티비티 실행될때 레이아웃 객체의 상수값을 넣어서 보여준다
        // R클래스에서 참조형 주소를 상수값으로 관리

        /*tabhost*/

        TabHost tabHost = findViewById(R.id.tabhost);
        tabHost.setup();

        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("ARTIST").setIndicator("가수별");
        tabSpec2.setContent(R.id.tabArtist);
        tabHost.addTab(tabSpec2);

        TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("ALBUM").setIndicator("앨범별");
        tabSpec3.setContent(R.id.tabAlbum);
        tabHost.addTab(tabSpec3);

        tabHost.setCurrentTab(0);
        //시작될때 출력하는 탭


        /*viewFlipper*/

        Button btnPrev, btnNext;
        final ViewFlipper viewFlipper;

        btnPrev = (Button) findViewById(R.id.btnPrev);
        btnNext = (Button) findViewById(R.id.btnNext);
        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper1);

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.showPrevious();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.showNext();
            }
        });


    }
}
