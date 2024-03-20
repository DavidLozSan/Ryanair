package com.iesam.ryanair.features.avion.presentation;

import com.iesam.ryanair.features.avion.data.AvionDataRepository;
import com.iesam.ryanair.features.avion.domain.Avion;
import com.iesam.ryanair.features.avion.domain.GetAvionUseCase;
import com.iesam.ryanair.features.avion.domain.SaveAvionUseCase;

public class AvionPresentation {
    public static void save(Avion avion) {
        SaveAvionUseCase saveAvionUseCase = new SaveAvionUseCase(new AvionDataRepository());
        saveAvionUseCase.execute(avion);
    }

    public static Avion obtain(String codAvion) {
        GetAvionUseCase getAvionUseCase = new GetAvionUseCase(new AvionDataRepository());
        Avion avion = getAvionUseCase.execute(codAvion);
        return avion;
    }
}
