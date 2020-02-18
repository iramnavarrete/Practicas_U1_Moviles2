package com.example.eva1_4_frag_din_orienta;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.View;
import android.widget.Toast;

public class Secudaria extends AppCompatActivity {
    TwoFragment two;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secudaria);
        //GET INTENT, RECUP BUNDLE Y PASAR DATOS AL FRAGMENTO
        two.onMessageFromMainToFrag(getIntent().getStringExtra("MENSAJE"));
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        two = (TwoFragment)fragment;

    }
}
