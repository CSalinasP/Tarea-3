package org.example.PanelComprador;

import org.example.PanelComprador.recursos.Monedas;
import javax.swing.*;
import java.awt.*;

public class CompradorMonedero extends JPanel {
    public CompradorMonedero(){
        this.setLayout(new GridLayout(2, 3, 5, 5));
        for(int i=0; i<6; i++) {
            JPanel m = new Monedas();
            this.add(m);
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
