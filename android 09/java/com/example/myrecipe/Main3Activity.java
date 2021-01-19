package com.example.myrecipe;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    ArrayList<list_item> DataList;
    SQLiteDatabase sqLiteDatabase;
    String no = null;
    String title = null;
    String name = null;
    String img = null;
    String date = null;
    String searchText;


    //검색화면

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //넘어온 검색어 받기
        Intent intent = getIntent();
        searchText = "'%" + intent.getStringExtra("input") + "%'";
        System.out.println("넘어온 검색어" + searchText);

        getData();

        ListView listView = (ListView)findViewById(R.id.listView);
        final MyAdapter myAdapter = new MyAdapter(this,DataList);

        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override

            //클릭하면 4번액티비티로 이동하고, 글번호값을 전달해야한다

            public void onItemClick(AdapterView parent, View v, int position, long id){
                Toast.makeText(getApplicationContext(),
                        myAdapter.getItem(position).getTitle(),
                        Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(), Main4Activity.class);
                intent.putExtra("id",myAdapter.getItem(position).getId());
                startActivity(intent);

            }
        });
    }

    //디비에서 값 불러와 ArrayList에 넣어줌
    public void getData(){
        DataList = new ArrayList<list_item>();
        DBHelper dbHelper = new DBHelper(this);
        sqLiteDatabase = dbHelper.getReadableDatabase();
        Cursor cursor;
        cursor = sqLiteDatabase.rawQuery("SELECT * FROM bbs Where title LIKE " + searchText +" OR igd LIKE "+searchText, null);

        while (cursor.moveToNext()){
            no = cursor.getString(0);
            name = cursor.getString(1);
            title = cursor.getString(2);
            img = cursor.getString(5);
            date = cursor.getString(6);

            DataList.add(new list_item(no, name, title, img, date));

        }
        cursor.close();
        sqLiteDatabase.close();


    }
}