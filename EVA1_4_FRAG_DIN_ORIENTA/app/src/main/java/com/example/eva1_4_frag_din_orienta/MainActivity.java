package com.example.eva1_4_frag_din_orienta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FrameLayout frmLyDetail;
    Intent inSecun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onMessageFromTagToMain(){
        frmLyDetail = findViewById(R.id.frame);
        if (frmLyDetail != null){//Landscape

            //Crear el fragemnto 2 dinámicamente
            Toast.makeText(this,"LANDSCAPE",Toast.LENGTH_SHORT).show();
            FragmentTransaction frmTr = getSupportFragmentManager().beginTransaction();
            TwoFragment two = new TwoFragment();
            two.setParam("ESTE MENSAJE TAMBIÉN");
            frmTr.replace(R.id.frame, two);

            frmTr.commit();
//            two.onMessageFromMainToFrag("ESTE MENSAJE TAMBIÉN");

        }else{//Portrait
            //Lanzar una actividad secundaria con intento
            Toast.makeText(this,"PORTRAIT",Toast.LENGTH_SHORT).show();
            inSecun = new Intent(this, Secudaria.class);
            inSecun.putExtra("MENSAJE","ESTE ES EL MENSAJE!");
            startActivity(inSecun);
        }
    }


}
