package com.devmark.colecciones.vuelos.model;

import java.util.Date;

public class Vuelo {

    private String nombre;

    private String origen;

    private Date fecha;

    private String destino;

    private int numPasajeros;

    public Vuelo() {
    }

    public Vuelo(String nombre, String origen, Date fecha, String destino, int numPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.fecha = fecha;
        this.destino = destino;
        this.numPasajeros = numPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getDestino() {
        return destino;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }
}
