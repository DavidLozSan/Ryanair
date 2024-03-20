package com.iesam.ryanair.features.vuelo.domain;

public class GetVueloUseCase {
    public final VueloRepository vueloRepository;

    public GetVueloUseCase(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }

    public Vuelo execute(String codigo) {
        return vueloRepository.obtain(codigo);
    }
}
