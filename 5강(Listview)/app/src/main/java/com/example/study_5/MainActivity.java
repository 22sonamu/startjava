package com.example.study_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView)findViewById(R.id.list);

        List<String> data = new ArrayList<>(); //데이터를 저장하는 list만들기

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data); //리스트와 엑티비티 연결해주는 어댑터
        // (액티비티, 디자인, 데이터)
        list.setAdapter(adapter); //리스트에 어댑터 세팅

        data.add("여정화"); //데이터 넣기
        data.add("20182280");
        data.add("사과");
        adapter.notifyDataSetChanged(); //바뀐 데이터 저장해주기
    }
}




