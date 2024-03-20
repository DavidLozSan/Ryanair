package com.iesam.ryanair.features.vuelo.domain;

import com.iesam.ryanair.features.vuelo.data.StubFalseVueloDataRepository;
import com.iesam.ryanair.features.vuelo.data.StubTrueVueloDataRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetAvionInToVueloUseCaseTest {

    GetAvionInToVueloUseCase getAvionInToVueloUseCase = null;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        getAvionInToVueloUseCase = null;
    }

    @Test
    public void cuandoUnAvionEstaEnUnVueloEntoncesDevuelveTrue() {
        //Given
        getAvionInToVueloUseCase = new GetAvionInToVueloUseCase(new StubTrueVueloDataRepository());

        //When
        Boolean result = getAvionInToVueloUseCase.execute("1");

        //Then
        Assertions.assertTrue(result);
    }

    @Test
    public void cuandoUnAvionNoEstaEnUnVueloEntoncesDevuelveFalse() {
        //Given
        getAvionInToVueloUseCase = new GetAvionInToVueloUseCase(new StubFalseVueloDataRepository());

        //When
        Boolean result = getAvionInToVueloUseCase.execute("1");

        //Then
        Assertions.assertFalse(result);
    }
}