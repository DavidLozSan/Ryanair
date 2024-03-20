package com.iesam.ryanair.features.vuelo.domain;

import com.iesam.ryanair.features.avion.domain.Avion;
import com.iesam.ryanair.features.pasajero.domain.Pasajero;
import com.iesam.ryanair.features.tripulante.domain.Tripulante;

import java.util.ArrayList;

public class Vuelo {
    public final String codigo;
    public final Avion avion;
    public final ArrayList<Tripulante> tripulantes;
    public final ArrayList<Pasajero> pasajeros;
    public final String fecha;
    public final String hora;
    public final String precio;
    public final String origen;
    public final String destino;

    public Vuelo(String codigo, Avion avion, ArrayList<Tripulante> tripulantes, ArrayList<Pasajero> pasajeros, String fecha, String hora, String precio, String origen, String destino) {
        this.codigo = codigo;
        this.avion = avion;
        this.tripulantes = tripulantes;
        this.pasajeros = pasajeros;
        this.fecha = fecha;
        this.hora = hora;
        this.precio = precio;
        this.origen = origen;
        this.destino = destino;
    }

    public String getCodigo() {
        return codigo;
    }

    public Avion getAvion() {
        return avion;
    }
}
