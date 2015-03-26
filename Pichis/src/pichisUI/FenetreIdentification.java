package pichisUI;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

public class FenetreIdentification extends JPanel {

    /**
     * Méthode permettant le chargement de l'image de Princeton Plainsboro sur
     * l'écran d'identification
     *
     * @param g
     */
    public void paintComponent(Graphics g) {

        java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();

        Image img = toolkit.getImage("src/data/Images/Princeton_Plainsboro_Wallpaper_by_Pencilshade.png");

        g.drawImage(img, 0, 0, this);

    }
}
