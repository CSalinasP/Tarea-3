package org.example.PanelComprador.PanelComprador;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Botones extends JPanel
{
    public Botones()
    {
        this.setLayout(new GridLayout(3, 2));
        this.setSize(640, 480);
        this.add(new JButton("1"));
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.add(new JButton("6"));

    }
}
