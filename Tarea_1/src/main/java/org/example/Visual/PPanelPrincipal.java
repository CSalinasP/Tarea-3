package org.example.Visual;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.net.URL;

public class PPanelPrincipal extends JPanel {
    public PPanelPrincipal() {
        this.setLayout(new BorderLayout()); //Delimita el panel en 5 partes
        PPanel p = new PPanel(); //instancia  del panel numerico
        //texto para los subpaneles superior e izquierdo (este ultimo con formato por eso </html>)
        JLabel texto1 = new JLabel("Feedback");
        JLabel texto2 = new JLabel("<html>INFORMACIÓN:<br>" +
                "-Dinero: <br>" +
                "-Vuelto: <br>" +
                "-Compras: </html>");

        //Instancias de los subpaneles
        JPanel N = new JPanel();
        JPanel S = new JPanel();
        JPanel E = new JPanel();
        JPanel W = new JPanel();
        JPanel C = new JPanel();

        //coloreado de los subpaneles superior e izquierdo para resaltar el texto
        N.setBackground(Color.RED);
        W.setBackground(Color.BLUE);


        //Botones para cada subpanel
        N.add(texto1);
        S.add(new JButton("Retirar Dinero"));
        S.add(new JButton("Retirar Producto"));
        S.add(new JButton("Insertar Dinero"));
        S.add(new JButton("Retirar Dinero"));
        E.add(p);
        W.add(texto2);

        //ubicacion de las imagenes
        URL imageUrl1 = getClass().getClassLoader().getResource("CocaCola.png");
        URL imageUrl4 = getClass().getClassLoader().getResource("Super8.jpg");

        //se añaen las imagenes al subpanel central
        ImageIcon Imagen1 = new ImageIcon(imageUrl1);
        ImageIcon Imagen4 = new ImageIcon(imageUrl4);

        JLabel imageLabel1 = new JLabel(Imagen1);
        JLabel imageLabel4 = new JLabel(Imagen4);

        C.add(imageLabel1);
        C.add(imageLabel4);

        //se añaden los distintos subpaneles al panel principal
        this.add(N, BorderLayout.NORTH);
        this.add(S, BorderLayout.SOUTH);
        this.add(E, BorderLayout.EAST);
        this.add(W, BorderLayout.WEST);
        this.add(C, BorderLayout.CENTER);
    }
}