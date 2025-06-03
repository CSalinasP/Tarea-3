package org.example.Visual.recursos;

import javax.swing.*;
import java.awt.*;

public class UsuarioImagen extends JPanel {

    Image imagenUsuario;

    public UsuarioImagen() {
        // asyda a los Layout Managers a calcular el tamaño inicial
        setPreferredSize(new Dimension(50, 50)); // 50x50 píxeles
        setOpaque(false);

        ImageIcon iconoImagen = new ImageIcon("src/main/resources/Usuario.png");
        Image imagen = iconoImagen.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT);
        JLabel imagenLabel = new JLabel(new ImageIcon(imagen));
        this.add(imagenLabel);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja el fondo gris
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, getWidth(), getHeight()); // Rellena todo el componente

        //Dibuja un borde negro para la visualización
        g.setColor(Color.BLACK);
    }
}
