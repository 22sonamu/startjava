package com.example.capstone36_real;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView; //바텀 네비게이션 뷰
    private FragmentManager fm;
    private FragmentTransaction ft;
    private Frag_home frag_home;
    private Frag_food frag_food;
    private Frag_inform frag_inform; //바텀 네비게이션 뷰 끝




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        F_BN();
        F_setFrag(0); //처음 앱 진입할때 프래그먼트 설정

    }

    private void F_BN(){ //바텀네비게이션뷰 객체생성 함수
        bottomNavigationView = findViewById(R.id.bottonNavi);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){ //아이템 아이디 가져오기
                    case R.id.home:
                        F_setFrag(0);
                    case R.id.food:
                        F_setFrag(1);
                    case R.id.inform:
                        F_setFrag(2);
                }
                return true;
            }
        });
        frag_food = new Frag_food(); //객체 생성
        frag_home = new Frag_home();
        frag_inform = new Frag_inform();

    }
    private void F_setFrag(int n){ //프래그먼트 교체 함수
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction(); //실제적인 프래그먼트 교체가 이루어질때 , 바꿔주는것
        switch (n){
            case 0:
                ft.replace(R.id.main_frame, frag_home);
                ft.commit();
                break;
            case 1:
                ft.replace(R.id.main_frame, frag_food);
                ft.commit();
                break;
            case 2:
                ft.replace(R.id.main_frame, frag_inform);
                ft.commit();
                break;
        }

    }
}