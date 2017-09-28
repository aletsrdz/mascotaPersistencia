package rdz.alets.mascotaspractica.pojo;

/**
 * Created by AletsRdz on 03/09/17.
 */

public class Mascota {
    private int id;
    private int foto;
    private String nombre;
    private int raiting;


    public Mascota(int foto, String nombre, int raiting) {
        this.foto = foto;
        this.nombre = nombre;
        this.raiting = raiting;
    }

    public Mascota(int foto, int raiting){
        this.foto = foto;
        this.raiting = raiting;
    }

    public Mascota(){

    }



    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto)
    {
        this.foto = foto;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }
}
