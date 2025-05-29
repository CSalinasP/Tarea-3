package org.example.Visual;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PPanel extends JPanel {
    public PPanel(){
        this.setLayout(new GridLayout(3, 2, 5, 5)); // 3 filas, 2 columnas, con 5px de espacio entre componentes

        this.add(new JButton("1"));
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.add(new JButton("Enter"));
    }
}