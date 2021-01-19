package com.example.app05;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {
    private static String DB_PATH="/data/data/com.example.app05/databases";

    //SQLiteOpenHelper 부모클래스의 기본생성자를 먼저 호출하는데 기본생성자가 없으면 에러남
    //context는 activity정보
    public DbHelper(Context context){
        super(context, "windb", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    //table 만들때
        db.execSQL("create table groupTBL (gName char(20) primary key, gNumber integer)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    //table을 삭제할때
        db.execSQL("drop table groupTBL");
    }
}
