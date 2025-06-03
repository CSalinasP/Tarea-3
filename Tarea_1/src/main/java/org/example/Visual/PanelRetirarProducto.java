package org.example.Visual;

import javax.swing.*;
import java.awt.*;

public class PanelRetirarProducto extends JPanel{
    public PanelRetirarProducto(){
        this.setLayout(new GridBagLayout());
        this.add(new JButton("Retirar Producto"));
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
