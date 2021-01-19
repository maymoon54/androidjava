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
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main3Activity extends AppCompatActivity {

    GridView gridView;
    int[] posterID = {R.drawable.mov01, R.drawable.mov02, R.drawable.mov03,
            R.drawable.mov04, R.drawable.mov05, R.drawable.mov06,
            R.drawable.mov07, R.drawable.mov08, R.drawable.mov09, R.drawable.mov10};
    String[] title = {"써니", "완득이", "괴물", "라디오스타", "비열한거리", "왕의남자", "아일랜드", "웰컴투동막골", "헬보이", "백투더퓨터"};
    int[] like = new int[10];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //1. 데이터를 지정

        //2. view객체 지정
        gridView = findViewById(R.id.gridView1);

        //3. adapter를 생성
        final MyGridAdapter myGridAdapter = new MyGridAdapter(this);
        //단순한 형태의 adapter가 아니면 baseadapter를 상속받아서 adapter클래스를 만들어야 한다.

        //4. view객체에 adapter지정
        gridView.setAdapter(myGridAdapter);

        //5. item하나에 대한 이벤트 설정
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                //다이얼로그를 이용해서  imageview내용을 띄울 예정
                final AlertDialog.Builder aBuilder = new AlertDialog.Builder(Main3Activity.this);

                //제목지정
                aBuilder.setTitle("영화 상세 내용");

                //배치레이아웃 인플레이션
                View dialogView = View.inflate(getApplicationContext(), R.layout.dialog, null);
                aBuilder.setView(dialogView);

                ImageView image = dialogView.findViewById(R.id.image);
                image.setImageResource(posterID[position]);

                //입력한 점수를 가지고 와서 like배열에 넣어주 세요.
                final EditText jumsu = dialogView.findViewById(R.id.jumsu);
                Button button2 = dialogView.findViewById(R.id.button2);
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //like기존에 있는 값에 새롭게 입력한 값을 더해서 다시 넣어주세요.
                        like[position] = like[position] + Integer.parseInt(jumsu.getText().toString());
                        myGridAdapter.notifyDataSetChanged();
                        final AlertDialog.Builder aBuilder2 = new AlertDialog.Builder(Main3Activity.this);
                        aBuilder2.setTitle("영화 상세 내용");
                        aBuilder2.setMessage(title[position] + "의 좋아요!>> " + like[position]);
                        aBuilder2.setNegativeButton("확인완료", null);
                        aBuilder2.show();
                    }
                });
                //버튼 추가
                aBuilder.setIcon(R.drawable.ic_launcher);
                aBuilder.setNegativeButton("닫기", null);

                //설정하고 보여지는 명령
                aBuilder.show();

            }


        });

        //버튼을 눌렀을때 다음 액티비티로 넘기기
        //변수, 배열 등 넘길 수 있다
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main4Activity.class);
                intent.putExtra("posterID", posterID);
                intent.putExtra("title", title);
                intent.putExtra("like", like);
                startActivity(intent);
            }
        });



    }



    public class MyGridAdapter extends BaseAdapter {
//        Integer[] posterID= {R.drawable.mov01, R.drawable.mov02, R.drawable.mov03,
//                R.drawable.mov04, R.drawable.mov05, R.drawable.mov06,
//                R.drawable.mov07, R.drawable.mov08, R.drawable.mov09, R.drawable.mov10};

        Context context;

        public MyGridAdapter(Context context) {
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
            View dialogView = View.inflate(getApplicationContext(), R.layout.one, null);
            TextView text2 = dialogView.findViewById(R.id.text2);
            ImageView imageView = dialogView.findViewById(R.id.image2);
            text2.setText(title[position] + "<" + like[position] + ">");
            //ImageView imageView = new ImageView(context);
            // imageView.setLayoutParams(new GridView.LayoutParams(500, 500));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setPadding(0, 15, 5, 15);
            imageView.setImageResource(posterID[position]);

//            imageView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    //다이얼로그를 이용해서  imageview내용을 띄울 예정
//                    AlertDialog.Builder aBuilder = new AlertDialog.Builder(Main2Activity.this);
//
//                    //제목지정
//                    aBuilder.setTitle("영화 상세 내용");
//
//                    //배치레이아웃 인플레이션
//                    View dialogView = View.inflate(Main2Activity.this, R.layout.dialog, null);
//                    aBuilder.setView(dialogView);
//
//                    ImageView image = dialogView.findViewById(R.id.image);
//                    image.setImageResource(posterID[position]);
//                    //버튼 추가
//                    aBuilder.setIcon(R.drawable.ic_launcher);
//                    aBuilder.setNegativeButton("닫기", null);
//
//                    //설정하고 보여지는 명령
//                    aBuilder.show();
//                }
//            });
            // return imageView;
            return dialogView;
        }
    }
}