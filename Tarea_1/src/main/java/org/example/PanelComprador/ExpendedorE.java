package org.example.PanelComprador;

import javax.swing.*;
import java.awt.*;

public class ExpendedorE extends JPanel {
    private JButton b;

    public ExpendedorE() {
        this.setLayout(new GridLayout(2, 1, 5, 5)); // 3 filas, 2 columnas, con 5px de espacio entre componentes
        this.setBackground(Color.RED);
        PanelNumerico n = new PanelNumerico();
        b= n.getBoton1();

        this.add(n);

        JPanel m = new PanelDispensador();
        this.add(m);
    }

    public JButton getBoton(){
        return b;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
