package rdz.alets.mascotaspractica.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import rdz.alets.mascotaspractica.R;
import rdz.alets.mascotaspractica.adapter.MascotaAdaptador;
import rdz.alets.mascotaspractica.pojo.Mascota;


/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_perfil, container, false);
        listaMascotas = (RecyclerView) view.findViewById(R.id.rvMascotaPerfil);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());

        GridLayoutManager glm = new GridLayoutManager(getContext(), 3);

        listaMascotas.setLayoutManager(glm);

        inicializarListaMasctotasDos();
        inicialiazarAdaptadorDos();

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_perfil, container, false);
        return view;
    }


    public void inicializarListaMasctotasDos(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.m3, "3"));
        mascotas.add(new Mascota(R.drawable.m4, "4"));
        mascotas.add(new Mascota(R.drawable.m5, "2"));
        mascotas.add(new Mascota(R.drawable.m6, "4"));
        mascotas.add(new Mascota(R.drawable.m7, "6"));
        mascotas.add(new Mascota(R.drawable.m3, "7"));
        mascotas.add(new Mascota(R.drawable.m4, "6"));
        mascotas.add(new Mascota(R.drawable.m5, "3"));
        mascotas.add(new Mascota(R.drawable.m6, "2"));

    }

    public void inicialiazarAdaptadorDos(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);

    }


}
