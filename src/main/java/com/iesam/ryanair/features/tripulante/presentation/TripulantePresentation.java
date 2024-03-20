package com.iesam.ryanair.features.tripulante.presentation;

import com.iesam.ryanair.features.tripulante.data.TripulanteDataRepository;
import com.iesam.ryanair.features.tripulante.domain.GetTripulanteUseCase;
import com.iesam.ryanair.features.tripulante.domain.SaveTripulanteUseCase;
import com.iesam.ryanair.features.tripulante.domain.Tripulante;

public class TripulantePresentation {
    public static void save(Tripulante tripulante) {
        SaveTripulanteUseCase saveTripulanteUseCase = new SaveTripulanteUseCase(new TripulanteDataRepository());
        saveTripulanteUseCase.execute(tripulante);
    }

    public static Tripulante obtain(String dni) {
        GetTripulanteUseCase getTripulanteUseCase = new GetTripulanteUseCase(new TripulanteDataRepository());
        Tripulante tripulante = getTripulanteUseCase.execute(dni);
        return tripulante;
    }
}
