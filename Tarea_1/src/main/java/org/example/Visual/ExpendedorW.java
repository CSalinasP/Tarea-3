package org.example.Visual;

import javax.swing.*;
import java.awt.*;

/**
 * Panel informativo que muestra los resultados de las interacciones.
 * <p>
 * @author CSalinasP
 * @version 1.5
 */
public class ExpendedorW extends JPanel {
    private JLabel Estatus;

    /**
     * Constructor de la clase que añade un JLabel que sirve para mostrar los resultados de las interacciones.
     */
    public ExpendedorW() {
        this.setPreferredSize(new Dimension(150, 400));
        this.setBackground(Color.gray);
        Estatus = new JLabel("Estatus: ");
        this.add(Estatus);
    }

    public void setEstatus(String estatus){
        Estatus.setText(estatus);
    }
}