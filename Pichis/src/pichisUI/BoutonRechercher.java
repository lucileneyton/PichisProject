package pichisUI;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

public class BoutonRechercher extends JPanel {

    /**
     * Méthode permettant le chargement de l'image du bouton "rechercher"
     *
     * @param g
     */
    public void paintComponent(Graphics g) {

        java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();

        Image img = toolkit.getImage("src/data/Images/iconmonstr-magnifier-5-icon-48.png");

        g.drawImage(img, 0, 0, this);

    }
}
