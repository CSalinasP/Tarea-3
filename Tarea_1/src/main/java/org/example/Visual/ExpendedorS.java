package org.example.Visual;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class ExpendedorS extends JPanel {
    private ArrayList<JButton> botones;

    public ExpendedorS(){
        this.setPreferredSize(new Dimension(200, 150));
        this.setBackground(Color.white);
        this.setLayout(new GridLayout(1, 2, 5, 5));
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
