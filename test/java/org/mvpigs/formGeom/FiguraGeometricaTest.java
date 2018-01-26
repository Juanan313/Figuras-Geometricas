package org.mvpigs.formGeom;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class FiguraGeometricaTest {

    FiguraGeometrica trapezoide = new FiguraGeometrica("trapezoide");
    @Test
    public void FiguraGeometricaTestConstructor() {

        assertEquals("trapezoide", trapezoide.getNombre());
        
    }
}