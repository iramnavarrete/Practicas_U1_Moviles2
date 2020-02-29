package com.example.eva1_6_tarnsiciones;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Slide;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this, Main2Activity.class);

        getWindow().setExitTransition(new Fade().setDuration(1000));
    }

    public void onClick(View v){
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());

    }
}
