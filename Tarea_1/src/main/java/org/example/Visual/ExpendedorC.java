package org.example.Visual;
import org.example.Logica.Expendedor;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Panel visual que representa la selección de productos dentro de un expendedor.
 * <p>
 * Muestra los productos disponibles de forma gráfica y permite su interacción
 * utilizando un diseño de cuadrícula. Cada producto se representa mediante un componente
 * visual especializado que incluye su nombre y, opcionalmente, una imagen asociada.
 * </p>
 *
 * @author Farentsens
 * @version 1.0
 */
public class ExpendedorC extends JPanel {
    /**
     * Lista de componentes visuales que representan los productos disponibles.
     */
    private ArrayList<ProductosImagen> productos;

    /**
     * Crea el panel de productos del expendedor.
     * <p>
     *
     * @param exp instancia del expendedor asociado, utilizada para la inicialización de los productos.
     */
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

    /**
     * Retorna la lista de productos visuales contenidos en el panel.
     * 
     * @return lista de productos como componentes visuales.
     */
    public ArrayList<ProductosImagen> getProductos(){
        return productos;
    }

    /**
     * Método sobrescrito para el correcto renderizado del panel.
     * Llama al método padre {@code super.paintComponent(g)} para asegurar 
     * que todos los componentes hijos se dibujen correctamente.
     * <
     *
     * @param g contexto gráfico utilizado para dibujar el panel.
     */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}