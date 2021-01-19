package com.example.fire2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    DatabaseReference database;

    EditText et_user_name, et_user_email, et_user_id;
    Button btn_save, btn_read, btn_login;
    TextView read_data;
    ListView listView;
    TextView text1, text2;
    int i = 1; //userID값 count하기 위한 변수

    ArrayList<User> arrayList;
    MyListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_user_name = findViewById(R.id.et_user_name);
        et_user_email = findViewById(R.id.et_user_email);
        et_user_id = findViewById(R.id.et_user_id);

        btn_save = findViewById(R.id.btn_save);
        btn_read = findViewById(R.id.btn_read);
        btn_login = findViewById(R.id.btn_login);


        read_data = findViewById(R.id.read_data);
        read_data = findViewById(R.id.read_data);
        listView = findViewById(R.id.listView);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);


        database = FirebaseDatabase.getInstance().getReference("users"); //데이터베이스 객체 가져오기
        Log.d("파이어베이스>>", database + "");

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);
            }
        });

        //디비에서 가지고 오는 유저들의 목록을 넣을 공간
        arrayList = new ArrayList<>();

        database.addListenerForSingleValueEvent(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                //유저들의 목록을 가지고 오는 메서드

                arrayList.clear();
                Log.d("파이어베이스>>", "user아래의 자식 개수 " + snapshot.getChildrenCount());

                //vo에 넣어서 그것을 arraylist에 넣기!
                for (DataSnapshot snapshot1 : snapshot.getChildren()) {
                    //snapshot.getChildren() => user 아래에 있는 user목록을 다 가지고 온다
                    //DataSnapshot => for문으로 목록에 들어있는 user를 한명씩 꺼내줌.
                    //user의 값들을 가지고 와서, User vo에 넣는다
                    //getValue(User.class) => 해당하는 멤버변수명과 동일한 set메서드를 자동으로 부른다.. (스프링처럼)
                    User user = snapshot1.getValue(User.class);
                    arrayList.add(user);
                    Log.d("파이어베이스>>", "user 한명씩 찍자 " + user);
                }

                i = arrayList.size();

                adapter = new MyListAdapter(getApplicationContext());
                adapter.notifyDataSetChanged();
                listView.setAdapter(adapter);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = et_user_name.getText().toString();
                String email = et_user_email.getText().toString();
                i++;

                User user = new User(userName, email);
                database.child(String.valueOf(i)).setValue(user)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Toast.makeText(MainActivity.this, "저장을 완료했습니다.", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(MainActivity.this, "저장을 실패했습니다.", Toast.LENGTH_SHORT).show();

                            }
                        });
            }
        });

        btn_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userId = et_user_id.getText().toString();

                database.child(userId).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        User user = snapshot.getValue(User.class);
                        Log.d("파이어베이스>>", "userid " + user);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {
                        Log.d("파이어베이스>>", "userid 없음");

                    }
                });

            }
        });

    }

    public class MyListAdapter extends BaseAdapter {

        Context context;

        public MyListAdapter(Context context) {
            this.context = context;
        }

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        //반복되는 하나하나를 정의
        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            View oneView = View.inflate(getApplicationContext(), R.layout.one, null);

            text1 = oneView.findViewById(R.id.text1);
            text2 = oneView.findViewById(R.id.text2);

            text1.setText("email: " + arrayList.get(position).email);
            text2.setText("name: " + arrayList.get(position).userName);

            return oneView;
        }
    }
}