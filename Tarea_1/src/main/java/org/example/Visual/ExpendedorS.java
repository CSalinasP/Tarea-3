package org.example.Visual;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

/**
 * Panel que contiene los botones para retirar los productos y el vuelto.
 * @author CSalinasP
 * @version 1.0
 */
public class ExpendedorS extends JPanel {
    private ArrayList<JButton> botones;

    /**
     * Constructor de la clase que añade los botones para retirar los productos y el vuelto.
     */
    public ExpendedorS(){
        this.setPreferredSize(new Dimension(200, 150));
        this.setLayout(new GridLayout(1, 2, 5, 5));
        this.setBackground(Color.gray);
        botones = new ArrayList<>();
        JButton retirarProducto = new JButton("Retirar Producto");
        this.add(retirarProducto);
        botones.add(retirarProducto);
        JButton retirarVuelto = new JButton("Retirar Vuelto");
        this.add(retirarVuelto);
        botones.add(retirarVuelto);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }

    public ArrayList<JButton> getBotones(){
        return botones;
    }
}
