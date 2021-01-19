package com.example.app05;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main7Activity extends AppCompatActivity {

    EditText edtNameResult, edtNumberResult, edtNumber, edtName;
    Button btnInit, btnInsert, btnSelect;
    SQLiteDatabase sqLiteDatabase;
    DbHelper dbHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        btnInit = findViewById(R.id.btnInit);
        btnInsert = findViewById(R.id.btnInsert);
        btnSelect = findViewById(R.id.btnSelect);
        edtNameResult = findViewById(R.id.edtNameResult);
        edtNumberResult = findViewById(R.id.edtNameResult);
        edtNumber = findViewById(R.id.edtNumber);
        edtName = findViewById(R.id.edtName);

        dbHelper = new DbHelper(this); //생성자 호출


        btnInit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sqLiteDatabase = dbHelper.getWritableDatabase();
                print("DB연결 성공");
                dbHelper.onCreate(sqLiteDatabase);
                sqLiteDatabase.close();
            }
        });

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sqLiteDatabase = dbHelper.getWritableDatabase();
                sqLiteDatabase.execSQL("INSERT INTO groupTBL VALUES ( '"
                        + edtName.getText().toString() + "' , "
                        + edtNumber.getText().toString() + ");");
                sqLiteDatabase.close();
                print("insert 성공!");
            }
        });
    }

    private void print(String result) {
        Toast.makeText(getApplicationContext(),result, Toast.LENGTH_SHORT).show();
    }
}
