package com.example.study_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class subactivity extends AppCompatActivity {

    private TextView tv_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subactivity);

        tv_sub = findViewById(R.id.tv_sub);


        Intent intent = getIntent(); //어디선가 날아오는 정보가 있다면 받겠다
        String str = intent.getStringExtra("str"); // "str"이란 별명으로 날아오는 정보를 받겠다.


        tv_sub.setText(str);
    }
}