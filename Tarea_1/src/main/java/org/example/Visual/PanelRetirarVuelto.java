package org.example.Visual;

import javax.swing.*;
import java.awt.*;
/**
 * Panel gráfico que contiene un botón para retirar el vuelto en una interfaz de usuario.
 * <p>
 *
 * @author CSalinasP
 * @version 1.1
 */
public class PanelRetirarVuelto extends JPanel{
    /**
     * Crea un panel con un diseño centrado y un botón "Retirar Vuelto".
     */
    public PanelRetirarVuelto(){
        this.setLayout(new GridBagLayout());
        this.add(new JButton("Retirar Vuelto"));
    }
    /**
     * @param g contexto gráfico sobre el que se dibuja el panel.
     */
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
