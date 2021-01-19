package com.example.myrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Calendar;


public class Main5Activity extends AppCompatActivity {
    private static final int REQUEST_CODE = 0;
    ImageView imageView;
    Button button2, send;
    EditText title, name, igd, pro;
    SQLiteDatabase sqLiteDatabase;
    String imgName, imgpath;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        imageView = findViewById(R.id.imageView);
        button2 = findViewById(R.id.button2);
        send = findViewById(R.id.send);
        title = findViewById(R.id.title);
        name = findViewById(R.id.name);
        igd = findViewById(R.id.igd);
        pro = findViewById(R.id.pro);
        final DBHelper dbHelper = new DBHelper(this);

        //글수정 버튼 누르고 넘어온 경우 액티비티에서 넘어온 글번호 받기
        Intent intent = getIntent();
        final String id = intent.getStringExtra("id");
        System.out.println("수정할 아이디값" + id);

        //디비에서 해당글번호의 항목을 불러온다
        sqLiteDatabase = dbHelper.getReadableDatabase();
        Cursor cursor;
        cursor = sqLiteDatabase.rawQuery("SELECT * FROM bbs WHERE ID =" + id + ";", null);
        while (cursor.moveToNext()) {

            name.setText(cursor.getString(1));
            title.setText(cursor.getString(2));
            igd.setText(cursor.getString(3));
            pro.setText(cursor.getString(4));
            imgpath = cursor.getString(5);
        }
        getImage(imgpath);
        cursor.close();
        sqLiteDatabase.close();



        //사진선택
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType(MediaStore.Images.Media.CONTENT_TYPE);
                intent.setData(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, REQUEST_CODE);

            }
        });

        //디비레피시 수정하기 (업데이트)
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();
                sqLiteDatabase = dbHelper.getWritableDatabase();
                sqLiteDatabase.execSQL("UPDATE bbs SET " +
                        "name='" + name.getText().toString() + "', " +
                        "title='" + title.getText().toString() + "', " +
                        "igd='" + igd.getText().toString() + "', " +
                        "pro='" + pro.getText().toString() + "', " +
                        "img='" + imgName + "'" +
                        "WHERE id='" + id + "'");
                sqLiteDatabase.close();
                print("글수정 완료");
                Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent2);
            }
        });

    }

    //이미지 선택
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                try {

                    //배치해놓은 ImageView에 set
                    Uri imguri = data.getData();
                    imageView.setImageURI(imguri);

                    //Uri에서 이미지 이름을 얻어온다.
                    imgName = getImageNameToUri(data.getData());
                    Toast.makeText(getBaseContext(), "선택한 이미지는 : " + imgName, Toast.LENGTH_SHORT).show();

                } catch (Exception e) {

                }
            } else if (resultCode == RESULT_CANCELED) {
                Toast.makeText(this, "사진 선택 취소", Toast.LENGTH_LONG).show();
            }
        }
    }

    //이미지의 이름을 알아내자 (디비에 저장할것임!)
    public String getImageNameToUri(Uri data) {
        String[] proj = {MediaStore.Images.Media.DATA};
        Cursor cursor = managedQuery(data, proj, null, null, null);
        int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
        cursor.moveToFirst();
        String imgPath = cursor.getString(column_index);
        String imgName = imgPath.substring(imgPath.lastIndexOf("/") + 1);

        return imgName;
    }

    //디비에서 이미지 이름 가져와 파일 경로찾아서 출력하기
    public void getImage(String imgpath) {
        String fileStr ="file:///sdcard/DCIM/Camera/" + imgpath;
        Uri uri = Uri.parse(fileStr);
        imageView.setImageURI(uri);
    }
    private void print(String result) {
        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
    }

}