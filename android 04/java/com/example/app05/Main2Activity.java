package com.example.app05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    ImageView img;
    TextView title, theater, date;

    int[] image =  {R.drawable.np, R.drawable.cats, R.drawable.monte, R.drawable.bm};
    String[] what =  {"노트르담 파리","뮤지컬 <캣츠>","몬테크리스토","블랙메리포핀스"};
    String[] when =  {"2020.12.10 ~ 2021.01.17","2020.12.11 ~ 2021.01.09","2020.11.17 ~ 2021.03.07","2020.09.29 ~ 2021.01.03"};
    String[] where =  {"블루스퀘어 인터파크홀","계명아트센터","LG아트센터","대학로TOM1관"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /*tabhost*/
        TabHost tabHost = findViewById(R.id.musical);
        tabHost.setup();

        /*탭 하나씩 정의*/
        TabHost.TabSpec tabSpec4 = tabHost.newTabSpec("ori").setIndicator("오리지널/내한");
        tabSpec4.setContent(R.id.tab1);
        tabHost.addTab(tabSpec4);

        TabHost.TabSpec tabSpec5 = tabHost.newTabSpec("lic").setIndicator("라이선스");
        tabSpec5.setContent(R.id.tab2);
        tabHost.addTab(tabSpec5);

        TabHost.TabSpec tabSpec6 = tabHost.newTabSpec("cre").setIndicator("창작뮤지컬");
        tabSpec6.setContent(R.id.tab3);
        tabHost.addTab(tabSpec6);

        title = findViewById(R.id.title);
        theater = findViewById(R.id.theater);
        date = findViewById(R.id.date);
        img = findViewById(R.id.img);

        title.setText(what[0]);
        img.setImageResource(image[0]);
        date.setText(when[0]);
        theater.setText(where[0]);

        title = findViewById(R.id.title1);
        theater = findViewById(R.id.theater1);
        date = findViewById(R.id.date1);
        img = findViewById(R.id.img1);

        title.setText(what[1]);
        img.setImageResource(image[1]);
        date.setText(when[1]);
        theater.setText(where[1]);

        title = findViewById(R.id.title2);
        theater = findViewById(R.id.theater2);
        date = findViewById(R.id.date2);
        img = findViewById(R.id.img2);

        title.setText(what[2]);
        img.setImageResource(image[2]);
        date.setText(when[2]);
        theater.setText(where[2]);

        title = findViewById(R.id.title3);
        theater = findViewById(R.id.theater3);
        date = findViewById(R.id.date3);
        img = findViewById(R.id.img3);

        title.setText(what[3]);
        img.setImageResource(image[3]);
        date.setText(when[3]);
        theater.setText(where[3]);
    }
}
