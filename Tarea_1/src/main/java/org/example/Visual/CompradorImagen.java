package org.example.Visual;

import javax.swing.*;
import java.awt.*;

/**
 * Clase que representa la imagen del usuario.
 */
public class CompradorImagen extends JPanel {

    /**
     * Constructor de la clase que crea e inicializa las propiedades del panel.
     */
    public CompradorImagen(){
        this.setBackground(Color.gray);
        JPanel ui = new UsuarioImagen();
        this.add(ui);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
