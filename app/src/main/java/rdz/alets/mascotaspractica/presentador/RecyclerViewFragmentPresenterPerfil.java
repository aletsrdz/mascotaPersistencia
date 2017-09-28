package rdz.alets.mascotaspractica.presentador;

import android.content.Context;

import java.util.ArrayList;

import rdz.alets.mascotaspractica.db.ConstructorMascotas;
import rdz.alets.mascotaspractica.fragment.IRecyclerViewFragmentViewPerfil;
import rdz.alets.mascotaspractica.pojo.Mascota;

/**
 * Created by AlexRdz on 28/09/2017.
 */

public class RecyclerViewFragmentPresenterPerfil implements IRecyclerViewFragmentPresenterPerfil {

    private IRecyclerViewFragmentViewPerfil iRecyclerViewFragmentViewPerfil;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;

    public RecyclerViewFragmentPresenterPerfil(IRecyclerViewFragmentViewPerfil iRecyclerViewFragmentViewPerfil, Context context) {
        this.iRecyclerViewFragmentViewPerfil = iRecyclerViewFragmentViewPerfil;
        this.context = context;
        obtenerMascotasBaseDatosPerfil();
    }

    @Override
    public void obtenerMascotasBaseDatosPerfil() {
        constructorMascotas = new ConstructorMascotas(context);
        mascotas = constructorMascotas.obtenerDatos();
        mostrarMascotasRVPerfil();

    }

    @Override
    public void mostrarMascotasRVPerfil() {
        iRecyclerViewFragmentViewPerfil.inicializarAdaptadorRVPerfil(iRecyclerViewFragmentViewPerfil.crearAdaptadorPerfil(mascotas));
        iRecyclerViewFragmentViewPerfil.generarLinearLayoutCuadrada();

    }
}
