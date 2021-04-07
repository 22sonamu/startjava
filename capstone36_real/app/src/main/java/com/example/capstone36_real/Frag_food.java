package com.example.capstone36_real;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Frag_food extends Fragment {
    private View view;

    @Nullable
    @Override //액티비티의 onCreate와 같은역할
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_food, container, false); //layout과 연결
        return view;
    }
}
