package com.iesam.ryanair.features.vuelo.domain;

public interface VueloRepository {
    void save(Vuelo vuelo);
    Vuelo obtain(String codigo);
    Boolean getAvion(String codAvion);
}
