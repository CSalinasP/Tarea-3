package org.example.Visual;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelComprador extends JPanel {
    CompradorMonedero monedero;
    public PanelComprador(){
        setPreferredSize(new Dimension(200,650));
        this.setLayout(new GridLayout(3, 1, 5, 5));

        //se instancian los subpaneles
        monedero = new CompradorMonedero();
        JPanel imagen = new CompradorImagen();
        JPanel deposito = new CompradorDeposito();

        //se añaden los subpaneles
        this.add(imagen);
        this.add(monedero);
        this.add(deposito);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }

    public ArrayList<JButton> getMonedas(){return monedero.getMonedas();}
}
