package com.example.movie;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<SampleData> movieDataList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.InitializeMovieData();

        ListView listView = (ListView)findViewById(R.id.listView);
        final MyAdapter myAdapter = new MyAdapter(this,movieDataList);

        listView.setAdapter(myAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id){
                Toast.makeText(getApplicationContext(),
                        myAdapter.getItem(position).getMovieName(),
                        Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                intent.putExtra("title",myAdapter.getItem(position).getMovieName());
                startActivity(intent);
            }
        });
    }

    public void InitializeMovieData()
    {
        movieDataList = new ArrayList<SampleData>();


        movieDataList.add(new SampleData(R.drawable.m1, "원더우먼","예매율 32.9%"));
        movieDataList.add(new SampleData(R.drawable.m2, "라라랜드","예매율 9.4%"));
        movieDataList.add(new SampleData(R.drawable.m3, "화양연화 리마스터링","예매율 7.8%"));
        movieDataList.add(new SampleData(R.drawable.m4, "비긴어게인","예매율 5.1%"));


    }
}