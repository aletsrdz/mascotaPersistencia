package rdz.alets.mascotaspractica.db;

/**
 * Created by AlexRdz on 29/09/2017.
 */

public class ConstantesBaseDatos {

    public static final String DATABASE_NAME = "mascotas";
    public static final int DATABASE_VERSION = 1;

    public static final String TABLE_MASCOTA            = "mascota";
    public static final String TABLE_MASCOTA_ID         = "id";
    public static final String TABLE_MASCOTA_NOMBRE     = "nombre";
    public static final String TABLE_MASCOTA_FOTO       = "foto";

    public static final String TABLE_RAITING_MASCOTA                = "mascota_raiting";
    public static final String TABLE_RAITING_MASCOTA_ID             = "id";
    public static final String TABLE_RAITING_MASCOTA_ID_MASCOTA     = "id_mascota";
    public static final String TABLE_RAITING_MASCOTA_NUMERORAITING  = "numero_raiting" ;
}
