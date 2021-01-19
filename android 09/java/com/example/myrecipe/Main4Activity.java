package com.example.myrecipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.InputStream;

public class Main4Activity extends AppCompatActivity {
    ImageView imageView4;
    TextView textView2, textView3, textView4, textView5;
    SQLiteDatabase sqLiteDatabase;
    Button update, delete;
    String imgpath, id;

    //상세 레시피 조회 화면
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ActivityCompat.requestPermissions(this, new String[] {android.Manifest.permission.WRITE_EXTERNAL_STORAGE},MODE_PRIVATE);
        ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE},MODE_PRIVATE);
        ContextCompat.checkSelfPermission(this,Manifest.permission.CAMERA);


        imageView4 = findViewById(R.id.imageView4);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        update = findViewById(R.id.update);
        delete = findViewById(R.id.delete);
        final DBHelper dbHelper = new DBHelper(this);

        //3번 액티비티에서 넘어온 글번호 받기
        Intent intent = getIntent();
        final String id = intent.getStringExtra("id");
        System.out.println("넘어온 아이디값" + id);

        //디비에서 값 불러오기 (글번호로)
        sqLiteDatabase = dbHelper.getReadableDatabase();
        Cursor cursor;
        cursor = sqLiteDatabase.rawQuery("SELECT * FROM bbs WHERE ID =" + id + ";", null);
        while (cursor.moveToNext()) {

            textView2.setText("작성자 : " + cursor.getString(1));
            textView3.setText("제목 : " + cursor.getString(2));
            textView4.setText(cursor.getString(3));
            textView5.setText(cursor.getString(4));
            imgpath = cursor.getString(5);
        }
        getImage(imgpath);
        cursor.close();
        sqLiteDatabase.close();

        //삭제하기
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sqLiteDatabase = dbHelper.getWritableDatabase();
                sqLiteDatabase.execSQL("DELETE FROM bbs WHERE id ='" + id +"'");
                sqLiteDatabase.close();
                print("글삭제 완료");
                Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent2);

            }
        });

        //글수정하기
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                print("수정페이지로 이동합니다");
                Intent intent1 = new Intent(getApplicationContext(), Main5Activity.class);
                intent1.putExtra("id", id);
                startActivity(intent1);
            }
        });

    }
    //디비에서 이미지 이름 가져와 파일 경로찾아서 출력하기
    public void getImage(String imgpath) {
        String fileStr ="file:///sdcard/DCIM/Camera/" + imgpath;
        Uri uri = Uri.parse(fileStr);
        imageView4.setImageURI(uri);
    }

    private void print(String result) {
        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
    }

}
