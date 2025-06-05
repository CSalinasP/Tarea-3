package org.example.PanelComprador;

import javax.swing.*;
import java.awt.*;

public class PanelDispensador extends JPanel{

    public PanelDispensador(){
        this.setLayout(new GridBagLayout());
        Productos p = new Productos();
        this.add(p);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }

}
