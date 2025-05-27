package org.example.Visual;
import javax.swing.JFrame; // Importa la clase JFrame
import javax.swing.JLabel; // Importa la clase JLabel (para una etiqueta simple)
import java.awt.FlowLayout; // Importa el layout manager FlowLayout

public class MiPrimerFrame extends JFrame { // La clase extiende JFrame

    public MiPrimerFrame() {
        this.setTitle("Ventana Swing");

        this.setSize(400, 300); // Ancho: 400 píxeles, Alto: 300 píxeles

        // 3. Configurar el comportamiento al cerrar la ventana
        // JFrame.EXIT_ON_CLOSE asegura que la aplicación se cierre completamente
        // cuando el usuario hace clic en el botón de cerrar (la 'X').
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 4. Centrar la ventana en la pantalla (opcional pero común)
        this.setLocationRelativeTo(null);

        // 5. Configurar un layout manager (opcional, pero buena práctica)
        // FlowLayout organiza los componentes en una fila.
        this.setLayout(new FlowLayout());

        // 6. Añadir un componente simple al frame (ejemplo: una etiqueta)
        JLabel etiqueta = new JLabel("¡Hola desde mi frame de Java!");
        this.add(etiqueta); // Añade la etiqueta al frame

        // 7. Hacer visible el frame (¡siempre al final!)
        // La ventana no se mostrará hasta que se establezca como visible.
        this.setVisible(true);
    }

    public static void main(String[] args) {
        // Es una buena práctica crear y mostrar componentes Swing en el Event Dispatch Thread (EDT)
        // para garantizar la seguridad de los hilos.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MiPrimerFrame(); // Crea una instancia de tu frame
            }
        });
    }
}

