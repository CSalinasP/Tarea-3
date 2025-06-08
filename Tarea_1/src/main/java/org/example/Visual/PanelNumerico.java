package org.example.Visual;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelNumerico extends JPanel {
    private ArrayList<JButton> botones;
    public PanelNumerico() {
        this.setPreferredSize(new Dimension(150,50));
        this.setLayout(new GridLayout(3, 2, 5, 5)); // 3 filas, 2 columnas, con 5px de espacio entre componentes
        botones = new ArrayList<>();
        JButton boton1 = new JButton("1");
        JButton boton2 = new JButton("2");
        JButton boton3 = new JButton("3");
        JButton boton4 = new JButton("4");
        JButton boton5 = new JButton("5");
        JButton botonEnter = new JButton("Enter");

        this.add(boton1); botones.add(boton1);
        this.add(boton2); botones.add(boton2);
        this.add(boton3); botones.add(boton3);
        this.add(boton4); botones.add(boton4);
        this.add(boton5); botones.add(boton5);
        this.add(botonEnter); botones.add(botonEnter);
    }

    public ArrayList<JButton> getBotones(){
        return botones;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
