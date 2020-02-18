package com.example.eva1_10_lista_clima;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentClima extends Fragment implements AdapterView.OnItemClickListener{


    ListView listaClima;

    Clima[] Ciudades = {
            new Clima(),
            new Clima(R.drawable.sunny, "Camargo", 25, "Apenas pa un 12"),
            new Clima(R.drawable.rainy, "Delicias", 18, "2 Triquis"),
            new Clima(R.drawable.atmospher, "Parrar", 14, "Normal"),
            new Clima(R.drawable.cloudy, "Chihuahua", 21, "likea (hell)"),
            new Clima(R.drawable.tornado, "Juarez", 23, "se pronostican lluvias de balas"),
    };

    public FragmentClima() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout ll = (LinearLayout) inflater.inflate(R.layout.fragment_fragment_clima, container, false);

        listaClima = ll.findViewById(R.id.listaClima);
        listaClima.setAdapter(new ClimaAdapter(getContext(), R.layout.layout_clima, Ciudades));
        listaClima.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), Ciudades[position].getCiudad(), Toast.LENGTH_SHORT).show();
            }
        });
        return ll;
    }

    public Clima[] getCiudades() {
        return Ciudades;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
