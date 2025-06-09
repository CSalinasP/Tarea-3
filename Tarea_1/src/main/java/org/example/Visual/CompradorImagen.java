package org.example.Visual;

import javax.swing.*;
import java.awt.*;

/**
 * Crear un panel con la imganen de usario
 */
public class CompradorImagen extends JPanel {
    public CompradorImagen(){
        /**
         * Llama a utilizar la imagen png
         */
        JPanel ui = new UsuarioImagen();
        this.add(ui);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
