package org.example.Visual;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Panel1 extends JPanel
{
    public Panel1()
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
