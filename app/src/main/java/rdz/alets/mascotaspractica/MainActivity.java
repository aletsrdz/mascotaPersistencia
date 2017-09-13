package rdz.alets.mascotaspractica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        ImageView miActionView = (ImageView) findViewById(R.id.imgEstrella5);


        

        listaMascotas = (RecyclerView)findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        inicializarListaMasctotas();
        inicialiazarAdaptador();

        miActionView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, MascotasFavoritas.class);
                startActivity(intent);

            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mcontacto:
                Intent intentContacto = new Intent(this, ActivityContacto.class);
                startActivity(intentContacto);
                break;
            case R.id.mabout:
                Intent intentAbout = new Intent(this, ActivityAbout.class);
                startActivity(intentAbout);
                break;
            case R.id.mHuellita:
                Intent intentFavorito = new Intent(MainActivity.this, MascotasFavoritas.class);
                startActivity(intentFavorito);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void inicialiazarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);

    }

    public void inicializarListaMasctotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.m3, "Firulais", "3"));
        mascotas.add(new Mascota(R.drawable.m4, "Dago", "4"));
        mascotas.add(new Mascota(R.drawable.m5, "Chispita", "5"));
        mascotas.add(new Mascota(R.drawable.m6, "Chimuelo", "4"));
        mascotas.add(new Mascota(R.drawable.m7, "Duke", "5"));
    }
}
