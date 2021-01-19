package com.example.adapterview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    EditText edit;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 초기화 하면서 객체생성만 한것임.. onCreate
        // AppCompatActivity 안에 메서드가 실행되어야 화면띄움..
        // 엑티비티가 실행될때 초기화할 것이 있으면 여기에 집어 넣는다..
        // 액티비티를 초기화 하면서 객체생성
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1.데이터 준비 (array, arrylist 준비)
        //final String[] food = {"떡볶이","짜장면","마카롱"}; 배열은 크기가 정해져있으므로 어레이리스트로 바꾼다!
        final ArrayList<String> food = new ArrayList<>();
        food.add("마들렌");
        food.add("마카롱");
        food.add("케이크");

        //2.view객체를 준비
        listView = findViewById(R.id.listView1);

        //3.adpaper를 준비
        // 1)어디서쓸건지-이 클래스 this / Context 단위..안드로이드에서는 액티비티를 말함, 보통의 프레임워크에서는 프로젝트를 단위라고함
        // 2)어떤 모양인지.. 방식인지
        // 3)데이터
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,food);

        //4.view에 adapter를 지정 / 설정
        listView.setAdapter(adapter);

        //5.하나의 item 마다 어떻게 처리할지 이벤트 지정
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(),food[position],Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),food.get(position),Toast.LENGTH_SHORT).show();
            }
        });

        //추가하기 버튼
        button = findViewById(R.id.button);
        edit = findViewById(R.id.edit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1. 버튼을 클릭하면 arraylist에 추가가 된다
                food.add(edit.getText().toString());

                //2.adapter에게 데이터의 변경이 있음을 알려주어야 한다.
                adapter.notifyDataSetChanged();
            }
        });

    }
}
