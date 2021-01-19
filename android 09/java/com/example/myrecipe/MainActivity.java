package com.example.myrecipe;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ArrayList<list_item> DataList;
    SQLiteDatabase sqLiteDatabase;
    String no = null;
    String title = null;
    String name = null;
    String img = null;
    String date = null;

    private static final int REQUEST_CODE = 0;
    ImageView imageView;
    Button button2, send, search;
    EditText input, ettitle, etname, etigd, etpro;
    String ImgName, serchText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.input);
        search = findViewById(R.id.search);

        //검색버튼 눌렀을때
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                serchText = input.getText().toString();
                Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                intent.putExtra("input",serchText);
                startActivity(intent);
            }
        });


        /*tabhost*/
        TabHost tabHost = findViewById(R.id.recipe);
        tabHost.setup();

        /* 탭1) 리스트뷰 */
        TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("main").setIndicator("레시피");
        tabSpec1.setContent(R.id.tab1);
        tabHost.addTab(tabSpec1);
        getData();

        ListView listView = (ListView)findViewById(R.id.listView);
        final MyAdapter myAdapter = new MyAdapter(this,DataList);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override

            //클릭하면 4번액티비티로 이동하고, 글번호값을 전달해야한다

            public void onItemClick(AdapterView parent, View v, int position, long id){
                Toast.makeText(getApplicationContext(),
                        myAdapter.getItem(position).getTitle(),
                        Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(), Main4Activity.class);
                intent.putExtra("id",myAdapter.getItem(position).getId());
                startActivity(intent);

            }
        });


        /* 탭2) 글 등록하기 */
        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("save").setIndicator("등록하기");
        tabSpec2.setContent(R.id.tab2);
        tabHost.addTab(tabSpec2);
        imageView = findViewById(R.id.imageView);
        button2 = findViewById(R.id.button2);
        send = findViewById(R.id.send);
        ettitle = findViewById(R.id.title);
        etname = findViewById(R.id.name);
        etigd = findViewById(R.id.igd);
        etpro = findViewById(R.id.pro);
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
                        etname.getText().toString() + "', " +
                        "'" + ettitle.getText().toString() + "', " +
                        "'" + etigd.getText().toString() + "', " +
                        "'" + etpro.getText().toString() + "', " +
                        "'" + ImgName + "'" + ", " +
                        "'" + c.getTime() + "'" +
                        ")");

                sqLiteDatabase.close();

                print("등록완료");
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

/*        TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("scrap").setIndicator("스크랩");
        tabSpec3.setContent(R.id.tab3);
        tabHost.addTab(tabSpec3);*/
    }

    //디비에서 데이터 읽어오기
    public void getData(){
        DataList = new ArrayList<list_item>();
        DBHelper dbHelper = new DBHelper(this);
        sqLiteDatabase = dbHelper.getReadableDatabase();
        Cursor cursor;
        cursor = sqLiteDatabase.rawQuery("SELECT * FROM bbs", null);

        while (cursor.moveToNext()){
            no = cursor.getString(0);
            name = cursor.getString(1);
            title = cursor.getString(2);
            img = cursor.getString(5);
            date = cursor.getString(6);

            DataList.add(new list_item(no, name, title, img, date));

        }
        cursor.close();
        sqLiteDatabase.close();
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

    private void print(String result) {
        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
    }


}


