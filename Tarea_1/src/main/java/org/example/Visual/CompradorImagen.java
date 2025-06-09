package org.example.Visual;

import javax.swing.*;
import java.awt.*;

/**
 *
 *
 * 
 * @author CSalinas
 * @version 1.3
 */
public class CompradorImagen extends JPanel {
    /**
     * Crea un nuevo panel que contiene la imagen del usuario.
     * Este constructor inicializa y añade un panel UsuarioImagen como subcomponente.
     */
    public CompradorImagen(){
        JPanel ui = new UsuarioImagen();
        this.add(ui);
    }

    /**
     * Sobrescribe el método paintComponent para asegurar el correcto dibujado del panel
     * y sus componentes.
     *
     * @param g el contexto gráfico sobre el que pintar el panel.
     */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}