package org.example.PanelComprador;

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


    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        // No es necesario llamar paintComponenualmente en los hijos

    }
}