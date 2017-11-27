package com.phemie.scnu.laolekang.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.phemie.scnu.laolekang.Health.MapActivity;
import com.phemie.scnu.laolekang.Health.StepActivity;
import com.phemie.scnu.laolekang.R;

public class FourthFragment extends Fragment {

    Intent intent;
    private ImageButton location;
    private ImageButton step;
    private TextView stepCount;

    public FourthFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fourth, container, false);
        View view = inflater.inflate(R.layout.fragment_fourth, container, false);

        location = (ImageButton) view.findViewById(R.id.healthlocation);
        step = (ImageButton) view.findViewById(R.id.healthfoot);
        stepCount = (TextView) view.findViewById(R.id.length);
        intent = getActivity().getIntent();
        stepCount.setText(intent.getStringExtra("步数"));


        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), MapActivity.class);
                startActivity(intent);
            }
        });


        step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), StepActivity.class);
                startActivity(intent);
            }
        });


        return view;
    }


}
