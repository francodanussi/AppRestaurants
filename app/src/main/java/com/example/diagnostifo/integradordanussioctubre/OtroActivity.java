package com.example.diagnostifo.integradordanussioctubre;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OtroActivity extends AppCompatActivity implements FragmentRecyclerTrago.SeleccionableDeTragos {

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otro);

        FragmentRecyclerTrago formularioFragment = new FragmentRecyclerTrago();

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.aca_va_el_fragment,formularioFragment);
        fragmentTransaction.commit();

        Intent unIntent = getIntent();
        Bundle unBundle = unIntent.getExtras();
        formularioFragment.setArguments(unBundle);
    }

    @Override
    public void SeleccionableDeTragos(Trago unTrago) {
        fragmentTransaction = fragmentManager.beginTransaction();
        FragmentDetalleTrago fragmentDetalleTrago = new FragmentDetalleTrago();
        fragmentTransaction.add(R.id.aca_va_el_fragment, fragmentDetalleTrago);

        Bundle unBundle = new Bundle();
        unBundle.putInt(FragmentDetalleTrago.KEY_IMAGEN,unTrago.getImagenTrago());
        unBundle.putString(FragmentDetalleTrago.KEY_NOMBRE,unTrago.getNombre());
        unBundle.putString(FragmentDetalleTrago.KEY_DESCRIPCION,unTrago.getDescripcionTrago());

        fragmentDetalleTrago.setArguments(unBundle);

        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
