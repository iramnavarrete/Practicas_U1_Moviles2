package com.example.eva1_2_frag_com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.TextureView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ButtonFragmentFragment btnFragment;
    ListFragment lstFragment;

    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       textview = findViewById(R.id.textView);

    }


    //para poder acceder a los fragmentos
    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment.getClass() == ButtonFragmentFragment.class){
            btnFragment = (ButtonFragmentFragment) fragment;    //En caso de tener más de 2 framentos agregar más if
        }else{
            lstFragment = (ListFragment) fragment;
        }
    }


    //Cuando el fragmento quiere mandar algo al main
                                        //quien         lo que se envia
    public void onMessageFromFragToMain(String Sender, String Reciver){
        if (Sender.equals("Lista")){
            textview.setText("lista" + Reciver);
        }else if(Sender.equals("Boton")){
            textview.setText(("Boton" + Reciver));
        }

    }
}
