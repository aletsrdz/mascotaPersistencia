package rdz.alets.mascotaspractica.pojo;

/**
 * Created by AlexRdz on 27/09/2017.
 */

public class Perfil {
    private int fotoPerfil;
    private int likePerfil;
    private String pefilName;

    public Perfil(int fotoPerfil, int likePerfil) {
        this.fotoPerfil = fotoPerfil;
        this.likePerfil = likePerfil;
    }

    public Perfil(int fotoPerfil, String pefilName) {
        this.fotoPerfil = fotoPerfil;
        this.pefilName = pefilName;
    }

    public int getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(int fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public int getLikePerfil() {
        return likePerfil;
    }

    public void setLikePerfil(int likePerfil) {
        this.likePerfil = likePerfil;
    }

    public String getPefilName() {
        return pefilName;
    }

    public void setPefilName(String pefilName) {
        this.pefilName = pefilName;
    }
}
