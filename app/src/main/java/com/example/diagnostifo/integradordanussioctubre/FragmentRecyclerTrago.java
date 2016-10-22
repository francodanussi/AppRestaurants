package com.example.diagnostifo.integradordanussioctubre;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentRecyclerTrago extends Fragment {

    List<Trago> listaDeTragos;
    RecyclerView recyclerViewTragos;
    private SeleccionableDeTragos activityQueMeContiene;
    AdapterRecyclerViewTrago adaptadorTragosRecycler;

    public FragmentRecyclerTrago() {
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        activityQueMeContiene = (SeleccionableDeTragos) activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycler_trago, container, false);

        listaDeTragos = new ArrayList<>();
        llenarListaConTragos();

        recyclerViewTragos = (RecyclerView)view.findViewById(R.id.recyclerViewTragos);

        recyclerViewTragos.setHasFixedSize(true);

        recyclerViewTragos.setLayoutManager(new LinearLayoutManager(view.getContext(),LinearLayoutManager.VERTICAL,false));

        adaptadorTragosRecycler = new AdapterRecyclerViewTrago(listaDeTragos,view.getContext());

        recyclerViewTragos.setAdapter(adaptadorTragosRecycler);

        ListenerDeTragos unListenerDeTragos = new ListenerDeTragos();

        adaptadorTragosRecycler.setListener(unListenerDeTragos);

        return view;

    }

    public void llenarListaConTragos(){

        listaDeTragos.add(new Trago("Manhattan", "El Manhattan es un cóctel clásico a base de whiskey (de centeno o canadiense) y vermut rojo, que se suele tomar como aperitivo.", R.drawable.manhattan));
        listaDeTragos.add(new Trago("Martini", "El martini o martini seco (Dry Martini en inglés) es uno de los cócteles más conocidos, compuesto de ginebra con un chorro de vermú. Suele servirse en copa de cóctel, adornado con una aceituna cruzada. Existen numerosas variantes del martini, aunque quizás la más conocida sea el Vodka martini, en el que se sustituye la ginebra por vodka.", R.drawable.martini));
        listaDeTragos.add(new Trago("Negroni", "El Negroni es un cóctel preparado a base de Gin, Campari y Vermú", R.drawable.negroni));
    }

    public interface SeleccionableDeTragos{
        public void SeleccionableDeTragos(Trago unTrago);
    }

    public class ListenerDeTragos implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            List<Trago>listaDeTragos = adaptadorTragosRecycler.getListaDeTragos();
            Trago unTrago = listaDeTragos.get(recyclerViewTragos.getChildAdapterPosition(view));
            activityQueMeContiene.SeleccionableDeTragos(unTrago);
        }
    }

}
