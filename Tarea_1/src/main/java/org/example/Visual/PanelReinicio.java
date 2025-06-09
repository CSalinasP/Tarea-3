package org.example.Visual;

import javax.swing.*;
import java.awt.*;
/**
 * Panel visual encargado de la sección dispensadora de productos en la interfaz.
 *
 * @author CSalinasP
 * @version 1.3
 */
public class PanelReinicio extends JPanel{
    JButton reestart;
    /**
     * Crea e inicializa el panel del dispensador.
     * <p>
     */
    public PanelReinicio(){
        this.setLayout(new GridBagLayout());
        reestart = new JButton("Reinicio");
        this.add(reestart);
    }

    public JButton getReestart(){
        return reestart;
    }
    /**
     * @param g contexto gráfico utilizado para dibujar el componente.
     */
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }

}
