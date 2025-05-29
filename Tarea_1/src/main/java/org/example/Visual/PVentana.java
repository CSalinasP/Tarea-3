package org.example.Visual;
import javax.swing.JFrame;

public class PVentana extends JFrame
{
    PPanelPrincipal PPanelPrincipal = new PPanelPrincipal();
    public PVentana()
    {
        super();
        this.setTitle("Expendedor");
        this.setSize(1000, 1000);
        this.add(PPanelPrincipal);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.pack();
        this.setVisible(true);
    }
}
