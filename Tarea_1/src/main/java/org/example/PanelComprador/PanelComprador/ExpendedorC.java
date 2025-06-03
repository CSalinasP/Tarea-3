package org.example.PanelComprador.PanelComprador;

import org.example.PanelComprador.recursos.*;

import javax.swing.*;
import java.awt.*;

public class ExpendedorC extends JPanel {
    public ExpendedorC(){
        this.setLayout(new GridLayout(5, 5, 5, 5));

        for(int i=0; i<5; i++){
            Productos p = new Productos();
            this.add(p);
            p.addImagen("CocaCola");
        }
        for(int i=0; i<5; i++){
            Productos p = new Productos();
            this.add(p);
            p.addImagen("Sprite");
        }
        for(int i=0; i<5; i++){
            Productos p = new Productos();
            this.add(p);
            p.addImagen("Fanta");
        }
        for(int i=0; i<5; i++){
            Productos p = new Productos();
            this.add(p);
            p.addImagen("Super8");
        }
        for(int i=0; i<5; i++){
            Productos p = new Productos();
            this.add(p);
            p.addImagen("Snickers");
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
