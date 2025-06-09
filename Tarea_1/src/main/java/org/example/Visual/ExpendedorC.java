package org.example.Visual;
import org.example.Logica.Expendedor;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ExpendedorC extends JPanel {
    private ArrayList<ProductosImagen> productos;
    public ExpendedorC(Expendedor exp){
        this.setPreferredSize(new Dimension(200,200));
        this.setLayout(new GridLayout(3, 2, 5, 5));
        productos= new ArrayList<>();

        ProductosImagen cocacola = new ProductosImagen(exp);
        cocacola.addImagenTexto("CocaCola");
        this.add(cocacola);
        productos.add(cocacola);

        ProductosImagen sprite = new ProductosImagen(exp);
        sprite.addImagenTexto("Sprite");
        this.add(sprite);
        productos.add(sprite);

        ProductosImagen fanta = new ProductosImagen(exp);
        fanta.addImagenTexto("Fanta");
        this.add(fanta);
        productos.add(fanta);

        ProductosImagen super8 = new ProductosImagen(exp);
        super8.addImagenTexto("Super8");
        this.add(super8);
        productos.add(super8);

        ProductosImagen snickers = new ProductosImagen(exp);
        snickers.addImagenTexto("Snickers");
        this.add(snickers);
        productos.add(snickers);
    }

    public ArrayList<ProductosImagen> getProductos(){
        return productos;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
