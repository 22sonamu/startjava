package com.example.capstone_36;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Room_1_activity extends AppCompatActivity {
    private ArrayList<Data_room1> arrayList;
    private Data_room1_adapter mainAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_1_activity);

        recyclerView = (RecyclerView)findViewById(R.id.rv);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        arrayList = new ArrayList<>();
        mainAdapter = new Data_room1_adapter(arrayList);
        recyclerView.setAdapter(mainAdapter); //어댑터를 리사이클러뷰에 세팅


        Button btn_add = (Button)findViewById(R.id.btn_add);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data_room1 mainData = new Data_room1(R.drawable.ic_launcher_background, "건전지", "작은 탁자");
                arrayList.add(mainData); //이 데이터를 새로 추가
                mainAdapter.notifyDataSetChanged(); //데이터 수정되었을때 해야함
            }
        });


    }
}