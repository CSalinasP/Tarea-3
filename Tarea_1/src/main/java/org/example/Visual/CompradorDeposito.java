package org.example.Visual;

import org.example.Logica.Expendedor;
import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;

/**Clase que representa el deposito de inventario del comprador
  @author CSalinasP
  @version 1.3
 */
public class CompradorDeposito extends JPanel {
    private ArrayList<ProductosImagen2> productos;
    private ImageIcon imagenIcon;
    private JLabel imagenLabel;
    private URL url;
    private JLabel stock;

    /**
     * Constructor de la clase que crea e inicializa las propiedades del panel y agrega los productos del inventario
     * al deposito.
     */
    CompradorDeposito() {
        this.setLayout(new GridLayout(2, 3, 5, 5));
        this.setBackground(Color.gray);
        productos = new ArrayList<>();
        stock = new JLabel("0");
        url = getClass().getResource("/CocaCola.png");
        if (url == null) {
            System.err.println("Error: La imagen no se encontró en la ruta especificada");}
        else {
            imagenIcon = new ImageIcon(url);
            Image I = imagenIcon.getImage();
            Image aux = I.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            imagenIcon = new ImageIcon(aux);
            imagenLabel = new JLabel(imagenIcon);
            ProductosImagen2 cocacola = new ProductosImagen2("0",imagenLabel);
            productos.add(cocacola);
            this.add(cocacola);
        }

        stock = new JLabel("0");
        url = getClass().getResource("/Sprite.png");
        if (url == null) {
            System.err.println("Error: La imagen no se encontró en la ruta especificada");}
        else {
            imagenIcon = new ImageIcon(url);
            Image I = imagenIcon.getImage();
            Image aux = I.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            imagenIcon = new ImageIcon(aux);
            imagenLabel = new JLabel(imagenIcon);
            ProductosImagen2 sprite = new ProductosImagen2("0",imagenLabel);
            productos.add(sprite);
            this.add(sprite);
        }

        stock = new JLabel("0");
        url = getClass().getResource("/Fanta.png");
        if (url == null) {
            System.err.println("Error: La imagen no se encontró en la ruta especificada");}
        else {
            imagenIcon = new ImageIcon(url);
            Image I = imagenIcon.getImage();
            Image aux = I.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            imagenIcon = new ImageIcon(aux);
            imagenLabel = new JLabel(imagenIcon);
            ProductosImagen2 fanta = new ProductosImagen2("0",imagenLabel);
            productos.add(fanta);
            this.add(fanta);
        }

        stock = new JLabel("0");
        url = getClass().getResource("/Super8.png");
        if (url == null) {
            System.err.println("Error: La imagen no se encontró en la ruta especificada");}
        else {
            imagenIcon = new ImageIcon(url);
            Image I = imagenIcon.getImage();
            Image aux = I.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            imagenIcon = new ImageIcon(aux);
            imagenLabel = new JLabel(imagenIcon);
            ProductosImagen2 super8 = new ProductosImagen2("0",imagenLabel);
            productos.add(super8);
            this.add(super8);
        }

        stock = new JLabel("0");
        url = getClass().getResource("/Snickers.png");
        if (url == null) {
            System.err.println("Error: La imagen no se encontró en la ruta especificada");}
        else {
            imagenIcon = new ImageIcon(url);
            Image I = imagenIcon.getImage();
            Image aux = I.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            imagenIcon = new ImageIcon(aux);
            imagenLabel = new JLabel(imagenIcon);
            ProductosImagen2 snickers = new ProductosImagen2("0",imagenLabel);
            productos.add(snickers);
            this.add(snickers);
        }
    }

    public ArrayList<ProductosImagen2> getProductos(){
        return productos;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
