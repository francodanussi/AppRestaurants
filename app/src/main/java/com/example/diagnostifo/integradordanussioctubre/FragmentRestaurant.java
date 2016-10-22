package com.example.diagnostifo.integradordanussioctubre;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentRestaurant extends Fragment {

    public final static String NUMERODEFRAGMENT="numeroDeFragment";
    public final static String IMAGEN="imagen";
    public final static String NOMBRE="nombre";
    public final static String LUGAR="lugar";
    private int numeroDeFragmento;

    public FragmentRestaurant() {
    }

    public static FragmentRestaurant dameUnFragmentDeRestaurant(int numeroDeFragmento, int imagen, String nombre, String lugar) {
        FragmentRestaurant fragmentRestaurant = new FragmentRestaurant();
        Bundle unBundle = new Bundle();
        unBundle.putInt(NUMERODEFRAGMENT, numeroDeFragmento);
        unBundle.putInt(IMAGEN, imagen);
        unBundle.putString(NOMBRE, nombre);
        unBundle.putString(LUGAR, lugar);
        fragmentRestaurant.setArguments(unBundle);
        return fragmentRestaurant;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurant, container, false);
        Bundle unBundle = getArguments();
        this.numeroDeFragmento = unBundle.getInt(NUMERODEFRAGMENT);
        int imagenRestaurant = unBundle.getInt(IMAGEN);
        String nombreRestaurant = unBundle.getString(NOMBRE);
        String lugarRestaurant = unBundle.getString(LUGAR);

        ImageView imageViewImagen = (ImageView)view.findViewById(R.id.imagenRestaurant);
        TextView textViewNombre = (TextView)view.findViewById(R.id.nombreRestaurant);
        TextView textViewLugar = (TextView)view.findViewById(R.id.lugarRestaurant);

        imageViewImagen.setImageResource(imagenRestaurant);
        textViewNombre.setText(nombreRestaurant);
        textViewLugar.setText(lugarRestaurant);

        return  view;
    }
}
