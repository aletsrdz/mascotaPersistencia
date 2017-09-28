package rdz.alets.mascotaspractica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import rdz.alets.mascotaspractica.adapter.MascotaAdaptador;
import rdz.alets.mascotaspractica.pojo.Mascota;

public class MascotasFavoritas extends AppCompatActivity {

    ArrayList<Mascota> mascotasFav;
    RecyclerView listaMascotasFav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        Toolbar miActionBarFav = (Toolbar)findViewById(R.id.miActionBarFav);
        setSupportActionBar(miActionBarFav);

        ImageView imgBack = (ImageView)findViewById(R.id.imgBack);

        listaMascotasFav = (RecyclerView)findViewById(R.id.rvMascotasFav);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotasFav.setLayoutManager(llm);

        inicializarListaMasctotasFav();
        inicialiazarAdaptadorFav();

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }

    public void inicialiazarAdaptadorFav(){
        MascotaAdaptador adaptadorFav = new MascotaAdaptador(mascotasFav, this);
        listaMascotasFav.setAdapter(adaptadorFav);
    }

    public void inicializarListaMasctotasFav(){
        mascotasFav = new ArrayList<Mascota>();
        mascotasFav.add(new Mascota(R.drawable.m3, "Favorito Firulais", 3));
        mascotasFav.add(new Mascota(R.drawable.m4, "Favorito Dago", 4));
        mascotasFav.add(new Mascota(R.drawable.m5, "Favorito Chispita", 5));
        mascotasFav.add(new Mascota(R.drawable.m6, "Favorito Chimuelo", 4));
        mascotasFav.add(new Mascota(R.drawable.m7, "Favorito Duke", 5));
    }
}
