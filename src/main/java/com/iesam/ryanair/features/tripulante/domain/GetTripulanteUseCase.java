package com.iesam.ryanair.features.tripulante.domain;

public class GetTripulanteUseCase {
    public final TripulanteRepository tripulanteRepository;

    public GetTripulanteUseCase(TripulanteRepository tripulanteRepository) {
        this.tripulanteRepository = tripulanteRepository;
    }

    public Tripulante execute(String dni) {
        return tripulanteRepository.obtain(dni);
    }
}
