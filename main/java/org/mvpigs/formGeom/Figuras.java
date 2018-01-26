package org.mvpigs.formGeom;


import java.util.ArrayList;

public class Figuras {
    
    public static void main(String[] args) {
        
        ArrayList<FiguraGeometrica> figuras = new ArrayList();

        Rectangulo rectangulo = new Rectangulo("Rectangulo1", 5.0, 6.0);
        Rectangulo rectangulo2 = new Rectangulo(2.0, 4.0);

        Circulo circulo = new Circulo("Circulo", 1.5);
        Circulo circulo2 = new Circulo(2.5);

        figuras.add(rectangulo);
        figuras.add(rectangulo2);
        figuras.add(circulo);
        figuras.add(circulo2);

        for (FiguraGeometrica figura : figuras) {
            System.out.println("Area del "+figura.getNombre()+" es: "+figura.calcularArea());
        }

    }
}