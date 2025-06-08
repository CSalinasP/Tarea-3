package org.example.Visual;

import javax.swing.*;
import java.awt.*;

public class CompradorImagen extends JPanel {
    public CompradorImagen(){
        JPanel ui = new UsuarioImagen();
        this.add(ui);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
