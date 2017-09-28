package rdz.alets.mascotaspractica.presentador;

import android.content.Context;
import java.util.ArrayList;
import rdz.alets.mascotaspractica.db.ConstructorMascotas;
import rdz.alets.mascotaspractica.fragment.IRecyclerViewFragmentView;
import rdz.alets.mascotaspractica.pojo.Mascota;

/**
 * Created by AlexRdz on 25/09/2017.
 */

public class RecyclerViewFragmentPresenter implements  IRecyclerViewFragmentPresenter{

    private IRecyclerViewFragmentView iRecyclerViewFragmentView;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;

    public RecyclerViewFragmentPresenter(IRecyclerViewFragmentView iRecyclerViewFragmentView, Context context){
        this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
        this.context = context;
        obtenerMascotasBaseDatos();
    }



    @Override
    public void obtenerMascotasBaseDatos() {
        constructorMascotas = new ConstructorMascotas(context);
        mascotas = constructorMascotas.obtenerDatos();
        mostrarMascotasRV();
    }

    @Override
    public void mostrarMascotasRV() {
        iRecyclerViewFragmentView.inicializarAdaptadorRV(iRecyclerViewFragmentView.crearAdaptador(mascotas));
        iRecyclerViewFragmentView.generarLinerLayoutVertical();
    }

}
