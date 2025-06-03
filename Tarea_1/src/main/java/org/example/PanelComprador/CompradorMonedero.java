package org.example.PanelComprador;

import org.example.PanelComprador.recursos.Monedas;
import javax.swing.*;
import java.awt.*;

public class CompradorMonedero extends JPanel {
    int [] valores ={100,200, 300, 500, 1000, 1500};
    public CompradorMonedero(){
        setLayout(new GridLayout(2, 3, 5, 5));
        for (int valor : valores){
            this.add(new Monedas(valor));
        }
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
