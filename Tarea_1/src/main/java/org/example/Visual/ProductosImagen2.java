package org.example.Visual;

import javax.swing.*;

public class ProductosImagen2 extends JPanel {
    private JLabel inventario;
    private JLabel imagen;
    private int contador;
    public ProductosImagen2(String inventario, JLabel imagen){
        this.imagen = imagen;
        this.add(imagen);
        this.inventario = new JLabel(inventario);
        this.add(this.inventario);
    }

    public void añadeImagen(JLabel imagen){
        this.add(imagen);
    }

    public void remueveImagen(){
        this.remove(imagen);
    }

    public void setInventario(){
        contador+=1;
        inventario.setText(String.valueOf(contador));
    }

}
