package rdz.alets.mascotaspractica.fragment;

import java.util.ArrayList;

import rdz.alets.mascotaspractica.adapter.MascotaAdaptador;
import rdz.alets.mascotaspractica.adapter.PerfilAdaptador;
import rdz.alets.mascotaspractica.pojo.Mascota;

/**
 * Created by AlexRdz on 25/09/2017.
 */

public interface IRecyclerViewFragmentView {

    public void generarLinerLayoutVertical();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);

    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);

}
