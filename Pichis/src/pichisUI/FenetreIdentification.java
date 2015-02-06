/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisUI;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

/**
 *
 * @author Matilas
 */
public class FenetreIdentification extends JPanel{
    
     public void paintComponent(Graphics g) {


        java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();



            Image img = toolkit.getImage("src/data/Images/Princeton_Plainsboro_Wallpaper_by_Pencilshade.png");

            g.drawImage(img, 0, 0, this);
       



    }
    
}
