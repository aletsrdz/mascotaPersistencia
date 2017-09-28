package rdz.alets.mascotaspractica.adapter;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;

import rdz.alets.mascotaspractica.MascotasFavoritas;
import rdz.alets.mascotaspractica.pojo.Mascota;
import rdz.alets.mascotaspractica.R;

/**
 * Created by AletsRdz on 03/09/17.
 */

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {

    private ArrayList<Mascota> mascotas;
    private Activity activity;

    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity) {
        this.mascotas = mascotas;
        this.activity = activity;
    }

    //le da vida al CardView -- Inflar el layout y lo pasará al view holder para que el obtenga los valores
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);
        return new MascotaViewHolder(v);
    }

    //asocia cada elemento a la lista con cada view
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);

        mascotaViewHolder.imgFoto.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvNombreCV.setText(mascota.getNombre());
        mascotaViewHolder.tvRaitingCV.setText(String.valueOf(mascota.getRaiting()));
        //mascotaViewHolder.btnHuesoBlanco.setImageResource(R.drawable.huesoblanco);
        //mascotaViewHolder.btnHuesoAmarillo.setImageResource(R.drawable.huesoamarillo);

        mascotaViewHolder.imgFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, mascota.getNombre(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(activity, MascotasFavoritas.class);
                intent.putExtra("nombre", mascota.getNombre());
                activity.startActivity(intent);
            }
        });

        mascotaViewHolder.btnHuesoBlanco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, "Diste me gusta a" + mascota.getNombre(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() { //cantidad de elementos que contiene mi lista Mascotas
        return mascotas.size();
    }



    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgFoto;
        private ImageButton btnHuesoBlanco;
        private TextView tvNombreCV;
        private TextView tvRaitingCV;
        //private ImageButton btnHuesoAmarillo;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgFoto               = (ImageView)itemView.findViewById(R.id.imgFoto);
            tvNombreCV            = (TextView)itemView.findViewById(R.id.tvNombreCV);
            tvRaitingCV           = (TextView)itemView.findViewById(R.id.tvRaitingCV);
            btnHuesoBlanco        = (ImageButton)itemView.findViewById(R.id.btnHuesoBlanco);
            //btnHuesoAmarillo    = (ImageButton)itemView.findViewById(R.id.btnHuesoAmarillo);
        }
    }


}
