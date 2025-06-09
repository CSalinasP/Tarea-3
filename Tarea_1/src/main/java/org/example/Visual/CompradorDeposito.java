package org.example.Visual;

import javax.swing.*;
import java.awt.*;
/**

  @author CSalinasP
  @version 1.3
 */

public class CompradorDeposito extends JPanel {
    /**
     * Crear 5 paneles para los prductos
     */
    CompradorDeposito(){
        this.setLayout(new GridLayout(2, 3, 5, 5));
        for(int i=0; i<5; i++) {
            JPanel p = new ProductosImagen();
            this.add(p);
        }
    }

    /**
     *
     * @param g the <code>Graphics</code> parametro paintComponent
     */
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
