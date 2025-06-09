package org.example.Visual;
import org.example.Logica.Expendedor;

import javax.swing.*;
import java.awt.*;
import java.io.File;
/**
 * Panel que representa visualmente un producto, mostrando su imagen y el stock disponible.
 * @author Farentsens
 * @version 1.2
 */
public class ProductosImagen extends JPanel {
    /**
     * Icono que representa la imagen del producto.
     */
    private ImageIcon imagenIcon;
    /**
     * Ruta del archivo de la imagen.
     */
    private String imagenPath;
    /**
     * Componente gráfico para mostrar la imagen.
     */
    private JLabel imagenLabel;
    /**
     * Etiqueta para mostrar la cantidad de stock disponible.
     */
    private JLabel stock;
    /**
     * Instancia de la lógica del expendedor asociada a este producto.
     */
    Expendedor exp;
    /**
     * @param exp instancia del expendedor desde el cual obtener el stock.
     */
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

    /**
     * @param g contexto gráfico utilizado para dibujar el panel.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    /**
     * Añade al panel la imagen del producto y el texto con el stock.
     * Busca y escala la imagen indicada, añadiéndola junto con el stock disponible.
     * @param nombreImagen nombre del archivo de la imagen (sin extensión).
     */
    public void addImagenTexto(String nombreImagen) {
        imagenPath = "C:\\POO\\Tarea-3\\Tarea_1\\src\\main\\resources\\"+nombreImagen+".png";
        File imagen = new File(imagenPath);
        if (!imagen.exists()) {
            System.err.println("Error: La imagen no se encontró en la ruta especificada: " + imagen);}
        else{
            imagenIcon = new ImageIcon(imagenPath);
            Image I = imagenIcon.getImage();
            Image aux = I.getScaledInstance(50,50,Image.SCALE_SMOOTH);
            imagenIcon = new ImageIcon(aux);
            imagenLabel = new JLabel(imagenIcon);
            this.add(imagenLabel);
            this.add(stock);
        }
    }
    /**
     * Actualiza visualmente el stock mostrado en el panel, consultando el nuevo valor desde el expendedor.
     * @param deposito nombre del depósito o tipo de producto consultado.
     */
    public void setStock (String deposito){
        stock.setText(exp.getStock(deposito));
    }
}