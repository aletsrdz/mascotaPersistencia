package rdz.alets.mascotaspractica;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by AletsRdz on 03/09/17.
 */

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {

    ArrayList<Mascota> mascotas;

    public MascotaAdaptador(ArrayList<Mascota> mascotas){

        this.mascotas = mascotas;
    }



    //le da vida al CardView -- Inflar el layout y lo pasará al view holder para que el obtenga los valores
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);
        return new MascotaViewHolder(v);
    }

    //asocia cada elemento a la lista con cada view
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int position) {
        Mascota mascota = mascotas.get(position);
        mascotaViewHolder.imgFoto.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvNombreCV.setText(mascota.getNombre());
        mascotaViewHolder.tvRaitingCV.setText(mascota.getRaiting());
        //mascotaViewHolder.btnHuesoBlanco.setImageResource(R.drawable.huesoblanco);
        //mascotaViewHolder.btnHuesoAmarillo.setImageResource(R.drawable.huesoamarillo);


    }

    @Override
    public int getItemCount() { //cantidad de elementos que contiene mi lista Mascotas
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgFoto;
        //private ImageButton btnHuesoBlanco;
        private TextView tvNombreCV;
        private TextView tvRaitingCV;
        //private ImageButton btnHuesoAmarillo;



        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgFoto               = (ImageView)itemView.findViewById(R.id.imgFoto);
            tvNombreCV            = (TextView)itemView.findViewById(R.id.tvNombreCV);
            tvRaitingCV           = (TextView)itemView.findViewById(R.id.tvRaitingCV);
            //btnHuesoBlanco      = (ImageButton)itemView.findViewById(R.id.btnHuesoBlanco);
            //btnHuesoAmarillo    = (ImageButton)itemView.findViewById(R.id.btnHuesoAmarillo);
        }
    }


}
