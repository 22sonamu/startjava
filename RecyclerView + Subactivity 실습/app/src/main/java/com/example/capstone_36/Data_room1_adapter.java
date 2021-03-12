package com.example.capstone_36;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Data_room1_adapter extends RecyclerView.Adapter<Data_room1_adapter.CustomViewHolder> {

    private ArrayList<Data_room1> arrayList;

    public Data_room1_adapter(ArrayList<Data_room1> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public Data_room1_adapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { //리스트뷰가 처음 생성될때 생명주기
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_room1, parent, false);
        CustomViewHolder holder = new CustomViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Data_room1_adapter.CustomViewHolder holder, int position) { //추가될때 생명주기
        holder.iv_profile.setImageResource(arrayList.get(position).getIv_profile());
        holder.name.setText(arrayList.get(position).getName());
        holder.space.setText(arrayList.get(position).getSpace());

        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String curName = holder.name.getText().toString(); //리사이클러뷰중 클릭한것의 이름을 가져옴

            }
        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                remove(holder.getAdapterPosition());

                return true;
            }
        });

    }

    @Override
    public int getItemCount() {
        return (null != arrayList ? arrayList.size() : 0);
    }

    public void remove(int position) { //예외상황이 벌어졌을때 강제실행
        try {
            arrayList.remove(position);
            notifyItemRemoved(position);

        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        protected ImageView iv_profile;
        protected TextView name;
        protected TextView space;


        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.iv_profile = (ImageView) itemView.findViewById(R.id.iv_profile);
            this.name = (TextView) itemView.findViewById(R.id.name);
            this.space = (TextView) itemView.findViewById(R.id.space);

        }

    }

}