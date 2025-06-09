package org.example.Visual;

import javax.swing.*;
import java.awt.*;

/**
 * Panel que da la bienvenida a la interfaz.
 * @author CSalinasP
 * @version 1.0
 */
public class ExpendedorN extends JPanel {

    /**
     * Texto actual del mensaje mostrado en el panel.
     */
    String Mensaje;

    /**
     * Etiqueta gráfica utilizada para mostrar el mensaje.
     */
    JLabel mensajeLabel;

    /**
     * Crea un nuevo panel de mensaje para el expendedor.
     * Inicializa el mensaje con un texto de bienvenida y configura el formato visual del panel y la etiqueta.
     */
    public ExpendedorN(){
        this.setPreferredSize(new Dimension(200, 100));
        this.setBackground(Color.gray);
        this.setLayout(new GridBagLayout());
        Mensaje = "Bienvenido!";
        mensajeLabel = new JLabel(Mensaje);
        mensajeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        this.add(mensajeLabel);
    }

    /**
     * Sobrescribe el método de dibujo del panel para asegurar el correcto renderizado.
     * <p>
     * Llama al método padre para garantizar la visualización de todos los componentes.
     * </p>
     * 
     * @param g contexto gráfico utilizado para dibujar el panel.
     */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }

    /**
     * Actualiza el mensaje mostrado en el panel.
     * <p>
     * Cambia el texto de la etiqueta y refresca la visualización.
     * </p>
     * @param nuevoMensaje el nuevo mensaje que se desea mostrar.
     */
    public void actualizarMensaje(String nuevoMensaje) {
        mensajeLabel.setText(nuevoMensaje);
        this.revalidate();
        this.repaint();
    }
}