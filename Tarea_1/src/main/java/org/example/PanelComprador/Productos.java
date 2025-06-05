package org.example.PanelComprador;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Productos extends JPanel {

    private JLabel imagenLabel;
    private ImageIcon iconoImagen;
    private Image imagen;

    public Productos() {
        // Ayuda a los Layout Managers a calcular el tamaño inicial
        setPreferredSize(new Dimension(50, 50)); // 50x50 píxeles
        setOpaque(false);
        setLayout(new BorderLayout()); // Agregar layout para centrar
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja el fondo verde
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, getWidth(), getHeight()); // Rellena todo el componente

        // Dibuja un borde negro completo
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, getWidth()-1, getHeight()-1);
    }
    public void addImagen(String nombreImagen) {
        try {
            // CORRECCIÓN: Usar getResource() para cargar desde resources
            URL imagenURL = getClass().getResource("/" + nombreImagen + ".png");
            
            if (imagenURL != null) {
                iconoImagen = new ImageIcon(imagenURL);
                imagen = iconoImagen.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                imagenLabel = new JLabel(new ImageIcon(imagen));
                imagenLabel.setHorizontalAlignment(SwingConstants.CENTER);
                
                // Limpiar panel antes de agregar nueva imagen
                this.removeAll();
                this.add(imagenLabel, BorderLayout.CENTER);
                this.revalidate();
                this.repaint();
                
                System.out.println("✅ Imagen " + nombreImagen + ".png cargada correctamente");
            } else {
                System.err.println("❌ No se encontró la imagen: " + nombreImagen + ".png");
                mostrarTextoAlternativo(nombreImagen);
            }
        } catch (Exception e) {
            System.err.println("❌ Error cargando imagen " + nombreImagen + ": " + e.getMessage());
            mostrarTextoAlternativo(nombreImagen);
        }
    }

    private void mostrarTextoAlternativo(String nombreImagen) {
        // Mostrar texto alternativo si no se carga la imagen
        imagenLabel = new JLabel(nombreImagen, SwingConstants.CENTER);
        imagenLabel.setFont(new Font("Arial", Font.BOLD, 8));
        imagenLabel.setForeground(Color.BLACK);
        
        this.removeAll();
        this.add(imagenLabel, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }

    public void borrarImagen() {
        // CORRECCIÓN: Remover correctamente del panel padre
        if (imagenLabel != null) {
            this.remove(imagenLabel);
            imagenLabel = null;
            this.revalidate();
            this.repaint();
        }
    }
}