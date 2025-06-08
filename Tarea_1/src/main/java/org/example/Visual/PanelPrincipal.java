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
        expLogica = new Expendedor(100, Precio.CIEN, Precio.DOSCIENTOS, Precio.TRESCIENTOS, Precio.QUINIENTOS, Precio.MIL);
        exp = new PanelExpendedor(expLogica);
        com = new PanelComprador();
        this.setBackground(Color.WHITE);
        this.add(exp);
        this.add(com);

        botones = exp.getBotones();
        productos = exp.getProductos();
        monedas = com.getMonedas();
        boolean[] estados = {false, false, false, false, false, false, false, false, false, false};

        /**listeners para los botones*/
        botones.get(0).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                estados[0] = true;
            }
        });

        monedas.get(0).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                estados[1] = true;
            }
        });

        botones.get(5).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(estados[0]==true && estados[1]==true){
                    Moneda m = new Moneda100();
                    try {
                        comLogica = new Comprador(m, Tipo.COCA, expLogica);
                        productos.get(0).setStock("coca");
                        estados[0] = false;
                        estados[1] = false;
                    } catch (Exepciones ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });

        botones.get(1).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                estados[2] = true;
            }
        });

        monedas.get(1).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                estados[3] = true;
            }
        });

        botones.get(5).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(estados[2]==true && estados[3]==true){
                    Moneda m = new Moneda200();
                    try {
                        comLogica = new Comprador(m, Tipo.SPRITE, expLogica);
                        productos.get(1).setStock("sprite");
                        estados[2] = false;
                        estados[3] = false;
                    } catch (Exepciones ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });

        botones.get(2).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                estados[4] = true;
            }
        });

        monedas.get(2).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                estados[5] = true;
            }
        });

        botones.get(5).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(estados[4]==true && estados[5]==true){
                    Moneda m = new Moneda300();
                    try {
                        comLogica = new Comprador(m, Tipo.FANTA, expLogica);
                        productos.get(2).setStock("fanta");
                        estados[4] = false;
                        estados[5] = false;
                    } catch (Exepciones ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });

        botones.get(3).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                estados[6] = true;
            }
        });

        monedas.get(3).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                estados[7] = true;
            }
        });

        botones.get(5).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(estados[6]==true && estados[7]==true){
                    Moneda m = new Moneda500();
                    try {
                        comLogica = new Comprador(m, Tipo.SUPER8, expLogica);
                        productos.get(3).setStock("super8");
                        estados[6] = false;
                        estados[7] = false;
                    } catch (Exepciones ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });

        botones.get(4).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                estados[8] = true;
            }
        });

        monedas.get(4).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                estados[9] = true;
            }
        });

        botones.get(5).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(estados[8]==true && estados[9]==true){
                    Moneda m1 = new Moneda1000();
                    try {
                        comLogica = new Comprador(m1, Tipo.SNICKERS, expLogica);
                        productos.get(4).setStock("snickers");
                        estados[8] = false;
                        estados[9] = false;
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