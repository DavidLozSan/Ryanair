package com.iesam.ryanair.features.avion.domain;

public interface AvionRepository {
    void save(Avion avion);
    Avion obtain(String codAvion);
}
