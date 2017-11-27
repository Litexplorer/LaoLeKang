package com.phemie.scnu.laolekang.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.phemie.scnu.laolekang.R;


public class FirstFragment extends Fragment {




    public FirstFragment() {
        // Required empty public constructor



    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        return inflater.inflate(R.layout.fragment_first, container, false);

    }
}
