package com.example.eva1_2_frag_com;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;


public class ListFragment extends Fragment {

    ListView list;

    String[] datos = {
            "Enero",
            "Febrero",
            "Marzo",
            "Abril",
            " Mayo",
            "Junio",
            "Julio",
            "Agosto",
            "Septiembre",
            "Octubre",
            "Noviembre",
            "Diciembre"
    };

    MainActivity main;  //para recuperar el contexto
    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        main =(MainActivity)getActivity();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FrameLayout frameLayout = (FrameLayout)inflater.inflate(R.layout.fragment_list, container, false);
        list = frameLayout.findViewById(R.id.lista);
        list.setAdapter(new ArrayAdapter<String>(
                main,   //contnexto
                android.R.layout.simple_list_item_1, //layout
                datos //datos
        ));


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                main.onMessageFromFragToMain("","");
            }
        });

        //});
        return frameLayout;

    }


}
