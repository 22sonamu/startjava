package com.example.study_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText et_save;
    String shared = "file";
    @Override
    protected void onCreate(Bundle savedInstanceState) { //앱을 다시 틀면 이 부분이 실행될 것이다.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_save = (EditText)findViewById(R.id.et_save);

        SharedPreferences sharedPreferences = getSharedPreferences(shared, 0);
        String value = sharedPreferences.getString("정화", ""); //onDestory에서 돌아갔던 것을 가져오기
        et_save.setText(value);



    }

    @Override
    protected void onDestroy() { //새로운 생명주기, 앱을 종료했을때 실행되는 것
        super.onDestroy();

        SharedPreferences sharedPreferences = getSharedPreferences(shared,0);
        SharedPreferences.Editor editor = sharedPreferences.edit(); //에디터 연결
        String value = et_save.getText().toString();
        editor.putString("정화", value); //에디터에 string저장 (정화라는 이름으로 value를 저장하겠다)
        editor.commit();


    }
}




