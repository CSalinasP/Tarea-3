package org.example.Visual;
import org.example.Logica.Expendedor;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelExpendedor extends JPanel {
    private ArrayList<JButton> botones;
    private ArrayList<Productos> productos;
    public PanelExpendedor(Expendedor exp){
        this.setLayout(new BorderLayout()); //Delimita el panel en 5 partes

        //Se instancia los subpaneles
        ExpendedorC C = new ExpendedorC(exp);
        ExpendedorN N = new ExpendedorN();
        ExpendedorS S = new ExpendedorS();
        ExpendedorE E = new ExpendedorE();
        ExpendedorW W = new ExpendedorW();

        botones = E.getBotones();
        productos = C.getProductos();


        //Se añaden los subpaneles al panel expendedor
        this.add(C, BorderLayout.CENTER);
        this.add(N, BorderLayout.NORTH);
        this.add(S, BorderLayout.SOUTH);
        this.add(E, BorderLayout.EAST);
        this.add(W, BorderLayout.WEST);
    }

    public ArrayList<JButton> getBotones(){
        return botones;
    }
    public ArrayList<Productos> getProductos(){
        return productos;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
