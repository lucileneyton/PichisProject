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
public class BoutonRechercher extends JPanel {

  

    public void paintComponent(Graphics g) {


        java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();



            Image img = toolkit.getImage("src/data/Images/iconmonstr-magnifier-5-icon-48.png");

            g.drawImage(img, 0, 0, this);
       



    }
}