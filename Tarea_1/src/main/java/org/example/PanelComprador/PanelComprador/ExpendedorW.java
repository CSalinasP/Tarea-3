package org.example.PanelComprador.PanelComprador;

import javax.swing.*;
import java.awt.*;

public class ExpendedorW extends JPanel {

    String InformacionA;
    String InformacionB;
    String InformacionC;

    int intInformacionA;
    int intInformacionB;
    int intInformacionC;

    JLabel InformacionALabel;
    JLabel InformacionBLabel;
    JLabel InformacionCLabel;

    public ExpendedorW() {
        this.setPreferredSize(new Dimension(150, 400));
        this.setBackground(Color.gray);
        this.setLayout(new GridLayout(3, 1));

        intInformacionA = 0;
        intInformacionB = 0;
        intInformacionC = 0;
        InformacionA = "Info 1: " + intInformacionA;
        InformacionB = "Info 2: " + intInformacionB;
        InformacionC = "Info 3: " + intInformacionC;
        InformacionALabel = new JLabel(InformacionA);
        InformacionBLabel = new JLabel(InformacionB);
        InformacionCLabel = new JLabel(InformacionC);
        InformacionALabel.setFont(new Font("Arial", Font.BOLD, 15));
        InformacionBLabel.setFont(new Font("Arial", Font.BOLD, 15));
        InformacionCLabel.setFont(new Font("Arial", Font.BOLD, 15));
        this.add(InformacionALabel);
        this.add(InformacionBLabel);
        this.add(InformacionCLabel);
    }

}