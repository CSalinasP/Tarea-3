package org.example.Visual;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
/**
 * Panel visual que representa el área de interacción del comprador en la interfaz gráfica.
 * <p>
 * Este panel contiene subpaneles dedicados a la imagen del usuario, su monedero y el depósito de monedas u objetos.
 * Organiza los componentes en una disposición vertical y provee acceso a los controles de moneda del usuario.
 * </p>
 *
 * @author CSalinasP
 * @version 1.2
 */
public class PanelComprador extends JPanel {
    /**
     * Subpanel que gestiona las monedas disponibles del comprador.
     */
    CompradorMonedero monedero;
    /**
     * Crea el panel visual del comprador.
     * <p>
     * Inicializa y agrega los subpaneles de imagen, monedero y depósito,
     * estableciendo el tamaño y diseño principal del área del comprador.
     * </p>
     */
    public PanelComprador(){
        setPreferredSize(new Dimension(200,650));
        this.setLayout(new GridLayout(3, 1, 5, 5));

        //se instancian los subpaneles
        monedero = new CompradorMonedero();
        JPanel imagen = new CompradorImagen();
        JPanel deposito = new CompradorDeposito();

        //se añaden los subpaneles
        this.add(imagen);
        this.add(monedero);
        this.add(deposito);
    }
    /**
     * Sobrescribe el método de dibujo del panel.
     * <p>
     * Invoca el método padre para garantizar el correcto renderizado de todos los componentes.
     * </p>
     * @param g contexto gráfico proporcionado por el sistema para dibujar el componente.
     */
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
    /**
     * Obtiene la lista de botones correspondientes a las monedas disponibles en el monedero del comprador.
     *
     * @return lista de botones que representan las monedas del comprador.
     */
    public ArrayList<JButton> getMonedas(){return monedero.getMonedas();}
}
