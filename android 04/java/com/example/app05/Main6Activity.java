package com.example.app05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main6Activity extends AppCompatActivity {
    Button raw_read, sd_read, sd_write, sd_dir_mk, sd_dir_del, sd_list;
    EditText raw_data, raw_data2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        raw_read = findViewById(R.id.raw_read);
        raw_data = findViewById(R.id.raw_data);
        raw_data2 = findViewById(R.id.raw_data2);
        sd_read = findViewById(R.id.sd_read);
        sd_write = findViewById(R.id.sd_write);
        sd_dir_mk = findViewById(R.id.sd_dir_mk);
        sd_dir_del = findViewById(R.id.sd_dir_del);
        sd_list = findViewById(R.id.sd_list);

        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},MODE_PRIVATE);

        raw_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    InputStream inputStream = getResources().openRawResource(R.raw.raw_test);
                    //읽어오는 파일의 byte 수만큼 읽어옴..
                    byte[] txt = new byte[inputStream.available()];
                    inputStream.read(txt);
                    raw_data.setText(new String(txt));
                    inputStream.close();
                    //에러하나씩 잡고자 할경우 catch여러개.. 자식개체먼저 catch함.. 부모개체 에러 해결하면 아래코드는 실행 안되니까
                }catch (FileNotFoundException e1){
                    e1.printStackTrace();
                    Log.d("파일존재 결과>>>","파일이 존재하지 않음");
                }catch (IOException e) {
                    e.printStackTrace();
                    Log.d("파일 읽기 결과>>>","파일 읽는중 에러발생");
                }
            }
        });

        sd_write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FileOutputStream fileOutputStream = null;
                try {
                    fileOutputStream = new FileOutputStream("/sdcard/out.txt");
                    String str = "i will be back";
                    fileOutputStream.write(str.getBytes());
                    fileOutputStream.close();

                } catch (FileNotFoundException e) {

                    e.printStackTrace();

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

        sd_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    FileInputStream fileInputStream = new FileInputStream("sdcard/out.txt");
                    byte[] txt = new byte[fileInputStream.available()];
                    fileInputStream.read(txt);
                    raw_data2.setText(new String(txt));
                    fileInputStream.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

        final String strSDPath = Environment.getExternalStorageDirectory().getAbsolutePath();
        final File myDir = new File(strSDPath + "/mydir");

        sd_dir_mk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDir.mkdir();
            }
        });

        sd_dir_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDir.delete();
            }
        });




    }
}
