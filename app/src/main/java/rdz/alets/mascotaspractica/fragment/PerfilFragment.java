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
import rdz.alets.mascotaspractica.adapter.PerfilAdaptador;
import rdz.alets.mascotaspractica.pojo.Mascota;
import rdz.alets.mascotaspractica.presentador.IRecyclerViewFragmentPresenter;
import rdz.alets.mascotaspractica.presentador.IRecyclerViewFragmentPresenterPerfil;
import rdz.alets.mascotaspractica.presentador.RecyclerViewFragmentPresenter;
import rdz.alets.mascotaspractica.presentador.RecyclerViewFragmentPresenterPerfil;


/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment implements IRecyclerViewFragmentViewPerfil {

    private ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotasPerfil;
    private IRecyclerViewFragmentPresenterPerfil presenterPerfil;



    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_perfil, container, false);
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        rvMascotasPerfil  = (RecyclerView)v.findViewById(R.id.rvMascotaPerfil);
        presenterPerfil   = new RecyclerViewFragmentPresenterPerfil(this, getContext());
        return  v;

    }


    @Override
    public void generarLinearLayoutCuadrada() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        GridLayoutManager glm = new GridLayoutManager(getContext(), 3);
        rvMascotasPerfil.setLayoutManager(glm);
    }

    @Override
    public PerfilAdaptador crearAdaptadorPerfil(ArrayList<Mascota> mascotas) {
        PerfilAdaptador adaptadorPerfil = new PerfilAdaptador(mascotas, getActivity());
        return adaptadorPerfil;
    }

    @Override
    public void inicializarAdaptadorRVPerfil(PerfilAdaptador adaptadorPerfil) {
        rvMascotasPerfil.setAdapter(adaptadorPerfil);
    }
}