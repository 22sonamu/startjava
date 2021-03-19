package com.jungwha.db_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button btn_add;

     //다이얼로그 생성1
    private Button btn_dialog_close;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private Dialog dialog;
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;
    private ArrayList<User> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_add = (Button)findViewById(R.id.btn_add);
        db_recyclerview();







        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showdialog();
            }
        });

    }

    public void showdialog(){ //다이얼로그 관련 함수
        Dialog dialog1 = new Dialog();
        dialog1.show(getSupportFragmentManager(), "dialog");





        }

    public void db_recyclerview(){ //db와 recyclerview 연결하는 함수
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        arrayList = new ArrayList<>(); //User 객체를 담을 어레이 리스트(어댑터쪽으로)
        database = FirebaseDatabase.getInstance(); //파이어베이스 데이터베이스를 가져와서 연동해라
        databaseReference = database.getReference("room"); //db 테이블 연결 //트리구조에서 User테이블을 가리킨다.
    }
}




