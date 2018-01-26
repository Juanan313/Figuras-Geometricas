package org.mvpigs.formGeom;
import java.lang.Math.*;

public class Circulo {

    double radio = 0d;

    public Circulo() {
        super();
    }

    public Circulo(double radio) {
        super();
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