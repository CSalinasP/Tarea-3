package org.example.PanelComprador;

import javax.swing.*;
import java.awt.*;

public class PanelRetirarVuelto extends JPanel{
    public PanelRetirarVuelto(){
        this.setLayout(new GridBagLayout());
        this.add(new JButton("Retirar Vuelto"));
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
