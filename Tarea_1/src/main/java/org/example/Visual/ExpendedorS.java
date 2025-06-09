package org.example.Visual;

import javax.swing.*;
import java.awt.*;

/**
 * Panel lateral del expendedor que permite retirar producto y vuelto.
 * @author CSalinasP
 * @version 1.0
 */
public class ExpendedorS extends JPanel {

    /**
     * Panel encargado de la visualización y extracción del producto.
     */
    JPanel PanelRetirarProducto;

    /**
     * Panel encargado de la visualización y extracción del vuelto.
     */
    JPanel PanelRetirarVuelto;

    /**
     * Crea el panel lateral del expendedor.
     * <p>
     * Inicializa ambos subpaneles (producto y vuelto), define el tamaño preferido y estructura
     * el diseño en dos columnas para su correcta visualización.
     * </p>
     */
    public ExpendedorS(){
        this.setPreferredSize(new Dimension(200, 150));
        this.setBackground(Color.white);
        this.setLayout(new GridLayout(1, 2, 5, 5));
        PanelRetirarProducto = new PanelRetirarProducto();
        PanelRetirarVuelto = new PanelRetirarVuelto();
        this.add(PanelRetirarProducto);
        this.add(PanelRetirarVuelto);
    }

    /**
     * Sobrescribe el método de pintado del panel para asegurar el correcto renderizado 
     * de los subcomponentes.
     * <p>
     * Llama al método padre para garantizar la visualización adecuada.
     * </p>
     *
     * @param g contexto gráfico utilizado para dibujar el panel.
     */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}