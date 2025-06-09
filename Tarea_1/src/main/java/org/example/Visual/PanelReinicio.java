package org.example.Visual;

import javax.swing.*;
import java.awt.*;
/**
 * Panel visual encargado de reiniciar el panel principal.
 * @author CSalinasP
 * @version 1.3
 */
public class PanelReinicio extends JPanel{
    JButton reestart;
    /**
     * Constructor de la clase que crea e inicializa las propiedades del panel
     */
    public PanelReinicio(){
        this.setLayout(new GridBagLayout());
        this.setBackground(Color.gray);
        reestart = new JButton("Reinicio");
        this.add(reestart);
    }


    public JButton getReestart(){
        return reestart;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }

}
