package org.example.Visual;

import javax.swing.JFrame;
/**
 * Clase que representa la ventana dentro de la cual se inicaliza el panel principal
 * @author CSalinasP
 * @version 1.2
 */
public class Ventana extends JFrame
{
    private PanelPrincipal panelPrincipal;

    public Ventana()
    {
        super();
        panelPrincipal = new PanelPrincipal(this);
        this.setTitle("Panel Principal");
        this.setSize(1000, 1000);
        this.add(panelPrincipal);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    /**
     * Metodo que sirve para reiniciar el panel principal y que es llamado desde el mismo
     */
    public void ReiniciarExpendedor(){
        this.remove(panelPrincipal);
        panelPrincipal = new PanelPrincipal(this);
        this.add(panelPrincipal);
        this.revalidate();
        this.repaint();

    }
}
