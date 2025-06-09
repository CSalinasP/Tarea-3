package org.example.Visual;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Panel visual que representa la interfaz lateral del expendedor.
 * 
 * @author CSalinas
 * @version 1.3
 */
public class ExpendedorE extends JPanel {
    /**
     * Lista de botones numéricos provenientes del panel de selección de código.
     */
    private ArrayList<JButton> botones;
    private PanelReinicio reinicio;

    /**
     * Crea el panel lateral del expendedor.
     * <p>
     * Establece el diseño del panel principal, el color de fondo y agrega los subpaneles
     * necesarios para la interacción con el usuario (panel numérico y panel dispensador).
     * </p>
     */
    public ExpendedorE() {
        this.setLayout(new GridLayout(2, 1, 5, 5)); // 2 filas, 1 columna, con 5px de espacio entre componentes
        this.setBackground(Color.black);
        PanelNumerico panelNumerico = new PanelNumerico();
        botones = panelNumerico.getBotones();
        this.add(panelNumerico);

        reinicio = new PanelReinicio();
        this.add(reinicio);
    }

    /**
     * Obtiene la lista de botones numéricos disponibles en el panel.
     *
     * @return lista de botones para ingresar códigos de productos.
     */
    public ArrayList<JButton> getBotones(){
        return botones;
    }

    public PanelReinicio getReinicio(){
        return reinicio;
    }

    /**
     * Sobrescribe el método de dibujo del panel para asegurar el correcto renderizado
     * de todos los componentes visuales.
     *
     * @param g contexto gráfico utilizado para dibujar el panel.
     */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}