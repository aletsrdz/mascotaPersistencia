package rdz.alets.mascotaspractica.db;

import android.content.ContentValues;
import android.content.Context;

import java.util.ArrayList;

import rdz.alets.mascotaspractica.R;
import rdz.alets.mascotaspractica.pojo.Mascota;

/**
 * Created by AlexRdz on 25/09/2017.
 */

public class ConstructorMascotas {

    private static final int RAITING = 1;
    private Context context;

    public ConstructorMascotas(Context context) {
        this.context = context;
    }


    public ArrayList<Mascota> obtenerDatos(){
        /*
        ArrayList<Mascota> mascotas = new ArrayList<>();
        mascotas.add(new Mascota(R.drawable.m2,"Pepe", 8));
        mascotas.add(new Mascota(R.drawable.m3, "Firulais", 3));
        mascotas.add(new Mascota(R.drawable.m4, "Dago", 4));
        mascotas.add(new Mascota(R.drawable.m5, "Chispita", 5));
        mascotas.add(new Mascota(R.drawable.m6, "Chimuelo", 4));
        mascotas.add(new Mascota(R.drawable.m7, "Duke", 5));
        return  mascotas;
        */
        BaseDatos db = new BaseDatos(context);
        insertarTresMascotas(db);
        return db.obtenerTodasLasMascotas();
    }

    public void insertarTresMascotas(BaseDatos db){
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Firulais");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.m2);

        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Duke");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.m3);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Pepé");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.m4);
        db.insertarMascota(contentValues);


    }

    public void darRaitingMascota(Mascota mascota){
        //Abrir la base de datos
        BaseDatos db = new BaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_RAITING_MASCOTA_ID_MASCOTA, mascota.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_RAITING_MASCOTA_NUMERORAITING, RAITING);
        db.insertarRaitingMascota(contentValues);

    }

    public int obtenerRaitingMascota(Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        return db.obtenerRaintingMascota(mascota);
    }


}
