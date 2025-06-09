package org.example.Visual;

import javax.swing.*;

public class ProductosImagen2 extends JPanel {
    private JLabel inventario;
    private int contador;
    public ProductosImagen2(String inventario, JLabel imagen){
        this.add(imagen);
        this.inventario = new JLabel(inventario);
        this.add(this.inventario);
    }

    public void setInventario(){
        contador+=1;
        inventario.setText(String.valueOf(contador));
    }

}
