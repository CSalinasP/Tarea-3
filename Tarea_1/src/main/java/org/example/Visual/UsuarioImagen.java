package org.example.Visual;

import javax.swing.*;
import java.awt.*;
/**
 * Panel gráfico que representa la imagen del usuario en la interfaz.
 *
 * @author CSalinasP
 * @version 1.4
 */
public class UsuarioImagen extends JPanel {
    /**
     * Imagen del usuario a mostrar en el panel.
     */
    Image imagenUsuario;
    /**
     * Crea un nuevo panel que muestra la imagen del usuario escalada.
     * Inicializa las propiedades visuales y carga la imagen desde la ruta predeterminada,
     * ajustándola al tamaño del panel.
     */
    public UsuarioImagen() {
        // asyda a los Layout Managers a calcular el tamaño inicial
        setPreferredSize(new Dimension(50, 50)); // 50x50 píxeles
        setOpaque(false);

        ImageIcon iconoImagen = new ImageIcon("src/main/resources/Usuario.png");
        Image imagen = iconoImagen.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT);
        JLabel imagenLabel = new JLabel(new ImageIcon(imagen));
        this.add(imagenLabel);
    }
    /**
     * Sobrescribe el método de pintado para personalizar el fondo y el borde del panel.
     * <p>
     * Dibuja un fondo gris y un borde negro para mejorar la visualización de la imagen
     * y delimitar el área correspondiente al usuario.
     * </p>
     *
     * @param g contexto gráfico sobre el que se dibuja el panel.
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja el fondo gris
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, getWidth(), getHeight()); // Rellena todo el componente

        //Dibuja un borde negro para la visualización
        g.setColor(Color.BLACK);
    }
}
