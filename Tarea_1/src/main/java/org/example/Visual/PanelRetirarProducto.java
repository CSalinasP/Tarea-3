package org.example.Visual;

import javax.swing.*;
import java.awt.*;
/**
 * Este panel puede usarse como parte de una interfaz de usuario para expendedores automáticos o sistemas similares,
 * permitiendo al usuario indicar la acción de retiro de producto mediante el botón correspondiente.
 * @author SCalinasP
 * @version 1.2
 */
public class PanelRetirarProducto extends JPanel{
    /**
     * Crea un panel con un diseño centrado y un botón "Retirar Producto".
     */
    public PanelRetirarProducto(){
        this.setLayout(new GridBagLayout());
        this.add(new JButton("Retirar Producto"));
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
