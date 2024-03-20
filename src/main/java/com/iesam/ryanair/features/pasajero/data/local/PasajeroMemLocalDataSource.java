package com.iesam.ryanair.features.pasajero.data.local;

import com.iesam.ryanair.features.pasajero.domain.Pasajero;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PasajeroMemLocalDataSource {

    private Map<String, Pasajero> dataStore = new TreeMap<>();
    private static PasajeroMemLocalDataSource instance = null;

    public void save(Pasajero model) {
        dataStore.put(model.getDni(), model);
    }

    public void saveList(List<Pasajero> models) {
        for (Pasajero demo : models) {
            save(demo);
        }
    }

    public Pasajero findByDni(String dni) {
        return dataStore.get(dni);
    }

    public List<Pasajero> findAll() {
        return dataStore.values().stream().toList();
    }

    public void delete(String modelDni) {
        dataStore.remove(modelDni);
    }

    public static PasajeroMemLocalDataSource newInstance() {
        if (instance == null) {
            instance = new PasajeroMemLocalDataSource();
        }
        return instance;
    }
}
