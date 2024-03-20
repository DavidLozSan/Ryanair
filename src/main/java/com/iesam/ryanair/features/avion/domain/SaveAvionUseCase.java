package com.iesam.ryanair.features.avion.domain;

public class SaveAvionUseCase {
    public final AvionRepository avionRepository;

    public SaveAvionUseCase(AvionRepository avionRepository) {
        this.avionRepository = avionRepository;
    }

    public void execute(Avion avion) {
        this.avionRepository.save(avion);
    }
}
