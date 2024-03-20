package com.iesam.ryanair.features.pasajero.domain;

public class Pasajero {
    public final String dni;
    public final String nombre;
    public final String apellidos;
    public final String localidad;
    public final String provincia;

    public Pasajero(String dni, String nombre, String apellidos, String localidad, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    public String getDni() {
        return dni;
    }
}
