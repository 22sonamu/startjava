package com.example.study_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn_move; //버튼 선언
    private EditText et_test;
    private String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) { //이 안의 구문들을 쫙 실행해주어라
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //무슨 layout이 연결되어 있는지


        et_test = findViewById(R.id.et_test);




        btn_move = findViewById(R.id.btn_move);
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = et_test.getText().toString(); //사용자가 입력한 텍스트 가져오기(string으로 변환하여)
                Intent intent = new Intent(MainActivity.this, subactivity.class); //첫번째는 액티비티, 두번째는 클래스
                intent.putExtra("str", str); // 데이터를 담아 쏘기
                startActivity(intent); // 액티비티 이동.

            }
        });

    }
}