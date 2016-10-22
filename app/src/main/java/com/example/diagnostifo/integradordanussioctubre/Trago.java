package com.example.diagnostifo.integradordanussioctubre;

/**
 * Created by Diagnostifo on 21/10/2016.
 */
public class Trago {
    private String nombre;
    private String descripcionTrago;
    private int imagenTrago;

    public Trago(String nombre, String descripcionTrago, int imagenTrago) {
        this.nombre = nombre;
        this.descripcionTrago = descripcionTrago;
        this.imagenTrago = imagenTrago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcionTrago() {
        return descripcionTrago;
    }

    public void setDescripcionTrago(String descripcionTrago) {
        this.descripcionTrago = descripcionTrago;
    }

    public int getImagenTrago() {
        return imagenTrago;
    }

    public void setImagenTrago(int imagenTrago) {
        this.imagenTrago = imagenTrago;
    }
}
