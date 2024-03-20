package com.iesam.ryanair.features.avion.domain;

public class GetAvionUseCase {
    public final AvionRepository avionRepository;

    public GetAvionUseCase(AvionRepository avionRepository) {
        this.avionRepository = avionRepository;
    }

    public Avion execute(String codAvion) {
        return avionRepository.obtain(codAvion);
    }
}
