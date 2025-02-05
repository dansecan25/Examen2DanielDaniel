package com.example.examen2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertiNumeroTest {
    @Test
    public void testConvertirNumero() {
        assertEquals(10, Calculadora.convertirNumero("1010", 0));
        assertEquals(-1, Calculadora.convertirNumero("XYZ", 16));
    }
}
