package com.iesam.ryanair.features.tripulante.domain;

public interface TripulanteRepository {
    void save(Tripulante tripulante);
    Tripulante obtain(String dni);
}
