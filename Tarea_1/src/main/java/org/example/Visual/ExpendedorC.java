package org.example.Visual;
import org.example.Logica.Expendedor;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ExpendedorC extends JPanel {
    private ArrayList<Productos> productos;
    public ExpendedorC(Expendedor exp){
        this.setPreferredSize(new Dimension(200,200));
        this.setLayout(new GridLayout(3, 2, 5, 5));
        productos= new ArrayList<>();

        Productos cocacola = new Productos(exp);
        cocacola.addImagenTexto("CocaCola");
        this.add(cocacola);
        productos.add(cocacola);

        Productos sprite = new Productos(exp);
        sprite.addImagenTexto("Sprite");
        this.add(sprite);
        productos.add(sprite);

        Productos fanta = new Productos(exp);
        fanta.addImagenTexto("Fanta");
        this.add(fanta);
        productos.add(fanta);

        Productos super8 = new Productos(exp);
        super8.addImagenTexto("Super8");
        this.add(super8);
        productos.add(super8);

        Productos snickers = new Productos(exp);
        snickers.addImagenTexto("Snickers");
        this.add(snickers);
        productos.add(snickers);
    }

    public ArrayList<Productos> getProductos(){
        return productos;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
