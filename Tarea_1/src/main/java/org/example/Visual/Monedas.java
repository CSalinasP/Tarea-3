package org.example.Visual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 * Representa una moneda interactiva en la interfaz gráfica.
 * <p>
 *
 * @author CSalinasP
 * @version 1.4
 */
public class Monedas extends JPanel {
    /**
     * Valor de la moneda (por ejemplo: 200, 300, 500, 1000, 1500).
     */
    private int valor;
    /**
     * Indica si la moneda está seleccionada.
     */
    private boolean selecionada = false;
    /**
     * Crea una nueva moneda de un valor determinado.
     * Establece el tamaño preferido y agrega un oyente para que la moneda
     * cambie su estado de selección al ser clickeada.
     * @param valor valor facial de la moneda.
     */
    public Monedas(int valor) {
        this.valor = valor;
        setPreferredSize(new Dimension(20,20));


        // Hacemos la moneda "clickeable"
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selecionada = !selecionada;      // Cambia el estado de selección
                repaint();
            }
        });
    }
    /**
     * Pinta la moneda según su valor y estado de selección.
     * <p>
     * Cambia el color de la moneda para cada valor y dibuja un borde diferente si está seleccionada.
     * También imprime el valor en el centro.
     * </p>
     * @param g contexto gráfico utilizado para dibujar el componente.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Color colorMoneda;
        switch (valor) {
            case 200: colorMoneda = new Color(215, 215, 215); break;
            case 300: colorMoneda = new Color(184, 115, 51); break;
            case 500: colorMoneda = Color.ORANGE; break;
            case 1000: colorMoneda = new Color(189, 162, 67); break;
            case 1500: colorMoneda = new Color(140, 171, 221); break;
            default: colorMoneda = Color.YELLOW;
        }

        g.setColor(colorMoneda);
        g.fillOval(5, 5, getWidth() - 10, getHeight() - 10);

        g.setColor(selecionada ? Color.BLUE : Color.BLACK);
        g.drawOval(5, 5, getWidth() - 10, getHeight() - 10);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 14));
        String texto = String.valueOf(valor);
        FontMetrics fm = g.getFontMetrics();
        int x = (getWidth() - fm.stringWidth(texto)) / 2;
        int y = (getHeight() + fm.getAscent()) / 2 - 5;
        g.drawString(texto, x, y);
    }
    /**
     * Retorna el valor de la moneda.
     * @return valor facial de la moneda.
     */
    public int getValor() { return valor; }
    /**
     * Indica si la moneda se encuentra seleccionada.
     * @return {@code true} si la moneda está seleccionada, {@code false} en caso contrario.
     */
    public boolean isSeleccionada() { return selecionada; }
}