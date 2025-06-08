package org.example.Visual;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ExpendedorE extends JPanel {
    private ArrayList<JButton> botones;

    public ExpendedorE() {
        this.setLayout(new GridLayout(2, 1, 5, 5)); // 3 filas, 2 columnas, con 5px de espacio entre componentes
        this.setBackground(Color.RED);
        PanelNumerico panelNumerico = new PanelNumerico();
        botones = panelNumerico.getBotones();
        this.add(panelNumerico);

        JPanel m = new PanelDispensador();
        this.add(m);
    }

    public ArrayList<JButton> getBotones(){
        return botones;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
