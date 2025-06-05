package org.example.PanelComprador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// SOLO importar lo que sí es accesible
import org.example.Logica.GDeposito;
import org.example.Logica.Producto;

public class BotonesDelProducto extends JPanel {
    // Usar solo depósito de productos, evitar Moneda por ahora
    private GDeposito<Producto> depositoProductos;

    public BotonesDelProducto() {
        // Inicializar solo el depósito de productos
        depositoProductos = new GDeposito<>();
        
        this.setLayout(new GridLayout(3, 2));
        this.setSize(640, 480);

        // Crear 5 botones para productos
        for (int i = 1; i <= 5; i++) {
            JButton boton = new JButton("Producto " + String.valueOf(i));
            final int numProducto = i;
            
            boton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Lógica simplificada sin manejar monedas
                    String mensaje = "Producto " + numProducto + " seleccionado";
                    
                    JOptionPane.showMessageDialog(
                        BotonesDelProducto.this, 
                        mensaje
                    );
                }
            });
            this.add(boton);
        }
        
        // Componente vacío para completar el grid
        this.add(new JLabel());
    }
    
    // Métodos utilitarios solo para productos
    public void agregarProducto(Producto producto) {
        if (depositoProductos != null) {
            depositoProductos.add(producto);
        }
    }
    
    public Producto obtenerProducto() {
        return depositoProductos != null ? depositoProductos.get() : null;
    }
}