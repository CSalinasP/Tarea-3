package org.example.Visual;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    public PanelComprador(){
        setPreferredSize(new Dimension(200,650));
        this.setLayout(new GridLayout(3, 1, 5, 5));

        //se instancian los subpaneles
        JPanel imagen = new CompradorImagen();
        JPanel monedero = new CompradorMonedero();
        JPanel deposito = new CompradorDeposito();

        //se añaden los subpaneles
        this.add(imagen);
        this.add(monedero);
        this.add(deposito);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
