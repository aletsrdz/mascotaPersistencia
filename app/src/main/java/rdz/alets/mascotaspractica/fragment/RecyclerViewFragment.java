package rdz.alets.mascotaspractica.fragment;



import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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
 * Created by AletsRdz on 12/09/17.
 */

public class RecyclerViewFragment extends Fragment {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        listaMascotas = (RecyclerView)v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        inicializarListaMasctotas();
        inicialiazarAdaptador();
        return  v;
    }

    public void inicializarListaMasctotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.m3, "Firulais", "3"));
        mascotas.add(new Mascota(R.drawable.m4, "Dago", "4"));
        mascotas.add(new Mascota(R.drawable.m5, "Chispita", "5"));
        mascotas.add(new Mascota(R.drawable.m6, "Chimuelo", "4"));
        mascotas.add(new Mascota(R.drawable.m7, "Duke", "5"));
    }

    public void inicialiazarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);

    }


}
