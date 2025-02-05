package com.example.examen2;


import org.junit.Test;

import static org.junit.Assert.*;

public class RealizarOperacionTest {
    @Test
    public void testRealizarOperacion() {
        assertEquals(15, Calculadora.realizarOperacion(10, 5, "+"));
        assertEquals(2, Calculadora.realizarOperacion(10, 5, "/"));
    }
}
