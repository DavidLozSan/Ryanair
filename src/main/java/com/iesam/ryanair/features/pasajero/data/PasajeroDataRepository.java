package com.iesam.ryanair.features.pasajero.data;

import com.iesam.ryanair.features.pasajero.data.local.PasajeroMemLocalDataSource;
import com.iesam.ryanair.features.pasajero.domain.Pasajero;
import com.iesam.ryanair.features.pasajero.domain.PasajeroRepository;

public class PasajeroDataRepository implements PasajeroRepository {
    private PasajeroMemLocalDataSource pasajeroMemLocalDataSource;

    public PasajeroDataRepository() {
        this.pasajeroMemLocalDataSource = pasajeroMemLocalDataSource.newInstance();
    }

    @Override
    public void save(Pasajero pasajero) {
        pasajeroMemLocalDataSource.save(pasajero);
    }

    @Override
    public Pasajero obtain(String dni) {
        return pasajeroMemLocalDataSource.findByDni(dni);
    }
}
