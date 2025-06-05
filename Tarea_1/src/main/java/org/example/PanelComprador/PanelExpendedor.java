package org.example.PanelComprador;

import javax.swing.*;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    private JButton b;
    public PanelExpendedor(){
        this.setLayout(new BorderLayout()); //Delimita el panel en 5 partes

        //Se instancia los subpaneles
        JPanel C = new ExpendedorC();
        JPanel N = new ExpendedorN();
        JPanel S = new ExpendedorS();
        ExpendedorE E = new ExpendedorE();
        JPanel W = new ExpendedorW();

        b = E.getBoton();


        //Se añaden los subpaneles al panel expendedor
        this.add(C, BorderLayout.CENTER);
        this.add(N, BorderLayout.NORTH);
        this.add(S, BorderLayout.SOUTH);
        this.add(E, BorderLayout.EAST);
        this.add(W, BorderLayout.WEST);
    }

    public JButton getBoton(){
        return b;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
