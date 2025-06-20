package org.example.Visual;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Clase que representa el monedero del comprador
 * @author Farentsens
 * @version 1.0
 */
public class CompradorMonedero extends JPanel {
    /**
     * Lista de botones que representan las distintas monedas disponibles.
     */
    private ArrayList<JButton> monedas;

    /**
     * Constructor de la clase y configura el panel del monedero del comprador.
     * Inicializa la lista de botones de monedas y los añade al panel en un diseño de cuadrícula.
     */
    public CompradorMonedero(){
        setLayout(new GridLayout(2, 3, 5, 5));
        this.setBackground(Color.gray);
        monedas = new ArrayList<>();
        JButton m100 = new JButton(); m100.add(new Monedas(100)); monedas.add(m100); this.add(m100);
        JButton m200 = new JButton(); m200.add(new Monedas(200)); monedas.add(m200); this.add(m200);
        JButton m300 = new JButton(); m300.add(new Monedas(300)); monedas.add(m300); this.add(m300);
        JButton m500 = new JButton(); m500.add(new Monedas(500)); monedas.add(m500); this.add(m500);
        JButton m1000 = new JButton(); m1000.add(new Monedas(1000)); monedas.add(m1000); this.add(m1000);
        JButton m1500 = new JButton(); m1500.add(new Monedas(1500)); monedas.add(m1500); this.add(m1500);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }

    public ArrayList<JButton> getMonedas(){
        return monedas;
    }
}