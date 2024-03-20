package com.iesam.ryanair.features.avion.domain;

public class Avion {
    public final String codAvion;
    public final String nombre;
    public final String modelo;
    public final String asientos;

    public Avion(String codAvion, String nombre, String modelo, String asientos) {
        this.codAvion = codAvion;
        this.nombre = nombre;
        this.modelo = modelo;
        this.asientos = asientos;
    }

    public String getCodAvion() {
        return codAvion;
    }
}
