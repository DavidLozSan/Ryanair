package com.iesam.ryanair.features.vuelo.data.local;

import com.iesam.ryanair.features.vuelo.domain.Vuelo;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class VueloMemLocalDataSource {

    private Map<String, Vuelo> dataStore = new TreeMap<>();
    private VueloMemLocalDataSource instance = null;

    public void save(Vuelo model) {
        dataStore.put(model.getCodigo(), model);
    }

    public void saveList(List<Vuelo> models) {
        for (Vuelo demo : models) {
            save(demo);
        }
    }

    public Vuelo findByCodigo(String codigo) {
        return dataStore.get(codigo);
    }

    public List<Vuelo> findAll() {
        return dataStore.values().stream().toList();
    }

    public void delete(String modelCodigo) {
        dataStore.remove(modelCodigo);
    }

    public VueloMemLocalDataSource newInstance() {
        if (instance == null) {
            instance = new VueloMemLocalDataSource();
        }
        return instance;
    }
}
