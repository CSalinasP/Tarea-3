package org.example.Visual;

import javax.swing.ImageIcon;
import java.net.URL;

public class ImageLoader {
    public static ImageIcon loadImage(String path) {
        URL imageUrl = ImageLoader.class.getResource(path);
        if (imageUrl != null) {
            return new ImageIcon(imageUrl);
        } else {
            System.err.println("No se pudo encontrar la imagen: " + path);
            return null;
        }
    }
}
