package com.example.diagnostifo.integradordanussioctubre;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Diagnostifo on 21/10/2016.
 */
public class AdapterRecyclerViewTrago extends RecyclerView.Adapter implements View.OnClickListener {

    private Context uncontext;
    private List<Trago> listaDeTragos;
    private View.OnClickListener listener;

    public void setListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    public List<Trago> getListaDeTragos() {
        return listaDeTragos;
    }

    public AdapterRecyclerViewTrago(List<Trago> listaDeTragos, Context contexto) {
        this.listaDeTragos = listaDeTragos;
        this.uncontext = contexto;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = (LayoutInflater)LayoutInflater.from(parent.getContext());

        View viewDeCeldaTrago = inflater.inflate(R.layout.celda_trago, parent, false);

        TragosViewHolder tragosViewHolder = new TragosViewHolder(viewDeCeldaTrago);

        viewDeCeldaTrago.setOnClickListener(this);

        return tragosViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Trago unTrago = listaDeTragos.get(position);
        TragosViewHolder TragosViewHolder = (TragosViewHolder) holder;
        TragosViewHolder.cargarTrago(unTrago);
    }

    @Override
    public int getItemCount() {
        return listaDeTragos.size();
    }

    @Override
    public void onClick(View view) {
        listener.onClick(view);
    }

    private class TragosViewHolder extends RecyclerView.ViewHolder {
        private ImageView imagenTrago;
        private TextView nombreTrago;

        public TragosViewHolder(View view) {
            super(view);
            imagenTrago = (ImageView) view.findViewById(R.id.imagenCeldaTrago);
            nombreTrago = (TextView) view.findViewById(R.id.nombreCeldaTrago);
        }

        public void cargarTrago (Trago unTrago) {
           imagenTrago.setImageResource(unTrago.getImagenTrago());
            nombreTrago.setText(unTrago.getNombre().toString());
        }
    }
}
