package com.iesam.ryanair;


import com.iesam.ryanair.features.avion.domain.Avion;
import com.iesam.ryanair.features.avion.presentation.AvionPresentation;
import com.iesam.ryanair.features.pasajero.domain.Pasajero;
import com.iesam.ryanair.features.pasajero.presentation.PasajeroPresentation;
import com.iesam.ryanair.features.tripulante.domain.Tripulante;
import com.iesam.ryanair.features.tripulante.presentation.TripulantePresentation;
import com.iesam.ryanair.features.vuelo.domain.Vuelo;
import com.iesam.ryanair.features.vuelo.presentation.VueloPresentation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TripulantePresentation.save(new Tripulante("700001", "Empleado1", "EmpleadoApellido1", "Piloto"));
        TripulantePresentation.save(new Tripulante("700002", "Empleado2", "EmpleadoApellido2", "Piloto"));
        TripulantePresentation.save(new Tripulante("700003", "Empleado3", "EmpleadoApellido3", "Azafata"));

        PasajeroPresentation.save(new Pasajero("800001", "Pasajero1", "PasajeroApellido1", "Avila", "Avila"));
        PasajeroPresentation.save(new Pasajero("800002", "Pasajero2", "PasajeroApellido2", "Avila", "Avila"));

        AvionPresentation.save(new Avion("100001", "Pajarito", "Boing701", "200"));
        AvionPresentation.save(new Avion("100002", "Nube", "Boing705", "250"));
        AvionPresentation.save(new Avion("100003", "Rayo", "Boing710", "100"));

        ArrayList<Tripulante> tripulantes = new ArrayList<>();
        tripulantes.add(TripulantePresentation.obtain("700001"));
        tripulantes.add(TripulantePresentation.obtain("700003"));

        ArrayList<Pasajero> pasajeros = new ArrayList<>();
        pasajeros.add(PasajeroPresentation.obtain("800001"));
        pasajeros.add(PasajeroPresentation.obtain("800002"));

        VueloPresentation.save(new Vuelo("1", AvionPresentation.obtain("100001"), tripulantes, pasajeros, "10/02/2024", "10:30", "90e", "Madrid", "Barcelona"));
        VueloPresentation.obtain("1");
        System.out.println(VueloPresentation.getAvion("100001"));
        System.out.println(VueloPresentation.getAvion("100002"));
    }
}