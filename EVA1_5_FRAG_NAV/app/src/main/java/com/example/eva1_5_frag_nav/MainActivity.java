package com.example.eva1_5_frag_nav;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ButtonFragment buttonFragment = new ButtonFragment();
        ft.replace(R.id.frmLayoutMain,buttonFragment);
        ft.commit();

        //Lanzar fragmento blank

    }

}
