package org.example.PanelComprador;

import org.example.Logica.Expendedor;
import org.example.Logica.Precio;

import javax.swing.*;

public class VentanaPruebas extends JFrame
{
    private JPanel C;
    private Expendedor expLogica;

    public VentanaPruebas()
    {
        super();
        this.setTitle("Expendedor");
        this.setSize(640, 480);
        this.add(C);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.pack();
        this.setVisible(true);

        expLogica = new Expendedor(1,Precio.CIEN,Precio.TRESCIENTOS,Precio.MIL,Precio.MIL,Precio.MIL_QUINIENTOS);
        C = new PanelPrincipal(expLogica);

    }
}
