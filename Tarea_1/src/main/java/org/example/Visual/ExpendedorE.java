package org.example.Visual;

import javax.swing.*;
import java.awt.*;

public class ExpendedorE extends JPanel {
    public ExpendedorE() {
        this.setLayout(new GridLayout(2, 1, 5, 5)); // 3 filas, 2 columnas, con 5px de espacio entre componentes
        this.setBackground(Color.RED);
        JPanel n = new PanelNumerico();
        this.add(n);
        JPanel m = new PanelDispensador();
        this.add(m);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
