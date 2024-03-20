package com.iesam.ryanair.features.pasajero.presentation;

import com.iesam.ryanair.features.pasajero.data.PasajeroDataRepository;
import com.iesam.ryanair.features.pasajero.domain.GetPasajeroUseCase;
import com.iesam.ryanair.features.pasajero.domain.Pasajero;
import com.iesam.ryanair.features.pasajero.domain.SavePasajeroUseCase;

public class PasajeroPresentation {
    public static void save(Pasajero pasajero) {
        SavePasajeroUseCase savePasajeroUseCase = new SavePasajeroUseCase(new PasajeroDataRepository());
        savePasajeroUseCase.execute(pasajero);
    }

    public static Pasajero obtain(String dni) {
        GetPasajeroUseCase getPasajeroUseCase = new GetPasajeroUseCase(new PasajeroDataRepository());
        Pasajero pasajero = getPasajeroUseCase.execute(dni);
        return pasajero;
    }
}
