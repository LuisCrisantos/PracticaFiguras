package org.primitivos;

import java.util.ArrayList;

public class Triangulo  extends Figura{
    Triangulo(String nombre, double ladoA, double ladoB, double ladoC) {
        super(nombre);
        this.ladoA=ladoA;
        this.ladoB=ladoB;
        this.ladoC=ladoC;
        this.anguloA=0;
        this.anguloB=0;
        this.anguloC=0;
        this.coordenadas = new ArrayList<Puntos>();
    }

    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double anguloA;
    private double anguloB;
    private double anguloC;

    private boolean validarTriangulo(){
        return (this.ladoA + this.ladoB) > this.ladoC && (this.ladoB + this.ladoC) > this.ladoA && (this.ladoA + this.ladoC) > this.ladoB;
    }

    //Terminar Lo de los triangulos con leyes de Cosenos
    public void calcularAngulo(){
        this.anguloA=Math.pow(this.ladoA,2)-Math.pow(this.ladoB,2) - Math.pow(this.ladoC,2) / (2*this.ladoB*ladoC);

    }
    public void Dibujar(MiCanvas donde){
        super.Dibujar(donde);

        System.out.println("Dibujar Triangulo");

        /** Pintar Circulo**/
    }
}
