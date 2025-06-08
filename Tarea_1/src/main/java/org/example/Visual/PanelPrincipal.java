package org.example.Visual;

import org.example.Logica.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PanelPrincipal extends JPanel {
    private PanelExpendedor exp;
    private PanelComprador com;
    private ArrayList<JButton> botones;
    private ArrayList<JButton> monedas;
    private ArrayList<Productos> productos;
    private Expendedor expLogica;
    private Comprador comLogica;
    private boolean b1 = false;
    private boolean b2 = false;


    public PanelPrincipal(){
        expLogica = new Expendedor(100, Precio.DOSCIENTOS, Precio.TRESCIENTOS, Precio.QUINIENTOS, Precio.MIL, Precio.MIL_QUINIENTOS);
        exp = new PanelExpendedor(expLogica);
        com = new PanelComprador();
        this.setBackground(Color.WHITE);
        this.add(exp);
        this.add(com);

        botones = exp.getBotones();
        productos = exp.getProductos();
        monedas = com.getMonedas();

        /**listeners para los botones*/
        botones.get(0).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b1 = true;
            }
        });

        monedas.get(1).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b2 = true;
            }
        });

        botones.get(5).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b1==true && b2==true){
                    Moneda m1 = new Moneda200();
                    try {
                        comLogica = new Comprador(m1, Tipo.COCA, expLogica);
                        productos.get(0).setStock("coca");
                        b1 = false;
                        b2 = false;
                    } catch (Exepciones ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });
    }


    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        // No es necesario llamar paintComponenualmente en los hijos

    }
}