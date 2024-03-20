package com.iesam.ryanair.features.avion.data;

import com.iesam.ryanair.features.avion.data.local.AvionFileLocalDataSource;
import com.iesam.ryanair.features.avion.data.local.AvionMemLocalDataSource;
import com.iesam.ryanair.features.avion.domain.Avion;
import com.iesam.ryanair.features.avion.domain.AvionRepository;

public class AvionDataRepository implements AvionRepository {
    private AvionMemLocalDataSource avionMemLocalDataSource;

    public AvionDataRepository() {
        this.avionMemLocalDataSource = avionMemLocalDataSource.newInstance();
    }

    @Override
    public void save(Avion avion) {
        avionMemLocalDataSource.save(avion);
    }

    @Override
    public Avion obtain(String codAvion) {
        return avionMemLocalDataSource.findByCodAvion(codAvion);
    }
}
