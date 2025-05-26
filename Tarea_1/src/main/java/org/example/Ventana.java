package org.example;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;




public class Ventana extends JFrame
{
    Panel1 Panel1 = new Panel1();

    public Ventana()
    {
        super();
        this.setTitle("Expendedor");
        this.setSize(640, 480);
        this.add(Panel1);



        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.pack();
        this.setVisible(true);
    }
}
