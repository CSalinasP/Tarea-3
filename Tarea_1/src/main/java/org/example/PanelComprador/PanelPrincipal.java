package org.example.PanelComprador;

import org.example.PanelComprador.InterfazVentana.PanelComprador;
import org.example.PanelComprador.InterfazVentana.PanelExpendedor;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private PanelExpendedor exp;
    private PanelComprador com;

    public PanelPrincipal(){
        exp = new PanelExpendedor();
        com = new PanelComprador();
        this.setBackground(Color.WHITE);
        this.add(exp);
        this.add(com);
    }

    public void PaintComponent (Graphics g){
        super.paintComponent(g);
        com.paintComponent(g);
        exp.paintComponent(g);
    }
}