package org.mvpigs.formGeom;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * CuadradoTest
 */
public class CuadradoTest {

    Cuadrado cuadrado = new Cuadrado("cuadrado", 2.0);
    Cuadrado cuadrado2 = new Cuadrado(5.0);

    @Test
    public void cuadradoTestConstructor() {

        assertEquals("cuadrado", cuadrado.getNombre());
        assertEquals(5.0, cuadrado2.getLado());

    protected void cuadradoTestCalcularArea() {

        assertEquals(20.0,cuadrado2.calcularArea());
        assertEquals(8.0, cuadrado.calcularArea());        
    }
    }

}