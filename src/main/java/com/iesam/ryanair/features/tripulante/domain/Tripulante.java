package com.iesam.ryanair.features.tripulante.domain;

public class Tripulante {
    public final String dni;
    public final String nombre;
    public final String apellidos;
    public final String cargo;

    public Tripulante(String dni, String nombre, String apellidos, String cargo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cargo = cargo;
    }

    public String getDni() {
        return dni;
    }
}
