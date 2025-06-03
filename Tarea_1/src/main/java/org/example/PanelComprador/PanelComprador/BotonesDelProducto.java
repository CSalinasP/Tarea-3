package org.example.PanelComprador.PanelComprador;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
public class BotonesDelProducto extends JPanel
{
    public BotonesDelProducto()
    {
        this.setLayout(new GridLayout(3, 2));
        this.setSize(640, 480);

    for (int i = 1; i <= 6; i++) {
    JButton boton = new JButton(String.valueOf(i));
    boton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        String mensaje = "El botón presionado es: " + e.getActionCommand();
    }
});
        this.add(boton);
    }
}
private void Acccion(String accion){
        switch (accion) {
            case "1":
                JOptionPane.showMessageDialog(null,"t" );
                break;
            case "2":
                JOptionPane.showMessageDialog(null,"boton");
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "Boton 3 presionado");
                break;
            case "4":
                JOptionPane.showMessageDialog(null, "Boton 4 presionado");
                break;
            case "5":
                JOptionPane.showInputDialog(null);

        }
}
}
