package org.primitivos;

import javax.swing.*;

public class Main {
    public static void main(String args[]){
        Circulo mi_circulo = new Circulo("Anillo", 50.0);
        Triangulo mi_triangulo = new Triangulo("Pizza",30,30,50);
        /*if(mi_circulo.esValido())
            mi_circulo.Dibujar(new MiCanvas());
        if(mi_triangulo.esValido())
            mi_triangulo.Dibujar(new MiCanvas());*/
        MiCanvas canvas = new MiCanvas();
        JFrame ventana = new JFrame("Canvas");
        ventana.getContentPane().add(canvas);
        ventana.setVisible(true);
        ventana.setSize(400,400);
        ventana.setDefaultCloseOperation(3);
    }

}
