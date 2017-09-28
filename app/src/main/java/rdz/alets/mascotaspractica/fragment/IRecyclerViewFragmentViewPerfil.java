package rdz.alets.mascotaspractica.fragment;

import java.util.ArrayList;

import rdz.alets.mascotaspractica.adapter.PerfilAdaptador;
import rdz.alets.mascotaspractica.pojo.Mascota;

/**
 * Created by AlexRdz on 27/09/2017.
 */

public interface IRecyclerViewFragmentViewPerfil {


    public void generarLinearLayoutCuadrada();

    public PerfilAdaptador crearAdaptadorPerfil(ArrayList<Mascota> mascotas);

    public void inicializarAdaptadorRVPerfil(PerfilAdaptador adaptadorPerfil);

}
