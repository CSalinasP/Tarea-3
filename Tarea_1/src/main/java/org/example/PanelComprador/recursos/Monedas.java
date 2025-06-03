package org.example.PanelComprador.recursos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Monedas extends JPanel {
    /*
    Contructor de la moneda, que sera para poder ser selecionada
     */
    private int valor;
    private boolean selecionada= false;

    public  Monedas(int valor) {
        // asyda a los Layout Managers a calcular el tamaño inicial
        this.valor = valor;
        setPreferredSize(new Dimension(60, 60));
        addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                selecionada = !selecionada; // Cambia el estado al hacer clic
                repaint(); // Vuelve a dibujar con el borde azul si está seleccionada
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Escoge color según valor
        Color colorMoneda;
        switch (valor) {
            case 200: colorMoneda = new Color(215, 215, 215); break;
            case 300: colorMoneda = new Color(184, 115, 51); break;
            case 500: colorMoneda = Color.ORANGE; break;
            case 1000: colorMoneda = new Color(189, 162, 67); break;
            case 1500: colorMoneda = new Color(140, 171, 221); break;
            default: colorMoneda = Color.YELLOW;  // por si acaso
        }

        g.setColor(colorMoneda);
        g.fillOval(5, 5, getWidth() - 10, getHeight() - 10);

        // Borde
        g.setColor(selecionada ? Color.BLUE : Color.BLACK);
        g.drawOval(5, 5, getWidth() - 10, getHeight() - 10);

        // Texto valor centrado
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


