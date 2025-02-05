package com.example.examen2;


import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertirADestinoTest {
    @Test
    public void testConvertirADestino() {
        assertEquals("1010", Calculadora.convertirADestino(10, 0));
        assertEquals("a", Calculadora.convertirADestino(10, 3));
    }

}
