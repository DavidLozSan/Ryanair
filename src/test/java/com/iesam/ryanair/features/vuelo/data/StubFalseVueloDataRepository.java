package com.iesam.ryanair.features.vuelo.data;

import com.iesam.ryanair.features.vuelo.domain.Vuelo;
import com.iesam.ryanair.features.vuelo.domain.VueloRepository;

public class StubFalseVueloDataRepository implements VueloRepository {
    @Override
    public void save(Vuelo vuelo) {

    }

    @Override
    public Vuelo obtain(String codigo) {
        return null;
    }

    @Override
    public Boolean getAvion(String codAvion) {
        if (codAvion=="1") {
            return true;
        } else {
            return false;
        }
    }
}
