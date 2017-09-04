package rdz.alets.mascotaspractica;

/**
 * Created by AletsRdz on 03/09/17.
 */

public class Mascota {

    private int foto;
    private String nombre;

    public String getRaiting() {
        return raiting;
    }

    public void setRaiting(String raiting) {
        this.raiting = raiting;
    }

    private String raiting;

    public Mascota(int foto, String nombre, String raiting) {
        this.foto = foto;
        this.nombre = nombre;
        this.raiting = raiting;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
