/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisUI;

/**
 *
 * @author Matilas
 */
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

/**
 *
 * @author Matilas
 */
public class FdEcran_Identification extends JPanel {

    public FdEcran_Identification() {
    }
    boolean etat = true;
    

    @Override
    public void paintComponent(Graphics g) {


        java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();


            Image img = toolkit.getImage("src/Images/Princeton_Plainsboro_Wallpaper_by_Pencilshade.png");

            g.drawImage(img, 0, 0, this);
    
    
    }
}
