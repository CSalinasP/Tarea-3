package org.example.Visual;

import org.example.Visual.recursos.Productos;
import javax.swing.*;
import java.awt.*;

public class CompradorDeposito extends JPanel {
    CompradorDeposito(){
        this.setLayout(new GridLayout(2, 3, 5, 5));
        for(int i=0; i<5; i++) {
            JPanel p = new Productos();
            this.add(p);
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
