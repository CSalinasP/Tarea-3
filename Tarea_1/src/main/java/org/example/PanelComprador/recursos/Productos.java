package org.example.PanelComprador.recursos;

import javax.swing.*;
import java.awt.*;

public class Productos extends JPanel {

    JLabel imagenLabel;
    ImageIcon iconoImagen;
    Image imagen;

    public Productos() {
        // asyda a los Layout Managers a calcular el tamaño inicial
        setPreferredSize(new Dimension(50, 50)); // 50x50 píxeles
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja el fondo gris
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, getWidth(), getHeight()); // Rellena todo el componente

        //Dibuja un borde negro para la visualización
        g.setColor(Color.BLACK);
    }

    public void addImagen(String nombreImagen){
        iconoImagen = new ImageIcon("src/main/resources/" + nombreImagen + ".png");
        imagen = iconoImagen.getImage().getScaledInstance(30, 30,Image.SCALE_DEFAULT);
        imagenLabel = new JLabel(new ImageIcon(imagen));
        this.add(imagenLabel);
    }

    public void borrarImagen(){
        imagenLabel.removeAll();
    }
}