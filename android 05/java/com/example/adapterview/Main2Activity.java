package com.example.adapterview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    GridView gridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //1.데이터를 지정

        //2.view객체를 지정
        gridView = findViewById(R.id.gridView1);

        //3.adapter를 생성
        //단순한 형태의 어댑터가 아니면 baseadapter를 상속받아서 adapter 클래스를 만들어야 한다
        //옵션값은 어댑터 클래스 겟뷰메서드에서 설정할것임!

        MyGridAdapter myGridAdapter = new MyGridAdapter(this);

        //4.view객체에 adapter를 지정
        gridView.setAdapter(myGridAdapter);

        //5.item하나에 대한 클릭이벤트 설정
        //다이얼로그 띄우기



    }
    public class MyGridAdapter extends BaseAdapter{
    //구현해야하는 추상메서드 오버라이드
    //context:this 가 넘어오면 처리할 파라메터 있는 생성자 만들어줘야함

        Context context;
        Integer[] poster = {R.drawable.mov01, R.drawable.mov02, R.drawable.mov03, R.drawable.mov04, R.drawable.mov05, R.drawable.mov06, R.drawable.mov07, R.drawable.mov08, R.drawable.mov09, R.drawable.mov10};

        public MyGridAdapter(Context context){
            this.context = context;
        }

        @Override
        public int getCount() { //몇개
            return poster.length;
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
            //가장중요!
            //어댑터에서 뷰그룹을 만들어주는 메서드
            //리턴형식이 뷰 로 업캐스팅되어있기 때문에 뷰든.. 뷰그룹이든 상관없다
            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(450,500));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setPadding(5, 15, 5, 15);
            imageView.setImageResource(poster[position]);

            //item 하나하나 만들때 온클릭리스너를 설정해서 클릭이벤트를 주는거고..
            //listView 만들때했던것처럼 온아이템클릭리스너로 item당 이벤트를 줘도 된다!!
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //다이얼로그를 이용해서 imageView내용을 띄울 예정
                    AlertDialog.Builder aBuilder = new AlertDialog.Builder(Main2Activity.this);

                    //제목지정
                    aBuilder.setTitle("영화 상세 내용");

                    //배치레이아웃 인플레이션                            root : null 다른곳에 속해있지않고 독립적임
                    View dialogView = View.inflate(Main2Activity.this, R.layout.dialog, null);
                    aBuilder.setView(dialogView);

                        //다이얼로그뷰 안에 이미지뷰안에 이미지 끼우기
                        ImageView image = dialogView.findViewById(R.id.image);
                        image.setImageResource(poster[position]);

                    //버튼추가
                    aBuilder.setIcon(R.drawable.ic_launcher);
                    aBuilder.setNegativeButton("닫기",null);

                    //설정하고 보여지는 명령
                    aBuilder.show();
                }
            });

            return imageView;
        }
    }
}
