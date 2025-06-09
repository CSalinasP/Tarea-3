package org.example.Visual;

import org.example.Logica.Expendedor;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

/**

  @author CSalinasP
  @version 1.3
 */
public class CompradorDeposito extends JPanel {
    private ArrayList<ProductosImagen2> productos;
    private ImageIcon imagenIcon;
    private String imagenPath;
    private JLabel imagenLabel;
    private JLabel stock;
    /**
     * Crear 5 paneles para los prductos
     */
    CompradorDeposito() {
        this.setLayout(new GridLayout(2, 3, 5, 5));
        productos = new ArrayList<>();

        stock = new JLabel("0");
        imagenPath = "C:\\POO\\Tarea-3\\Tarea_1\\src\\main\\resources\\CocaCola.png";
        File imagen1 = new File(imagenPath);
        if (!imagen1.exists()) {
            System.err.println("Error: La imagen no se encontró en la ruta especificada: " + imagen1);
        } else {
            imagenIcon = new ImageIcon(imagenPath);
            Image I = imagenIcon.getImage();
            Image aux = I.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            imagenIcon = new ImageIcon(aux);
            imagenLabel = new JLabel(imagenIcon);
            ProductosImagen2 cocacola = new ProductosImagen2("0",imagenLabel);
            productos.add(cocacola);
            this.add(cocacola);
        }

        stock = new JLabel("0");
        imagenPath = "C:\\POO\\Tarea-3\\Tarea_1\\src\\main\\resources\\Sprite.png";
        File imagen2 = new File(imagenPath);
        if (!imagen2.exists()) {
            System.err.println("Error: La imagen no se encontró en la ruta especificada: " + imagen2);
        } else {
            imagenIcon = new ImageIcon(imagenPath);
            Image I = imagenIcon.getImage();
            Image aux = I.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            imagenIcon = new ImageIcon(aux);
            imagenLabel = new JLabel(imagenIcon);
            ProductosImagen2 sprite = new ProductosImagen2("0",imagenLabel);
            productos.add(sprite);
            this.add(sprite);
        }

        stock = new JLabel("0");
        imagenPath = "C:\\POO\\Tarea-3\\Tarea_1\\src\\main\\resources\\Fanta.png";
        File imagen3 = new File(imagenPath);
        if (!imagen3.exists()) {
            System.err.println("Error: La imagen no se encontró en la ruta especificada: " + imagen3);
        } else {
            imagenIcon = new ImageIcon(imagenPath);
            Image I = imagenIcon.getImage();
            Image aux = I.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            imagenIcon = new ImageIcon(aux);
            imagenLabel = new JLabel(imagenIcon);
            ProductosImagen2 fanta = new ProductosImagen2("0",imagenLabel);
            productos.add(fanta);
            this.add(fanta);
        }

        stock = new JLabel("0");
        imagenPath = "C:\\POO\\Tarea-3\\Tarea_1\\src\\main\\resources\\Super8.png";
        File imagen4 = new File(imagenPath);
        if (!imagen4.exists()) {
            System.err.println("Error: La imagen no se encontró en la ruta especificada: " + imagen4);
        } else {
            imagenIcon = new ImageIcon(imagenPath);
            Image I = imagenIcon.getImage();
            Image aux = I.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            imagenIcon = new ImageIcon(aux);
            imagenLabel = new JLabel(imagenIcon);
            ProductosImagen2 super8 = new ProductosImagen2("0",imagenLabel);
            productos.add(super8);
            this.add(super8);
        }

        stock = new JLabel("0");
        imagenPath = "C:\\POO\\Tarea-3\\Tarea_1\\src\\main\\resources\\Snickers.png";
        File imagen5 = new File(imagenPath);
        if (!imagen5.exists()) {
            System.err.println("Error: La imagen no se encontró en la ruta especificada: " + imagen5);
        } else {
            imagenIcon = new ImageIcon(imagenPath);
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

    /**
     *
     * @param g the <code>Graphics</code> parametro paintComponent
     */
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
