package com.example.app05;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class Main8Activity extends AppCompatActivity {


    EditText etID, etTitle, etWriter, etContent;
    Button btnC, btnR, btnU, btnD;
    TextView tvPost;
    SQLiteDatabase sqLiteDatabase;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        btnC = findViewById(R.id.btnC);
        btnR = findViewById(R.id.btnR);
        btnU = findViewById(R.id.btnU);
        btnD = findViewById(R.id.btnD);
        etID = findViewById(R.id.etID);
        etTitle = findViewById(R.id.etTitle);
        etWriter = findViewById(R.id.etWriter);
        etContent = findViewById(R.id.etContent);
        tvPost = findViewById(R.id.tvPost);

        final BBSdbHelper bbSdbHelper = new BBSdbHelper(this);

        //글쓰기
        btnC.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Calendar c = Calendar.getInstance();
                sqLiteDatabase = bbSdbHelper.getWritableDatabase();
                sqLiteDatabase.execSQL("INSERT INTO review VALUES ("
                        + etID.getText().toString() + ", " +
                        "'" + etTitle.getText().toString() + "', " +
                        "'" + etContent.getText().toString() + "', " +
                        "'" + etWriter.getText().toString() + "', " +
                        "'" + c.getTime() + "'" +
                        ")");

                sqLiteDatabase.close();
                print("글쓰기 완료");
            }
        });

        //글 번호로 글 불러오기
        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sqLiteDatabase = bbSdbHelper.getReadableDatabase();
                Cursor cursor;
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM review WHERE ID=" + etID.getText().toString() + ";",null);
                while (cursor.moveToNext()){
                    etID.setText(cursor.getString(0));
                    etTitle.setText(cursor.getString(1));
                    etContent.setText(cursor.getString(2));
                    etWriter.setText(cursor.getString(3));
                }

                cursor.close();
                sqLiteDatabase.close();

            }
        });


        //글수정하기
        btnU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sqLiteDatabase = bbSdbHelper.getWritableDatabase();
                sqLiteDatabase.execSQL("UPDATE review SET " +
                        "title='" + etTitle.getText().toString() + "', " +
                        "content='" + etContent.getText().toString() + "'" +
                        "WHERE id='" + etID.getText().toString() + "'");

                sqLiteDatabase.close();
                print("글수정 완료");
            }
        });

        //글삭제하기
        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sqLiteDatabase = bbSdbHelper.getWritableDatabase();
                sqLiteDatabase.execSQL("DELETE FROM review WHERE id ='" + etID.getText().toString()+"'");
                sqLiteDatabase.close();
                print("글삭제 완료");
            }
        });

        //전체 글목록 가져오기
        sqLiteDatabase = bbSdbHelper.getReadableDatabase();
        Cursor cursor;
        cursor = sqLiteDatabase.rawQuery("Select * from review order by id desc;",null);

        String no = null;
        String title = null;
        String content = null;
        String writer = null;

        while (cursor.moveToNext()){
            no = cursor.getString(0);
            title = cursor.getString(1);
            content = cursor.getString(2);
            writer = cursor.getString(3);

            tvPost.append(no + "," + title + "," + content + "," + writer + "\n");
        }
        cursor.close();
        sqLiteDatabase.close();

    }


    private void print(String result) {
        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
    }
}
