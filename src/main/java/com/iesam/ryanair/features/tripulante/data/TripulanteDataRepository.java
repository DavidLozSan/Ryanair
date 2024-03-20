package com.iesam.ryanair.features.tripulante.data;

import com.iesam.ryanair.features.tripulante.data.local.TripulanteMemLocalDataSource;
import com.iesam.ryanair.features.tripulante.domain.Tripulante;
import com.iesam.ryanair.features.tripulante.domain.TripulanteRepository;

public class TripulanteDataRepository implements TripulanteRepository {
    private TripulanteMemLocalDataSource tripulanteMemLocalDataSource;
    public TripulanteDataRepository() {
        this.tripulanteMemLocalDataSource = tripulanteMemLocalDataSource.newInstance();
    }

    @Override
    public void save(Tripulante tripulante) {
        tripulanteMemLocalDataSource.save(tripulante);
    }

    @Override
    public Tripulante obtain(String dni) {
        return tripulanteMemLocalDataSource.findByDni(dni);
    }
}
