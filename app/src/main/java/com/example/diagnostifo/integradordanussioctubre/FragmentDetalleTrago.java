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
public class FragmentDetalleTrago extends Fragment {

        public static final String KEY_NOMBRE = "nombreTrago";
        public static final String KEY_DESCRIPCION = "descripcionTrago";
        public static final String KEY_IMAGEN = "imagenTrago";

    public FragmentDetalleTrago() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detalle_trago, container, false);
        Bundle unBundle = getArguments();

        int imagenDeTrago = unBundle.getInt(KEY_IMAGEN);
        String nombreDeTrago = unBundle.getString(KEY_NOMBRE);
        String descripcionDeTrago = unBundle.getString(KEY_DESCRIPCION);

        ImageView ImageViewImagenTrago = (ImageView)view.findViewById(R.id.imageViewDetalleTrago);
        TextView TextViewNombreTrago = (TextView)view.findViewById(R.id.textViewNombreDetalleTrago);
        TextView TextViewDescripcionTrago = (TextView)view.findViewById(R.id.textViewDescripcionDetalleTrago);

        ImageViewImagenTrago.setImageResource(imagenDeTrago);
        TextViewNombreTrago.setText(nombreDeTrago);
        TextViewDescripcionTrago.setText(descripcionDeTrago);

        return view;
    }
}
