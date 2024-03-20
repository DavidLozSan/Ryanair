package com.iesam.ryanair.features.pasajero.domain;

public interface PasajeroRepository {
    void save(Pasajero pasajero);
    Pasajero obtain(String dni);
}
