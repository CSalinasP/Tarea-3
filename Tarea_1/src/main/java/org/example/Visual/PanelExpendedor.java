package org.example.Visual;
import org.example.Logica.Expendedor;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
/**
 * Panel principal gráfico del expendedor.
 *
 * @author Farentsens
 * @version 1.3
 */
public class PanelExpendedor extends JPanel {
    /**
     * Lista de botones de interacción ubicados en el panel este.
     */
    private ArrayList<JButton> botones;
    /**
     * Lista de componentes visuales que representan los productos mostrados en el panel central.
     */
    private ArrayList<ProductosImagen> productos;
    /**
     * Crea y configura el panel principal del expendedor.
     * Inicializa los subpaneles de cada sección de la interfaz y los añade al diseño principal, permitiendo la distribución
     * y visualización adecuada de cada componente.
     * @param exp instancia de la lógica del expendedor utilizada para inicializar los subpaneles y productos.
     */
    public PanelExpendedor(Expendedor exp){
        this.setLayout(new BorderLayout()); //Delimita el panel en 5 partes

        //Se instancia los subpaneles
        ExpendedorC C = new ExpendedorC(exp);
        ExpendedorN N = new ExpendedorN();
        ExpendedorS S = new ExpendedorS();
        ExpendedorE E = new ExpendedorE();
        ExpendedorW W = new ExpendedorW();

        botones = E.getBotones();
        productos = C.getProductos();


        //Se añaden los subpaneles al panel expendedor
        this.add(C, BorderLayout.CENTER);
        this.add(N, BorderLayout.NORTH);
        this.add(S, BorderLayout.SOUTH);
        this.add(E, BorderLayout.EAST);
        this.add(W, BorderLayout.WEST);
    }
    /**
     * Obtiene la lista de botones principales de interacción con el expendedor.
     *
     * @return lista de botones {@link JButton}.
     */
    public ArrayList<JButton> getBotones(){
        return botones;
    }
    /**
     * Retorna la lista de productos visualizados actualmente en el expendedor.
     *
     * @return lista de instancias {@link ProductosImagen}.
     */
    public ArrayList<ProductosImagen> getProductos(){
        return productos;
    }
    /**
     * Sobrescribe el método de dibujo del panel.
     * <p>
     * Llama al método padre para asegurar la correcta visualización y renderizado de todos los subcomponentes.
     * </p>
     *
     * @param g contexto gráfico utilizado para dibujar el panel.
     */
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
