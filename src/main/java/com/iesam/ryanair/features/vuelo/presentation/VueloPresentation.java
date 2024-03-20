package com.iesam.ryanair.features.vuelo.presentation;

import com.iesam.ryanair.features.vuelo.data.VueloDataRepository;
import com.iesam.ryanair.features.vuelo.domain.GetAvionInToVueloUseCase;
import com.iesam.ryanair.features.vuelo.domain.GetVueloUseCase;
import com.iesam.ryanair.features.vuelo.domain.SaveVueloUseCase;
import com.iesam.ryanair.features.vuelo.domain.Vuelo;

public class VueloPresentation {
    public static void save(Vuelo vuelo) {
        SaveVueloUseCase saveVueloUseCase = new SaveVueloUseCase(new VueloDataRepository());
        saveVueloUseCase.execute(vuelo);
    }

    public static Vuelo obtain(String codigo) {
        GetVueloUseCase getVueloUseCase = new GetVueloUseCase(new VueloDataRepository());
        Vuelo vuelo = getVueloUseCase.execute(codigo);
        return vuelo;
    }

    public static Boolean getAvion(String codAvion) {
        GetAvionInToVueloUseCase getAvionInToVueloUseCase = new GetAvionInToVueloUseCase(new VueloDataRepository());
        return getAvionInToVueloUseCase.execute(codAvion);
    }
}
