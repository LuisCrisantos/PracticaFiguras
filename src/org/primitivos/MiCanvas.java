package org.primitivos;

import javax.swing.*;
import java.awt.*;

public class MiCanvas extends JComponent {
    public void init(){
        this.c = new Circulo("pizza", 50);
        this.t = new Triangulo("rebanada", 100, 100,100);
    }

    private Circulo c;
    private Triangulo t;

    @Override
    public void update(Graphics g) {
        //super.update(g);
        print(g);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (c.esValido())
            c.Dibujar(this);
        update(g);
    }
}
