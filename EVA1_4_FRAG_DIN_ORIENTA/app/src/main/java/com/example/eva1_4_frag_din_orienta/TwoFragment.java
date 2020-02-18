package com.example.eva1_4_frag_din_orienta;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TwoFragment extends Fragment {

    TextView txtView;
    private String param;
    public TwoFragment() {
        // Required empty public constructor
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout frame = (LinearLayout) inflater.inflate(R.layout.fragment_two, container, false);
        txtView = frame.findViewById(R.id.txtView);
        onMessageFromMainToFrag(param);
        return frame;
    }

    public void onMessageFromMainToFrag(String param){
        txtView.setText(param);
    }


}

