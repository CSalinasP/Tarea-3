package org.example.Visual;

import org.example.Logica.Expendedor;

import javax.swing.*;
/**
 * Ventana de pruebas para la interfaz gráfica del expendedor.
 * @author CSalinasP
 * @version 1.1
 */
public class VentanaPruebas extends JFrame
{
    /**
     * Panel principal utilizado para mostrar los elementos gráficos de prueba.
     */
    private JPanel C;
    /**
     * Componente lógico del expendedor asociado a las pruebas.
     */
    private Expendedor expLogica;
    /**
     * Construye una nueva ventana para la realización de pruebas del expendedor.
     *
     */
    public VentanaPruebas()
    {
        super();
        this.setTitle("Expendedor");
        this.setSize(640, 480);
        this.add(C);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.pack();
        this.setVisible(true);
    }
}
