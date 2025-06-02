package org.example.Visual.recursos;

import javax.swing.*;
import java.awt.*;

public class Monedas extends JPanel {
    public Monedas() {
        // asyda a los Layout Managers a calcular el tamaño inicial
        setPreferredSize(new Dimension(50, 50)); // 50x50 píxeles
        setOpaque(false);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja el fondo amarillo
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, getWidth(), getHeight()); // Rellena todo el componente

        //Dibuja un borde negro para la visualización
        g.setColor(Color.BLACK);
    }
}