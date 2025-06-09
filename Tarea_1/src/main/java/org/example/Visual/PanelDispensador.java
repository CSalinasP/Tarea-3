package org.example.Visual;

import javax.swing.*;
import java.awt.*;
/**
 * Panel visual encargado de la sección dispensadora de productos en la interfaz.
 *
 * @author CSalinasP
 * @version 1.3
 */
public class PanelDispensador extends JPanel{
    /**
     * Crea e inicializa el panel del dispensador.
     * <p>
     */
    public PanelDispensador(){
        this.setLayout(new GridBagLayout());
        this.add(new JButton("Restart"));
    }
    /**
     * @param g contexto gráfico utilizado para dibujar el componente.
     */
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }

}
