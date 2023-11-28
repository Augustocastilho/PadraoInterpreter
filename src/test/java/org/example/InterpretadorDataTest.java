package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InterpretadorDataTest {

    @Test
    void deveRetornarDataBrasil() {
        InterpretadorData interpretador = new InterpretadorDataCalendario("Brasil 21/01/2023");
        assertEquals("21 de janeiro de 2023", interpretador.interpretar());
    }

    @Test
    void deveRetornarDataEUA() {
        InterpretadorData interpretador = new InterpretadorDataCalendario("EUA 01/21/2023");
        assertEquals("January 21th, 2023", interpretador.interpretar());
    }

    @Test
    void deveRetornarDataChina() {
        InterpretadorData interpretador = new InterpretadorDataCalendario("China 2023/01/21");
        assertEquals("2023年01月21日", interpretador.interpretar());
    }

}