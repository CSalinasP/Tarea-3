package org.example.Visual;
import org.example.Logica.Expendedor;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelExpendedor extends JPanel {
    private ArrayList<JButton> botones;
    private ArrayList<JButton> retiros;
    private ArrayList<ProductosImagen> productos;
    private ExpendedorW W;
    private ExpendedorE E;
    public PanelExpendedor(Expendedor exp){
        this.setLayout(new BorderLayout()); //Delimita el panel en 5 partes

        //Se instancia los subpaneles
        ExpendedorC C = new ExpendedorC(exp);
        ExpendedorN N = new ExpendedorN();
        ExpendedorS S = new ExpendedorS();
        E = new ExpendedorE();
        W = new ExpendedorW();

        botones = E.getBotones();
        retiros = S.getBotones();
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
    public ArrayList<JButton> getRetiros(){
        return retiros;
    }
    public PanelReinicio getPanelReinicio(){
        return E.getReinicio();
    }
    public ExpendedorW getStatus(){return W;}
    public ArrayList<ProductosImagen> getProductos(){
        return productos;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
