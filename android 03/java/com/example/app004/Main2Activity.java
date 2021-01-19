package com.example.app004;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.MultiAutoCompleteTextView;

import java.util.StringTokenizer;

public class Main2Activity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    MultiAutoCompleteTextView multiAutoCompleteTextView;
    ImageButton getBtn;
    LinearLayout top;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //inflation 인플레이션 ( java + layout )
        //java : 내부적인 처리, 이벤트 처리, 외부와의 통신
        //layout : view를 담당

        setContentView(R.layout.activity_main2);

        String[] list = {"airplane","apple","melon","strawberry","watermelon","banana","orange"};

        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        multiAutoCompleteTextView = findViewById(R.id.multiAutoCompleteTextView);
        getBtn = findViewById(R.id.getBtn);


        //배열에 들어있는 값들을 autotextview에 넣을 예정
        //adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, list);
        autoCompleteTextView.setAdapter(adapter);


        //콤마로 연결해주는 객체 생성
        MultiAutoCompleteTextView.CommaTokenizer token = new MultiAutoCompleteTextView.CommaTokenizer();
        multiAutoCompleteTextView.setAdapter(adapter);
        multiAutoCompleteTextView.setTokenizer(token);

        getBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String autoText = autoCompleteTextView.getText().toString();
                String multiText = multiAutoCompleteTextView.getText().toString();
                String total = autoText + " ," + multiText ;
                Log.d("single 자동완성", autoCompleteTextView.getText().toString());
                Log.d("multi 자동완성", multiAutoCompleteTextView.getText().toString());
                Log.d("total",total);

                StringTokenizer tokenizer = new StringTokenizer(total);
                int count = tokenizer.countTokens();
                Log.d("tocken의 갯수 : ", count + "개");



                for (int i = 0; i < count; i++){

                    String name = tokenizer.nextToken(",").trim();
                    Log.d(i + "번째 토큰 " , name);
                    top = findViewById(R.id.top);
                    Button button = new Button(getApplicationContext());

                    button.setText(name);
                    button.setWidth(100);
                    button.setTextSize(15);
                    button.setId(100);
                    top.addView(button);

                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Log.d("새로생긴 버튼 눌렀음", v.getId()+"임");
                            if (v.getId() == 100){
                                Log.d(v.getId() + "값을 선택함","신기");
                            }else{

                            }
                        }
                    });


                }//for
            }//버튼클릭
        });











    }
}
