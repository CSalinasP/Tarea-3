package org.example.Visual;

import javax.swing.JFrame;
/**
 *
 * @author CSalinasP
 * @version 1.2
 */
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
