package org.example.Visual;

import javax.swing.*;
import java.awt.*;

public class PanelDispensador extends JPanel{

    public PanelDispensador(){
        this.setLayout(new GridBagLayout());
        this.add(new JButton("Restart"));
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }

}
