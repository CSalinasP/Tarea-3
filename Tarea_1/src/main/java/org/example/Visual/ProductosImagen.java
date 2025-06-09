package org.example.Visual;
import org.example.Logica.Expendedor;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Clase que representa un producto dentro del expendedor.
 * @author Francisco Arentsen.
 */
public class ProductosImagen extends JPanel {
    private ImageIcon imagenIcon;
    private URL url;
    private JLabel imagenLabel;
    private JLabel stock;
    Expendedor exp;

    /**
     * Constructor de la clase que hace la configuracion inicial del panel e inicializa el stock del producto asociado.
     * *@param exp es el expendedor asociador.
     */
    public ProductosImagen(Expendedor exp) {
        this.exp = exp;
        setPreferredSize(new Dimension(50, 50));
        this.setLayout(new GridLayout(2, 1, 5, 5));
        setLayout(new BorderLayout());
        this.setBackground(Color.black);
        setOpaque(false);
        stock = new JLabel(String.valueOf(exp.getStock("coca")));
    }

    /**
     * Metodo que añade la imagen del producto del inventario.
     * @param nombreImagen es el nombre asosiado a la imagen del producto
     */
    public void addImagenTexto(String nombreImagen) {
        url = getClass().getResource("/"+nombreImagen+".png");
        if (url == null) {
            System.err.println("Error: La imagen no se encontró en la ruta especificada");}
        else{
            imagenIcon = new ImageIcon(url);
            Image I = imagenIcon.getImage();
            Image aux = I.getScaledInstance(50,50,Image.SCALE_SMOOTH);
            imagenIcon = new ImageIcon(aux);
            imagenLabel = new JLabel(imagenIcon);
            this.add(imagenLabel);
            this.add(stock);
        }
    }

    /**
     * Metodo que actualiza el stock del expendedor.
     */
    public void setStock (String deposito){
        stock.setText(exp.getStock(deposito));
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}