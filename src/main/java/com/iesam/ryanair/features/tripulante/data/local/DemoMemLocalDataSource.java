package com.iesam.ryanair.features.tripulante.data.local;

import com.iesam.ryanair.features.tripulante.domain.Tripulante;

import java.util.*;

public class DemoMemLocalDataSource {

    private Map<String, Tripulante> dataStore = new TreeMap<>();

    public void save(Tripulante model) {
        dataStore.put(model.getId(), model);
    }

    public void saveList(List<Tripulante> models) {
        for (Tripulante demo : models) {
            save(demo);
        }
    }

    public Tripulante findById(String id) {
        return dataStore.get(id);
    }

    public List<Tripulante> findAll() {
        return dataStore.values().stream().toList();
    }

    public void delete(String modelId) {
        dataStore.remove(modelId);
    }
}
