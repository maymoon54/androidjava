package com.example.app004;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Calendar;

public class Main5Activity extends AppCompatActivity {

    LinearLayout top;
    int index = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    //모듈화 해서 메서드 호출하는 방식으로 만듬
    public void onClickShowAlert(View view){ print(view); }

    public void onClickShowDate(View view) {
        showDatePicker(view);
    }

    public void onClickLogPrint(View view){
        Log.d("나를 부른 view의 정보 >>",view.getId() + "");
        Button button3 = view.findViewById(view.getId());
        button3.setTextColor(Color.RED);
    }

    public void onClickShowWeek(View view){
        Log.d("이 버튼의 아이디", view.getId()+"");
        Button button4 = view.findViewById(view.getId());
        Log.d("이 버튼의 텍스트", button4.getText().toString());
        button4.setText("오늘은 월요일입니다");
        button4.setTextColor(Color.BLUE);
    }



    public void print(View view){

        Log.d("이 메서드가 호출됨", "나를호출한 view는 >>" + view.getId());
        AlertDialog.Builder builder = new AlertDialog.Builder(Main5Activity.this);
        builder.setTitle("경고용 메시지 창");
        builder.setMessage("집에 있지만 집에 가고싶다");

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"OK를 누르셨군요", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"NO를 누르셨군요", Toast.LENGTH_SHORT).show();
            }
        });

        builder.show();
    }

    public void showDatePicker(View view){
        //프레그먼트 객체 생성하기 DialogFragment가 부모객체임..
        DialogFragment dialogFragment = new DatepickerFragment();
        dialogFragment.show(getSupportFragmentManager(),"datePicker");

    }

    public void result(final int year, final int month, final int day, final String week) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("날짜를 클릭함");
        builder.setMessage(year + "년" + month + "월" + day + "일");
        final String s = year + "년" + month + "월" + day + "일";
        builder.setPositiveButton("전달값 확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();

            }
        });

        builder.show();
        top = findViewById(R.id.top);
        Button button5 = new Button(getApplicationContext());
        button5.setText(s);
        button5.setWidth(100);
        button5.setTextSize(30);
        button5.setId(index);
        index++;
        top.addView(button5);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //새로생긴 버튼을 클릭했을때
                Toast.makeText(getApplicationContext(),week,Toast.LENGTH_SHORT).show();
            }
        });

        }


}
