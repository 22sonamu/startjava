package com.jungwha.db_recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
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
    private DrawerLayout drawerLayout;
    private View drawerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_add = (Button)findViewById(R.id.btn_add);
        db_recyclerview();
        drawer();



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
        databaseReference = database.getReference("room"); //db 테이블 연결 //트리구조에서 room테이블을 가리킨다.
    }


    public void drawer(){ //drawerlayout 관련 함수
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        drawerView = (View)findViewById(R.id.drawer);

        Button btn_open = (Button)findViewById(R.id.btn_open);
        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(drawerView);
            }
        });

        drawerLayout.setDrawerListener(listener); //drawerlayout 리스너
        drawerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });
        Button btn_food = (Button)findViewById(R.id.btn_food); // drawer의 냉장고 탭
        Button btn_inform = (Button)findViewById(R.id.btn_inform); //drawer의 회원정보 탭


        btn_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FoodActivity.class);
                startActivity(intent);
            }
        });
        btn_inform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FoodActivity.class);
                startActivity(intent);

            }
        });


    }


    DrawerLayout.DrawerListener listener = new DrawerLayout.DrawerListener() { //drawerlayout 리스너 생성(특정 액션에 추가 기능)
        @Override
        public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

        }

        @Override
        public void onDrawerOpened(@NonNull View drawerView) { //drawer 열렸을때 상태값 설정란

        }

        @Override
        public void onDrawerClosed(@NonNull View drawerView) { //drawer 닫혔을때 상태값 설정란

        }

        @Override
        public void onDrawerStateChanged(int newState) {

        }
    };
}




