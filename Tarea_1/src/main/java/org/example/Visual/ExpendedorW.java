package org.example.Visual;

import javax.swing.*;
import java.awt.*;

/**
 * Panel informativo que muestra tres secciones de información en la interfaz del expendedor.
 * <p>
 * @author CSalinasP
 * @version 1.5
 */
public class ExpendedorW extends JPanel {
    private JLabel Estatus;
    /**
     * Crea un nuevo panel informativo.
     * <p>
     * Inicializa los valores informativos y sus etiquetas gráficas, y dispone los componentes en una cuadrícula vertical.
     * </p>
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