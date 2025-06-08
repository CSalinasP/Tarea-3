package org.example.Visual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Monedas extends JPanel {
    private int valor;
    private boolean selecionada = false;

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

    public int getValor() { return valor; }
    public boolean isSeleccionada() { return selecionada; }
}