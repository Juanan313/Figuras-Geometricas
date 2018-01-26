package org.mvpigs.formGeom;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CirculoTest {

    @Test
    public void CirculoTestConstructor() {
        Circulo circulo = new Circulo(5);
        assertEquals(5.0,circulo.getRadio(), 0.1);
        
    }
    
}