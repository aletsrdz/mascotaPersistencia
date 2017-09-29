package rdz.alets.mascotaspractica.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

import rdz.alets.mascotaspractica.pojo.Mascota;

/**
 * Created by AlexRdz on 28/09/2017.
 */

public class BaseDatos extends SQLiteOpenHelper {

    private Context context;

    public BaseDatos(Context context) {
        super(context, ConstantesBaseDatos.DATABASE_NAME, null, ConstantesBaseDatos.DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String queryCrearTablaMascota = "CREATE TABLE " + ConstantesBaseDatos.TABLE_MASCOTA + "(" +
                                        ConstantesBaseDatos.TABLE_MASCOTA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                        ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE + " TEXT, " +
                                        ConstantesBaseDatos.TABLE_MASCOTA_FOTO + " INTEGER" +
                                        ")";
        String queryCrearTablaMascotasRaiting = "CREATE TABLE " + ConstantesBaseDatos.TABLE_RAITING_MASCOTA + "(" +
                                        ConstantesBaseDatos.TABLE_RAITING_MASCOTA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                        ConstantesBaseDatos.TABLE_RAITING_MASCOTA_ID_MASCOTA + " INTEGER, " +
                                        ConstantesBaseDatos.TABLE_RAITING_MASCOTA_NUMERORAITING + " INTEGER," +
                                        "FOREIGN KEY (" + ConstantesBaseDatos.TABLE_RAITING_MASCOTA_ID_MASCOTA + ") " +
                                        "REFERENCES " + ConstantesBaseDatos.TABLE_MASCOTA + "(" + ConstantesBaseDatos.TABLE_MASCOTA_ID + ")" +
                                        ")";
        db.execSQL(queryCrearTablaMascota);
        db.execSQL(queryCrearTablaMascotasRaiting);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST " + ConstantesBaseDatos.TABLE_MASCOTA);
        db.execSQL("DROP TABLE IF EXIST " + ConstantesBaseDatos.TABLE_RAITING_MASCOTA);
        onCreate(db);
    }

    public ArrayList<Mascota>  obtenerTodasLasMascotas(){
        ArrayList<Mascota> mascotas = new ArrayList<>();

        String query = "SELECT * FROM " + ConstantesBaseDatos.TABLE_MASCOTA;
        SQLiteDatabase db = this.getWritableDatabase();
        //Resultado del query es un cursor
        Cursor registros = db.rawQuery(query, null);

        //Para recorrer los registros sera con un bucle

        while (registros.moveToNext()){
            Mascota mascotaActual = new Mascota();
            mascotaActual.setId(registros.getInt(0));
            mascotaActual.setNombre(registros.getString(1));
            mascotaActual.setFoto(registros.getInt(2));

            String queryRaiting = "SELECT COUNT("+ConstantesBaseDatos.TABLE_RAITING_MASCOTA_NUMERORAITING+") as raiting " +
                                " FROM " + ConstantesBaseDatos.TABLE_RAITING_MASCOTA +
                                " WHERE " + ConstantesBaseDatos.TABLE_RAITING_MASCOTA_ID_MASCOTA + "=" + mascotaActual.getId();

            Cursor registrosRainting = db.rawQuery(queryRaiting, null);
            if(registrosRainting.moveToNext()){
                mascotaActual.setRaiting(registrosRainting.getInt(0));
            }else{
                mascotaActual.setRaiting(0);
            }
            // a la lista mascotas se le agrega los registros
            mascotas.add(mascotaActual);
        }

        db.close();
        return mascotas;

    }

    public void insertarMascota(ContentValues contentValues){
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(ConstantesBaseDatos.TABLE_MASCOTA, null, contentValues);
        db.close();

    }

    public void insertarRaitingMascota(ContentValues contentValues){
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(ConstantesBaseDatos.TABLE_RAITING_MASCOTA, null, contentValues);
        db.close();

    }

    public int obtenerRaintingMascota(Mascota mascota){
        int rainting = 0;

        String query = "SELECT COUNT("+ConstantesBaseDatos.TABLE_RAITING_MASCOTA_NUMERORAITING+")"+
                        " FROM " + ConstantesBaseDatos.TABLE_RAITING_MASCOTA +
                        " WHERE " + ConstantesBaseDatos.TABLE_RAITING_MASCOTA_ID_MASCOTA + "="+mascota.getId();

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor registros = db.rawQuery(query,null);

        if(registros.moveToNext()){
            rainting = registros.getInt(0);
        }
        db.close();
        return rainting;
    }

}
