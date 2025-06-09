package org.example.Visual;

import org.example.Logica.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * Panel principal de la interfaz gráfica del expendedor.

 * 
 * @author Farentsens
 * @version 1.5
 */
public class PanelPrincipal extends JPanel {
    /**
     * Panel del expendedor utilizado en la interfaz.
     */
    private PanelExpendedor exp;

    /**
     * Panel del comprador utilizado en la interfaz.
     */
    private PanelComprador com;

    /**
     * Lista de botones para seleccionar productos.
     */
    private ArrayList<JButton> botones;

    private ArrayList<JButton> retiros;

    /**
     * Lista de botones para seleccionar monedas.
     */
    private ArrayList<JButton> monedas;

    /**
     * Lista de componentes visuales para mostrar los productos.
     */
    private ArrayList<ProductosImagen> productos;

    /**
     * Instancia de la lógica del expendedor.
     */
    private Expendedor expLogica;

    /**
     * Instancia de la lógica del comprador.
     */
    private Comprador comLogica;

    /**
     * Estados booleanos de control de selección.
     */
    private boolean b1 = false, b2 = false;

    /**
     * Crea el panel principal, inicializando tanto los elementos gráficos como la lógica del expendedor
     * y todos los listeners necesarios para la interacción del usuario.
     */
    public PanelPrincipal(){
        // (Aquí va la implementación del constructor, ya documentada en detalle si hiciera falta)
        expLogica = new Expendedor(100, Precio.CIEN, Precio.DOSCIENTOS, Precio.TRESCIENTOS, Precio.QUINIENTOS, Precio.MIL);
        exp = new PanelExpendedor(expLogica);
        com = new PanelComprador(expLogica);
        this.setBackground(Color.WHITE);
        this.add(exp);
        this.add(com);

        botones = exp.getBotones();
        retiros = exp.getRetiros();
        productos = exp.getProductos();
        monedas = com.getMonedas();
        boolean[] estados = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};

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
                        estados[10] = true;
                    } catch (Exepciones ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });

        retiros.get(0).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(estados[10]==true){
                   com.getProductos().get(0).setInventario();
                   estados[10] = false;
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
                        estados[11] = true;
                    } catch (Exepciones ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });

        retiros.get(0).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(estados[11]==true){
                    com.getProductos().get(1).setInventario();
                    estados[11] = false;
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
                        estados[12] = true;
                    } catch (Exepciones ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });

        retiros.get(0).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(estados[12]==true){
                    com.getProductos().get(2).setInventario();
                    estados[12] = false;
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
                        estados[13] = true;
                    } catch (Exepciones ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });

        retiros.get(0).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(estados[13]==true){
                    com.getProductos().get(3).setInventario();
                    estados[13] = false;
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
                        estados[14] = true;
                    } catch (Exepciones ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });

        retiros.get(0).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(estados[14]==true){
                    com.getProductos().get(4).setInventario();
                    estados[14] = false;
                }
            }
        });
    }

    /**
     * Sobrescribe el método de dibujo del panel.
     * <p>
     * Llama al método padre {@code super.paintComponent(g)} para asegurar la correcta
     * visualización de todos los componentes.
     * </p>
     * 
     * @param g el contexto gráfico sobre el que pintar el panel.
     */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        // No es necesario llamar paintComponent en los hijos
    }
}