package org.example.Visual;

import org.example.Logica.Expendedor;

import javax.swing.*;

public class VentanaPruebas extends JFrame
{
    private JPanel C;
    private Expendedor expLogica;

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
