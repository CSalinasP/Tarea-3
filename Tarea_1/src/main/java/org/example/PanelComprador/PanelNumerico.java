package org.example.PanelComprador;

import javax.swing.*;
import java.awt.*;

public class PanelNumerico extends JPanel {
    public PanelNumerico() {
        this.setPreferredSize(new Dimension(150,50));
        this.setLayout(new GridLayout(3, 2, 5, 5)); // 3 filas, 2 columnas, con 5px de espacio entre componentes
        this.add(new JButton("1"));
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.add(new JButton("Enter"));
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
