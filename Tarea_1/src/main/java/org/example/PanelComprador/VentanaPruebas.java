package org.example.PanelComprador;

import javax.swing.*;


public class VentanaPruebas extends JFrame
{
    JPanel C = new PanelPrincipal();

    public VentanaPruebas()
    {
        super();
        this.setTitle("Expendedor");
        this.setSize(640, 480);
        this.add(C);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.pack();
        this.setVisible(true);
    }
}
