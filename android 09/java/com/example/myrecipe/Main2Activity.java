package com.example.myrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.InputStream;
import java.util.Calendar;

public class Main2Activity extends AppCompatActivity {
    private static final int REQUEST_CODE = 0;
    ImageView imageView;
    Button button2, send;
    EditText title, name, igd, pro;
    SQLiteDatabase sqLiteDatabase;
    String ImgName;

    //레시피 등록하는 화면...메인 탭에 갖다붙였다

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView = findViewById(R.id.imageView);
        button2 = findViewById(R.id.button2);
        send = findViewById(R.id.send);
        title = findViewById(R.id.title);
        name = findViewById(R.id.name);
        igd = findViewById(R.id.igd);
        pro = findViewById(R.id.pro);
        final DBHelper dbHelper = new DBHelper(this);

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

        //디비에 레시피 저장하기
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();
                sqLiteDatabase = dbHelper.getWritableDatabase();
                sqLiteDatabase.execSQL("INSERT INTO bbs VALUES (" +
                        "NULL, '" +
                        name.getText().toString() + "', " +
                        "'" + title.getText().toString() + "', " +
                        "'" + igd.getText().toString() + "', " +
                        "'" + pro.getText().toString() + "', " +
                        "'" + ImgName + "'" + ", " +
                        "'" + c.getTime() + "'" +
                        ")");

                sqLiteDatabase.close();
                print("등록되었습니다");
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

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
                    ImgName = getImageNameToUri(data.getData());
                    Toast.makeText(getBaseContext(), "선택한 이미지는 : " + ImgName, Toast.LENGTH_SHORT).show();

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

    private void print(String result) {
        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
    }


}
