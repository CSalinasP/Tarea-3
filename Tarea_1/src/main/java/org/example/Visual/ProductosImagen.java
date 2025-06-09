package org.example.Visual;
import org.example.Logica.Expendedor;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ProductosImagen extends JPanel {
    private ImageIcon imagenIcon;
    private URL url;
    private JLabel imagenLabel;
    private JLabel stock;
    Expendedor exp;

    public ProductosImagen(Expendedor exp) {
        this.exp = exp;
        // Ayuda a los Layout Managers a calcular el tamaño inicial
        setPreferredSize(new Dimension(50, 50)); // 50x50 píxeles
        setLayout(new BorderLayout()); // Agregar layout para centrar
        this.setLayout(new GridLayout(2, 1, 5, 5));
        this.setBackground(Color.black);
        setOpaque(false);
        stock = new JLabel(String.valueOf(exp.getStock("coca")));
    }

    public ProductosImagen() {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

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
    public void setStock (String deposito){
        stock.setText(exp.getStock(deposito));
    }
}