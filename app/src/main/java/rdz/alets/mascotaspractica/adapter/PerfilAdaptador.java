package rdz.alets.mascotaspractica.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import rdz.alets.mascotaspractica.R;
import rdz.alets.mascotaspractica.pojo.Mascota;

/**
 * Created by AlexRdz on 27/09/2017.
 */

public class PerfilAdaptador extends RecyclerView.Adapter<PerfilAdaptador.PerfilViewHolder> {

    ArrayList<Mascota> mascotas;
    Activity activity;

    public PerfilAdaptador(ArrayList<Mascota> mascotas, Activity activity) {
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @Override
    public PerfilViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_perfil, parent, false);
        return new PerfilViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PerfilViewHolder perfilViewHolder, int position) {
        Mascota mascota = mascotas.get(position);
        perfilViewHolder.imgPerfil.setImageResource(mascota.getFoto());
        perfilViewHolder.tvRaintingCV2.setText(String.valueOf(mascota.getRaiting()));

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class PerfilViewHolder extends  RecyclerView.ViewHolder{
        private ImageView imgPerfil;
        private TextView  tvRaintingCV2;
        private ImageView imgHuesoAmarilloPerfil;


        public PerfilViewHolder(View itemView) {
            super(itemView);

            imgPerfil               = (ImageView)itemView.findViewById(R.id.imgPerfil);
            tvRaintingCV2           = (TextView)itemView.findViewById(R.id.tvRaitingCV2);
            imgHuesoAmarilloPerfil  = (ImageView)itemView.findViewById(R.id.imgHuesoAmarilloPerfil);
        }
    }

}

