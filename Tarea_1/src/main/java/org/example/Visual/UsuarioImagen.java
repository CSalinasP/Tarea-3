package org.example.Visual;

import org.example.Logica.Expendedor;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Panel gráfico que representa la imagen del usuario en la interfaz.
 * @author CSalinasP
 * @version 1.4
 */
public class UsuarioImagen extends JPanel {
    private URL url;
    private ImageIcon imagenIcon;
    private JLabel imagenLabel;

     /**
     * Crea un nuevo panel que muestra la imagen del usuario escalada.
     * Inicializa las propiedades visuales y carga la imagen desde la ruta predeterminada,
     * ajustándola al tamaño del panel.
     */
    public UsuarioImagen() {
        // asyda a los Layout Managers a calcular el tamaño inicial
        setPreferredSize(new Dimension(200, 200)); // 50x50 píxeles
        setOpaque(false);
        url = getClass().getResource("/Usuario.png");
        if (url == null) {
            System.err.println("Error: La imagen no se encontró en la ruta especificada");}
        else{
            imagenIcon = new ImageIcon(url);
            Image I = imagenIcon.getImage();
            Image aux = I.getScaledInstance(200,200,Image.SCALE_SMOOTH);
            imagenIcon = new ImageIcon(aux);
            imagenLabel = new JLabel(imagenIcon);
            this.add(imagenLabel);
        }
    }
    /**
     * Sobrescribe el método de pintado para personalizar el fondo y el borde del panel.
     * <p>
     * Dibuja un fondo gris y un borde negro para mejorar la visualización de la imagen
     * y delimitar el área correspondiente al usuario.
     * </p>
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
