package com.example.project_34;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.ktx.Firebase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<User> arrayList;
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView); //activity_main.xml에서 구현한 리사이클러뷰
        recyclerView.setHasFixedSize(true); //리사이클러뷰 기존 성능 강화
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        arrayList = new ArrayList<>(); //User 객체를 담을 어레이 리스트(어댑터쪽으로)

        database = FirebaseDatabase.getInstance(); //파이어베이스 데이터베이스를 가져와서 연동해라

        databaseReference = database.getReference("User"); //db 테이블 연결 //트리구조에서 User테이블을 가리킨다.
        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) { //파이어베이스 데이터베이스의 데이터를 받아오는 곳
                arrayList.clear(); //User 객체를 담을 arraylist //기존 배열리스트가 존재하지 않게 초기화
                for (DataSnapshot snapshot : dataSnapshot.getChildren()){ //반복문으로 데이터리스트를 추출해냄
                    User user = snapshot.getValue(User.class); //User class에 데이터를 담는다.
                    arrayList.add(user); //담은 데이터들을 배열 리스트에 넣고 리사이클러뷰로 보낼 준비

                }
                adapter.notifyDataSetChanged(); //리스트 저장 및 새로고침


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) { //db를 가져오느 중 에러 발생시
                Log.e("Mainactivity", String.valueOf(databaseError.toException())); //String.valueOf -> String형태로 바꿔주세요
            }
        });
        adapter = new CustomAdapter(arrayList, this); //만들었던 customadapter //this 는 context에 해당된다.
        recyclerView.setAdapter(adapter); //리사이클러뷰에 어댑터 연결






    }
}