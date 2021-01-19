package com.example.app004;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.DatePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;
import java.util.Date;

public class DatepickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {


    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        //플래그먼트를 실행시켰을때 자동 호출되는 메서드
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);
        Log.d("캘린더 다이얼로그 생성>>",year + "년" + (month+1) + "월" + day + "일");

        return new DatePickerDialog(getActivity(),this, year,month,day);
    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
        Date date = new Date(year, month, dayOfMonth);
        int w = date.getDay();
        String week = "";
        switch (w){
            case 1: week = "일요일"; break;
            case 2: week = "월요일"; break;
            case 3: week = "화요일"; break;
            case 4: week = "수요일"; break;
            case 5: week = "목요일"; break;
            case 6: week = "금요일"; break;
            case 7: week = "토요일"; break;
        }
        //날짜를 클릭하면!
        logPrint(year,month+1,dayOfMonth);

        //프래그먼트가 끼워진 액티비티를 알아내서
        Main5Activity activity5 = (Main5Activity)getActivity();

        //값을 넘겨줌
        activity5.result(year, month+1, dayOfMonth, week);
    }

    public void logPrint(int year, int month, int day){
        Log.d("선택한 날짜는", year + "년" + month + "월" + day + "일");
    }
}
