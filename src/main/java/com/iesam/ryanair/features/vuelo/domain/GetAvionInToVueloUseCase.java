package com.iesam.ryanair.features.vuelo.domain;

public class GetAvionInToVueloUseCase {
    public final VueloRepository vueloRepository;

    public GetAvionInToVueloUseCase(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }

    public Boolean execute(String codAvion) {
        return vueloRepository.getAvion(codAvion);
    }
}
