package org.mvpigs.formGeom;

public class Rectangulo extends FiguraGeometrica {

    double altura = 0d;
    double ancho = 0d;

    public Rectangulo() {
        super();
    }
    
    public Rectangulo(double altura, double ancho) {
        super();
        this.altura = altura;
        this.ancho = ancho;
    }

    public Rectangulo(String nombre,double altura, double ancho) {
        super(nombre);
        this.altura = altura;
        this.ancho = ancho;
    }


    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the ancho
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double calcularArea() {
        return getAltura() * getAncho();
        
    }

}