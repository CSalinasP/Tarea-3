package org.example.PanelComprador;


import javax.swing.*;
import java.awt.*;

public class ExpendedorN extends JPanel {

    String Mensaje;
    JLabel mensajeLabel;

    public ExpendedorN(){
        this.setPreferredSize(new Dimension(200, 100));
        this.setBackground(Color.gray);
        this.setLayout(new GridBagLayout());
        Mensaje = "Bienvenido!";
        mensajeLabel = new JLabel(Mensaje);
        mensajeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        this.add(mensajeLabel);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }

    public void actualizarMensaje(String nuevoMensaje) {
        mensajeLabel.setText(nuevoMensaje);
        this.revalidate();
        this.repaint();
    }
}
