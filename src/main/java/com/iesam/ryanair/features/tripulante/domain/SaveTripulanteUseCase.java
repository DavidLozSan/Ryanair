package com.iesam.ryanair.features.tripulante.domain;

public class SaveTripulanteUseCase {
    public final TripulanteRepository tripulanteRepository;

    public SaveTripulanteUseCase(TripulanteRepository tripulanteRepository) {
        this.tripulanteRepository = tripulanteRepository;
    }

    public void execute(Tripulante tripulante) {
        this.tripulanteRepository.save(tripulante);
    }
}
