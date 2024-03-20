package com.iesam.ryanair.features.vuelo.data;

import com.iesam.ryanair.features.vuelo.data.local.VueloMemLocalDataSource;
import com.iesam.ryanair.features.vuelo.domain.Vuelo;
import com.iesam.ryanair.features.vuelo.domain.VueloRepository;

import java.util.List;

public class VueloDataRepository implements VueloRepository {
    private VueloMemLocalDataSource vueloMemLocalDataSource;

    public VueloDataRepository() {
        this.vueloMemLocalDataSource = vueloMemLocalDataSource.newInstance();
    }

    @Override
    public void save(Vuelo vuelo) {
        vueloMemLocalDataSource.save(vuelo);
    }

    @Override
    public Vuelo obtain(String codigo) {
        return vueloMemLocalDataSource.findByCodigo(codigo);
    }

    @Override
    public Boolean getAvion(String codAvion) {
        List<Vuelo> vuelos = vueloMemLocalDataSource.findAll();
        for (Vuelo vuelo: vuelos) {
            if (vuelo.getAvion().getCodAvion()==codAvion) {
                return true;
            }
        }
        return false;
    }
}
