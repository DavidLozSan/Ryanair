package com.iesam.ryanair.features.pasajero.domain;

public class SavePasajeroUseCase {
    public final PasajeroRepository pasajeroRepository;

    public SavePasajeroUseCase(PasajeroRepository pasajeroRepository) {
        this.pasajeroRepository = pasajeroRepository;
    }

    public void execute(Pasajero pasajero) {
        this.pasajeroRepository.save(pasajero);
    }
}
