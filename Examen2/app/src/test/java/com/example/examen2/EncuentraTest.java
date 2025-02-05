package com.example.examen2;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class EncuentraTest{
   @Test
   public void testEncuentra(){
    List<Integer> numTest = Arrays.asList(1,2,3,4,5,6,7,8,9,10); assertTrue(Calculadora.Encuentra(numTest, 5));
     assertFalse(Calculadora.Encuentra(numTest, 2000));
   }
}