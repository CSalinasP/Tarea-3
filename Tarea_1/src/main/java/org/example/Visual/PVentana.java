package org.example.Visual;

import java.awt.Image;
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PVentana extends JPanel {

    public PVentana() {
        this.setPreferredSize(new java.awt.Dimension(200, 150));

        ImageIcon iconoOriginal = new ImageIcon(Objects.requireNonNull(getClass().getResource("/org/example/resources/CocaCola.png")));

        if (iconoOriginal.getImage() != null) {
            int ancho = 200;
            int alto = 150;
            Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
            ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);

            JLabel labelImagen = new JLabel(iconoEscalado);
            this.add(labelImagen);
        } else {
            JLabel errorLabel = new JLabel("Error: Imagen no encontrada.");
            this.add(errorLabel);
            System.err.println("Advertencia: No se pudo cargar la imagen. Asegúrate de que 'imagen.png' esté en la ruta correcta.");
        }
    }
}