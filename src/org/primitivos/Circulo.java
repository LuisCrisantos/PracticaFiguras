package org.primitivos;

import java.awt.*;
import java.util.ArrayList;

public class Circulo extends Figura{

    Circulo(String nombre, double radio) {
        super(nombre);
        this._radio=radio;
        this.coordenadas = new ArrayList<Puntos>();
        this._es_valido= this.ValidarCirculo();
    }

    private double _radio;

    private boolean ValidarCirculo(){
        return (this._radio>0);
    }

    public double calcularArea(){
        return Math.PI*this._radio*this._radio;
    }

    public double calcularPerimetro(){
        return (2*Math.PI)*this._radio;
    }

    public void Dibujar(MiCanvas donde){
        super.Dibujar(donde);
        donde.getGraphics().setColor(Color.BLACK);
        donde.getGraphics().drawArc(200,200,50,50,1,45);
        donde.repaint();
        System.out.println("Dibujar Circulo");

        /** Pintar Circulo**/
    }
}
