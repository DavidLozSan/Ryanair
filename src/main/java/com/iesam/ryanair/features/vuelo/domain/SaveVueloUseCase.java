package com.iesam.ryanair.features.vuelo.domain;

public class SaveVueloUseCase {
    public final VueloRepository vueloRepository;

    public SaveVueloUseCase(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }

    public void execute(Vuelo vuelo) {
        this.vueloRepository.save(vuelo);
    }
}
