package org.example.Visual;

import java.net.URL;
import org.example.Logica.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * Panel principal de la interfaz gráfica del expendedor.
 * @author Farentsens
 * @version 1.5
 */
public class PanelPrincipal extends JPanel {
    /**
     * Panel del expendedor utilizado en la interfaz.
     */
    private Ventana ventana;
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
    Moneda m;
    Tipo T;

    /**
     * Constructor de la clase que crea e inicializa las propiedaes del Panel Principal, añadiendo los Listeners y
     * funcionalidades necesarias para permitir la interaccion con el usuario.
     * @param ventana corresponde a la ventana que contiene el panel y que permite al boton de reinicio cerrar el panel
     * actual y volverlo a iniciar.
     */
    public PanelPrincipal(Ventana ventana) {
        this.ventana = ventana;
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
        boolean[] estados = {false, false, false, false, false, false};
        m = null;
        T = null;

        /**listeners para los botones*/

        for (int i = 0; i < 6; i++) {
            int I = i;
            monedas.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    estados[I] = true;
                }
            });
        }

        for (int i = 0; i < 5; i++) {
            int I = i;
            botones.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (I == 0) {
                        T = Tipo.COCA;
                    } else if (I == 1) {
                        T = Tipo.SPRITE;
                    } else if (I == 2) {
                        T = Tipo.FANTA;
                    } else if (I == 3) {
                        T = Tipo.SUPER8;
                    } else if (I == 4) {
                        T = Tipo.SNICKERS;
                    }
                    if (estados[0] == true) {
                        m = new Moneda100();
                    } else if (estados[1] == true) {
                        m = new Moneda200();
                    } else if (estados[2] == true) {
                        m = new Moneda300();
                    } else if (estados[3] == true) {
                        m = new Moneda500();
                    } else if (estados[4] == true) {
                        m = new Moneda1000();
                    } else if (estados[5] == true) {
                        m = new Moneda1500();
                    }
                }
            });
        }

        botones.get(5).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (T == Tipo.COCA) {
                        comLogica = new Comprador(m, T, expLogica);
                        productos.get(0).setStock("coca");
                        URL url = getClass().getResource("/CocaCola.png");
                        if (url == null) {
                            System.err.println("Error: La imagen no se encontró en la ruta especificada");}
                        else {
                            ImageIcon imagenIcon = new ImageIcon(url);
                            Image I = imagenIcon.getImage();
                            Image aux = I.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                            imagenIcon = new ImageIcon(aux);
                            retiros.get(0).setIcon(imagenIcon);
                            retiros.get(0).setText("cocacola");
                        }
                        retiros.get(1).setText("Retirar Vuelto: " + String.valueOf(comLogica.cuantoVuelto()));
                        exp.getStatus().setEstatus("Estatus: compra exitosa");
                        m = null;
                        T = null;
                        for (int i = 0; i < 6; i++) {
                            estados[i] = false;
                        }
                    } else if (T == Tipo.SPRITE) {
                        comLogica = new Comprador(m, T, expLogica);
                        productos.get(1).setStock("sprite");
                        URL url = getClass().getResource("/Sprite.png");
                        if (url == null) {
                            System.err.println("Error: La imagen no se encontró en la ruta especificada");}
                        else {
                            ImageIcon imagenIcon = new ImageIcon(url);
                            Image I = imagenIcon.getImage();
                            Image aux = I.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                            imagenIcon = new ImageIcon(aux);
                            retiros.get(0).setIcon(imagenIcon);
                            retiros.get(0).setText("sprite");
                        }
                        retiros.get(1).setText("Retirar Vuelto: " + String.valueOf(comLogica.cuantoVuelto()));
                        exp.getStatus().setEstatus("Estatus: compra exitosa");
                        m = null;
                        T = null;
                        for (int i = 0; i < 6; i++) {
                            estados[i] = false;
                        }
                    } else if (T == Tipo.FANTA) {
                        comLogica = new Comprador(m, T, expLogica);
                        productos.get(2).setStock("fanta");
                        URL url = getClass().getResource("/Fanta.png");
                        if (url == null) {
                            System.err.println("Error: La imagen no se encontró en la ruta especificada");}
                        else {
                            ImageIcon imagenIcon = new ImageIcon(url);
                            Image I = imagenIcon.getImage();
                            Image aux = I.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                            imagenIcon = new ImageIcon(aux);
                            retiros.get(0).setIcon(imagenIcon);
                            retiros.get(0).setText("fanta");
                        }
                        retiros.get(1).setText("Retirar Vuelto: " + String.valueOf(comLogica.cuantoVuelto()));
                        exp.getStatus().setEstatus("Estatus: compra exitosa");
                        m = null;
                        T = null;
                        for (int i = 0; i < 6; i++) {
                            estados[i] = false;
                        }
                    } else if (T == Tipo.SUPER8) {
                        comLogica = new Comprador(m, T, expLogica);
                        productos.get(3).setStock("super8");
                        URL url = getClass().getResource("/Super8.png");
                        if (url == null) {
                            System.err.println("Error: La imagen no se encontró en la ruta especificada");}
                        else {
                            ImageIcon imagenIcon = new ImageIcon(url);
                            Image I = imagenIcon.getImage();
                            Image aux = I.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                            imagenIcon = new ImageIcon(aux);
                            retiros.get(0).setIcon(imagenIcon);
                            retiros.get(0).setText("super8");
                        }
                        retiros.get(1).setText("Retirar Vuelto: " + String.valueOf(comLogica.cuantoVuelto()));
                        exp.getStatus().setEstatus("Estatus: compra exitosa");
                        m = null;
                        T = null;
                        for (int i = 0; i < 6; i++) {
                            estados[i] = false;
                        }
                    } else if (T == Tipo.SNICKERS) {
                        comLogica = new Comprador(m, T, expLogica);
                        productos.get(4).setStock("snickers");
                        URL url = getClass().getResource("/Snickers.png");
                        if (url == null) {
                            System.err.println("Error: La imagen no se encontró en la ruta especificada");}else {
                            ImageIcon imagenIcon = new ImageIcon(url);
                            Image I = imagenIcon.getImage();
                            Image aux = I.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                            imagenIcon = new ImageIcon(aux);
                            retiros.get(0).setIcon(imagenIcon);
                            retiros.get(0).setText("snickers");
                        }
                        retiros.get(1).setText("Retirar Vuelto: " + String.valueOf(comLogica.cuantoVuelto()));
                        exp.getStatus().setEstatus("Estatus: compra exitosa");
                        m = null;
                        T = null;
                        for (int i = 0; i < 6; i++) {
                            estados[i] = false;
                        }
                    }

                } catch (Exepciones E) {
                    if (E instanceof PagoIncorrectoException) {
                        exp.getStatus().setEstatus("Estatus: pago incorrecto");
                    }
                    if (E instanceof NoHayProductoException) {
                        exp.getStatus().setEstatus("Estatus: el producto solicitado no esta en stock");
                    }
                    if (E instanceof PagoInsuficienteException) {
                        exp.getStatus().setEstatus("Estatus: pago insuficiente");
                    }
                }
            }
        });


        retiros.get(0).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("cocacola".equals(retiros.get(0).getText())) {
                    com.getProductos().get(0).setInventario();
                    retiros.get(0).setIcon(null);
                    retiros.get(0).setText("Retirar Producto");
                } else if ("sprite".equals(retiros.get(0).getText())) {
                    com.getProductos().get(1).setInventario();
                    retiros.get(0).setIcon(null);
                    retiros.get(0).setText("Retirar Producto");
                } else if ("fanta".equals(retiros.get(0).getText())) {
                    com.getProductos().get(2).setInventario();
                    retiros.get(0).setIcon(null);
                    retiros.get(0).setText("Retirar Producto");
                } else if ("super8".equals(retiros.get(0).getText())) {
                    com.getProductos().get(3).setInventario();
                    retiros.get(0).setIcon(null);
                    retiros.get(0).setText("Retirar Producto");
                } else if ("snickers".equals(retiros.get(0).getText())) {
                    com.getProductos().get(4).setInventario();
                    retiros.get(0).setIcon(null);
                    retiros.get(0).setText("Retirar Producto");
                }
            }
        });

        retiros.get(1).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (retiros.get(1).getText() != "Retirar Vuelto") {
                    retiros.get(1).setText("Retirar Vuelto");
                    retiros.get(1).setIcon(null);
                }
            }
        });

        exp.getPanelReinicio().getReestart().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.ReiniciarExpendedor();
            }
        });
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}