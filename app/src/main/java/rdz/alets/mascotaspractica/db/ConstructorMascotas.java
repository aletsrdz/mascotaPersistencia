package rdz.alets.mascotaspractica.db;

import android.content.Context;

import java.util.ArrayList;

import rdz.alets.mascotaspractica.R;
import rdz.alets.mascotaspractica.pojo.Mascota;

/**
 * Created by AlexRdz on 25/09/2017.
 */

public class ConstructorMascotas {

    private Context context;
    public ConstructorMascotas(Context context) {
        this.context = context;
    }

    public ArrayList<Mascota> obtenerDatos(){

        ArrayList<Mascota> mascotas = new ArrayList<>();
        mascotas.add(new Mascota(R.drawable.m2,"Pepe", 8));
        mascotas.add(new Mascota(R.drawable.m3, "Firulais", 3));
        mascotas.add(new Mascota(R.drawable.m4, "Dago", 4));
        mascotas.add(new Mascota(R.drawable.m5, "Chispita", 5));
        mascotas.add(new Mascota(R.drawable.m6, "Chimuelo", 4));
        mascotas.add(new Mascota(R.drawable.m7, "Duke", 5));
        return  mascotas;

    }
}
