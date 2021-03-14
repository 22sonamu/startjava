package com.example.project_34;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private ArrayList<User> arrayList;
    private Context context;
    //alt+insert  --> constructure

    public CustomAdapter(ArrayList<User> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { //list_item 에대한 view 생성
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        CustomViewHolder holder = new CustomViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) { //실제적으로 각 아이템들에 대한 매칭을 시켜줌
        //텍스트뷰는 그냥 가져오고, 이미지뷰는 빠르게 로딩할수있는 라이브러리를 쓴다.(gradle에서 glide 라이브러리 임포트)
        Glide.with(holder.itemView)
                .load(arrayList.get(position).getProfile()) //User 객체가 있는 정보를 받는다.
                .into(holder.iv_profile); //서버로부터 이미지를 받아와서 삽입시킴
        holder.tv_id.setText(arrayList.get(position).getId());
        holder.tv_pw.setText(String.valueOf(arrayList.get(position).getPw()));
        holder.tv_username.setText(arrayList.get(position).getUsername());

    }

    @Override
    public int getItemCount() {
        //삼항 연산자
        return (arrayList != null ? arrayList.size() : 0); //arraylist 가 null이아니면 arraylist.size를 가져오고 null이면 0을 가져와라
        //(조건식 ? 참일떄 실행할 문장 : 거짓일때 실행할 문장)

    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        //list_item에 있는 애들 데려오기
        ImageView iv_profile;
        TextView tv_id;
        TextView tv_pw;
        TextView tv_username;


        public CustomViewHolder(@NonNull View itemView) { //뷰홀더
            super(itemView);
            this.iv_profile = itemView.findViewById(R.id.iv_profile);
            this.tv_id = itemView.findViewById(R.id.tv_id);
            this.tv_pw = itemView.findViewById(R.id.tv_pw);
            this.tv_username = itemView.findViewById(R.id.tv_username);

        }
    }
}
