package org.example.Visual;

import javax.swing.*;

/**
 * Clase que representa un producto dentro del inventario del  comprador.
 * @author Francisco Arentsen.
 */
public class ProductosImagen2 extends JPanel {
    private JLabel inventario;
    private JLabel imagen;
    private int contador;

    /**
     * Constructor de la clse que añade la imagen del producto del inventario.
     * @param imagen JLabel relativo a la imagen del producto.
     * @param inventario corresponde la cantidad de producto en el inventario.
     */
    public ProductosImagen2(String inventario, JLabel imagen){
        this.imagen = imagen;
        this.add(imagen);
        this.inventario = new JLabel(inventario);
        this.add(this.inventario);
    }

    /**
     * Metodo que añade la imagen del producto del inventario.
     * *@param es JLabel relativo a la imagen del producto.
     */
    public void añadeImagen(JLabel imagen){
        this.add(imagen);
    }

    /**
     * Metodo que remueve la imagen del producto del inventario.
     */
    public void remueveImagen(){
        this.remove(imagen);
    }

    /**
     * Metodo que actualiza el inventario del comprador.
     */
    public void setInventario(){
        contador+=1;
        inventario.setText(String.valueOf(contador));
    }

}
