package org.example.Visual;

import org.example.Visual.recursos.Productos;

import javax.swing.*;
import java.awt.*;

public class ExpendedorC extends JPanel {
    public ExpendedorC(){
        this.setLayout(new GridLayout(5, 5, 5, 5));
        for(int i=0; i<25; i++) {
            JPanel p = new Productos();
            this.add(p);
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
