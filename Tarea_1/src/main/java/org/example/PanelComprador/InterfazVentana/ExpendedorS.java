package org.example.PanelComprador.InterfazVentana;

import org.example.PanelComprador.PanelRetirarProducto;
import org.example.PanelComprador.PanelRetirarVuelto;

import javax.swing.*;
import java.awt.*;

public class ExpendedorS extends JPanel {

    JPanel PanelRetirarProducto;
    JPanel PanelRetirarVuelto;

    public ExpendedorS(){
        this.setPreferredSize(new Dimension(200, 150));
        this.setBackground(Color.white);
        this.setLayout(new GridLayout(1, 2, 5, 5));
        PanelRetirarProducto = new PanelRetirarProducto();
        PanelRetirarVuelto = new PanelRetirarVuelto();
        this.add(PanelRetirarProducto);
        this.add(PanelRetirarVuelto);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
