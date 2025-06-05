package org.example.PanelComprador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelPrincipal extends JPanel {
    private PanelExpendedor exp;
    private PanelComprador com;
    private JButton b;

    public PanelPrincipal(){
        exp = new PanelExpendedor();
        com = new PanelComprador();
        this.setBackground(Color.WHITE);
        this.add(exp);
        this.add(com);

        b=exp.getBoton();

        b.addActionListener(new ActionListener() {
            private int clickCount = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                if(clickCount%2==1){com.ROJO();}
                else{com.AZUL();}
            }
        });
    }


    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        // No es necesario llamar paintComponenualmente en los hijos

    }
}