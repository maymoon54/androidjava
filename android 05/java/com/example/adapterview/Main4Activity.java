package com.example.adapterview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    int[] posterID;
    String[] title;
    int[] like;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent intent = getIntent();
        posterID = intent.getIntArrayExtra("posterID");
        title = intent.getStringArrayExtra("title");
        like = intent.getIntArrayExtra("like");

       //Toast.makeText(getApplicationContext(), posterID.length + " " + title[0] + " " + like[0], Toast.LENGTH_SHORT).show();

        //1. 데이터를 지정

        //2. view객체 지정
        listView = findViewById(R.id.listView1);

        //3. adapter를 생성
       MyListAdapter myListAdapter = new MyListAdapter(this);
        //단순한 형태의 adapter가 아니면 baseadapter를 상속받아서 adapter클래스를 만들어야 한다.

        //4. view객체에 adapter지정
        listView.setAdapter(myListAdapter);

        //5. item하나에 대한 이벤트 설정

    }

    public class MyListAdapter extends BaseAdapter {

        Context context;

        public MyListAdapter(Context context) {
            this.context = context;
        }

        @Override
        public int getCount() {
            return posterID.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        //반복되는 하나하나를 정의
        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {

            View view = View.inflate(getApplicationContext(),R.layout.like,null);
            TextView movie = view.findViewById(R.id.title);
            ImageView poster = view.findViewById(R.id.poster);
            TextView point = view.findViewById(R.id.point);
            poster.setImageResource(posterID[position]);
            movie.setText(title[position]);
            point.setText(like[position] + "점");
            return view;
        }
    }
}

