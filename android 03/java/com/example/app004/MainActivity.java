package com.example.app004;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    Chronometer chronometer;
    Button start, end, calButton, timeButton, nextButton;
    CalendarView calendar;
    TimePicker timer;
    int year, month, day;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chronometer = findViewById(R.id.ch);
        start = findViewById(R.id.start);
        end = findViewById(R.id.end);
        calButton = findViewById(R.id.calButton);
        timeButton = findViewById(R.id.timeButton);
        nextButton = findViewById(R.id.nextButton);
        calendar = findViewById(R.id.calendar);
        timer = findViewById(R.id.timer);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             chronometer.setBase(SystemClock.elapsedRealtime());
             chronometer.start();
            }
        });

        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer.stop();

                Toast.makeText(getApplicationContext(),chronometer.getText(), Toast.LENGTH_SHORT).show();

            }
        });

        timeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer.getHour();
                int t = timer.getHour();
                int m = timer.getMinute();

                Toast.makeText(getApplicationContext(),t + "시" + m + "분",Toast.LENGTH_SHORT).show();

            }
        });


        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year2, int month2, int day2) {
                year = year2;
                month = month2+1;
                day = day2;
            }
        });


        calButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (year != 0 ){
                    Toast.makeText(getApplicationContext(),year + "년" + month + "월" + day + "일", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"날짜를 먼저 선택해주세요!", Toast.LENGTH_SHORT).show();
                }


            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);

            }
        });

    }
}
