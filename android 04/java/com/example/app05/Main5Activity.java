package com.example.app05;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main5Activity extends AppCompatActivity {


    Button btnRead, btnWrite, open, save;
    EditText t1, t2, t3, t4, query;
    TextView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        btnRead = findViewById(R.id.btnRead);
        btnWrite = findViewById(R.id.btnWrite);
        open = findViewById(R.id.open);
        save = findViewById(R.id.save);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        query = findViewById(R.id.query);
        list = findViewById(R.id.list);



        //연락처 저장하기
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //입력한 값 저장
                String name = t1.getText().toString();
                String company = t2.getText().toString();
                String email = t3.getText().toString();
                String phone = t4.getText().toString();

                try {
                    FileOutputStream fileOutputStream = openFileOutput(name + ".txt", Context.MODE_PRIVATE);
                    String str = name + "\n" + company + "\n" + email + "\n" + phone + "\n";
                    fileOutputStream.write(str.getBytes());
                    fileOutputStream.close();
                    Toast.makeText(getApplicationContext(),"연락처 저장 완료", Toast.LENGTH_SHORT).show();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        });

        //내장메모리에 파일 쓰기
        btnWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    FileOutputStream outputStream = openFileOutput("out.txt", Context.MODE_PRIVATE);
                    String str = "내가 파일에 들어가요";
                    outputStream.write(str.getBytes());
                    outputStream.close();
                    Toast.makeText(getApplicationContext(),"파일이 생성됨", Toast.LENGTH_SHORT).show();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        });

        //내장메모리에 파일 읽기
        btnRead.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    FileInputStream inputStream = openFileInput("out.txt");
                    byte[] txt = new byte[256];
                    inputStream.read(txt);
                    String str = new String(txt);
                    inputStream.close();

                    View toastView = (View) View.inflate(Main5Activity.this,R.layout.toast1,null);
                    Toast toast = new Toast(Main5Activity.this);
                    toast.setView(toastView);
                    TextView text = (TextView)toastView.findViewById(R.id.textView);
                    text.setText(str);
                    toast.show();

                    //Toast.makeText(getApplicationContext(), str , Toast.LENGTH_SHORT).show();
                } catch (FileNotFoundException e) {
                    Toast.makeText(getApplicationContext(), "파일없음" , Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

        //연락처 가지고 오기
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //검색할 이름
                String queryName = query.getText().toString();

                try {
                    FileInputStream inputStream = openFileInput(queryName+".txt");
                    byte[] txt = new byte[256];
                    inputStream.read(txt);
                    String str = new String(txt);
                    list.setText(str);

                    //다이얼로그로 띄우기
                    View dialogView = (View) View.inflate(Main5Activity.this, R.layout.dialolg1,null);
                    AlertDialog.Builder builder = new AlertDialog.Builder(Main5Activity.this);
                    TextView text = (TextView)dialogView.findViewById(R.id.textView2);
                    text.setText(str);
                    builder.setView(dialogView);
                    //builder.setMessage(str);
                    builder.setPositiveButton("확인", null);
                    builder.show();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(),"검색결과 없음",Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        });




    }
}
