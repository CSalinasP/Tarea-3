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

    /**
     * Texto de la primera información presentada en el panel.
     */
    String InformacionA;
    /**
     * Texto de la segunda información presentada en el panel.
     */
    String InformacionB;
    /**
     * Texto de la tercera información presentada en el panel.
     */
    String InformacionC;

    /**
     * Valor numérico asociado a la primera información.
     */
    int intInformacionA;
    /**
     * Valor numérico asociado a la segunda información.
     */
    int intInformacionB;
    /**
     * Valor numérico asociado a la tercera información.
     */
    int intInformacionC;

    /**
     * Etiqueta gráfica que muestra la primera información.
     */
    JLabel InformacionALabel;
    /**
     * Etiqueta gráfica que muestra la segunda información.
     */
    JLabel InformacionBLabel;
    /**
     * Etiqueta gráfica que muestra la tercera información.
     */
    JLabel InformacionCLabel;

    /**
     * Crea un nuevo panel informativo.
     * <p>
     * Inicializa los valores informativos y sus etiquetas gráficas, y dispone los componentes en una cuadrícula vertical.
     * </p>
     */
    public ExpendedorW() {
        this.setPreferredSize(new Dimension(150, 400));
        this.setBackground(Color.gray);
        this.setLayout(new GridLayout(3, 1));

        intInformacionA = 0;
        intInformacionB = 0;
        intInformacionC = 0;
        InformacionA = "Info 1: " + intInformacionA;
        InformacionB = "Info 2: " + intInformacionB;
        InformacionC = "Info 3: " + intInformacionC;
        InformacionALabel = new JLabel(InformacionA);
        InformacionBLabel = new JLabel(InformacionB);
        InformacionCLabel = new JLabel(InformacionC);
        InformacionALabel.setFont(new Font("Arial", Font.BOLD, 15));
        InformacionBLabel.setFont(new Font("Arial", Font.BOLD, 15));
        InformacionCLabel.setFont(new Font("Arial", Font.BOLD, 15));
        this.add(InformacionALabel);
        this.add(InformacionBLabel);
        this.add(InformacionCLabel);
    }
}