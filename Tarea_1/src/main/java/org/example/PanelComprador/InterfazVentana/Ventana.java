package org.example.PanelComprador.InterfazVentana;
import org.example.PanelComprador.PanelPrincipal;

import javax.swing.JFrame;

public class Ventana extends JFrame
{
    PanelPrincipal PanelPrincipal = new PanelPrincipal();
    public Ventana()
    {
        super();
        this.setTitle("Panel Principal");
        this.setSize(1000, 1000);
        this.add(PanelPrincipal);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.pack();
        this.setVisible(true);
    }
}
