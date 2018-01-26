package org.mvpigs.formGeom;
import java.lang.Math.*;

public class Circulo extends FiguraGeometrica {

    double radio = 0d;

    public Circulo() {
        super();
    }

    public Circulo(double radio) {
        super();
        this.radio = radio;
    }

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    public double calcularArea() {
        return Math.PI*(Math.pow(getRadio(), 2));
    }

}