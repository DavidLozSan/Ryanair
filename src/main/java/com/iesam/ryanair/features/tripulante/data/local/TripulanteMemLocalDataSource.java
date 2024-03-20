package com.iesam.ryanair.features.tripulante.data.local;

import com.iesam.ryanair.features.tripulante.domain.Tripulante;

import java.util.*;

public class TripulanteMemLocalDataSource {

    private Map<String, Tripulante> dataStore = new TreeMap<>();
    private static TripulanteMemLocalDataSource instance = null;

    public void save(Tripulante model) {
        dataStore.put(model.getDni(), model);
    }

    public void saveList(List<Tripulante> models) {
        for (Tripulante demo : models) {
            save(demo);
        }
    }

    public Tripulante findByDni(String dni) {
        return dataStore.get(dni);
    }

    public List<Tripulante> findAll() {
        return dataStore.values().stream().toList();
    }

    public void delete(String modelDni) {
        dataStore.remove(modelDni);
    }

    public static TripulanteMemLocalDataSource newInstance() {
        if (instance == null) {
            instance = new TripulanteMemLocalDataSource();
        }
        return instance;
    }
}
