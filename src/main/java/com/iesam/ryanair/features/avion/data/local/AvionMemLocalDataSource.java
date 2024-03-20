package com.iesam.ryanair.features.avion.data.local;

import com.iesam.ryanair.features.avion.domain.Avion;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AvionMemLocalDataSource {

    private Map<String, Avion> dataStore = new TreeMap<>();
    private static AvionMemLocalDataSource instance = null;

    public void save(Avion model) {
        dataStore.put(model.getCodAvion(), model);
    }

    public void saveList(List<Avion> models) {
        for (Avion demo : models) {
            save(demo);
        }
    }

    public Avion findByCodAvion(String codAvion) {
        return dataStore.get(codAvion);
    }

    public List<Avion> findAll() {
        return dataStore.values().stream().toList();
    }

    public void delete(String modelCodAvion) {
        dataStore.remove(modelCodAvion);
    }

    public static AvionMemLocalDataSource newInstance() {
        if (instance == null) {
            instance = new AvionMemLocalDataSource();
        }
        return instance;
    }
}
