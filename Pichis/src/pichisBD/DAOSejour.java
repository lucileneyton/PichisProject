/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pichisBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import pichisNF.DMA;
import pichisNF.DPI;
import pichisNF.DateSimple;
import pichisNF.Localisation;
import pichisNF.Medecin;
import pichisNF.Sejour;

/**
 *
 * @author Lucile
 */
public class DAOSejour {

 
    ConnectionBD c = new ConnectionBD();

   
     public DMA consulterListeSejourParPatient(String id) {

        
        String num;
        DateSimple dateE;
        DateSimple dateS;
        Medecin resp;
        Localisation loc;
        DMA dma= new DMA();
        
        DAOMedecin daom = new DAOMedecin();
        DAOLocalisation daol = new DAOLocalisation();
            
       
        try {

            ResultSet resul;
          
            Statement ins = c.connexion.createStatement();
            
            resul = ins.executeQuery("SELECT * FROM sejour WHERE sejour.ipp= "+id+";");
            
            while (resul.next()) {

                num = resul.getString("id");
                String de = resul.getString("dateentree");
                String ds = resul.getString("datasortie");
                dateE = new DateSimple(de.substring(0, 1),de.substring(2, 3),de.substring(4, 7));
                dateS = new DateSimple(ds.substring(0, 1),ds.substring(2, 3),ds.substring(4, 7));
                
                resp = daom.medecinResponsable(num); 
                loc = daol.localisationParNumeroDeSejour(num);
                
                
                Sejour s = new Sejour(dma,dateE,dateS,resp,loc);
                
                dma.ajouterSejour(s);
                
              
            }
       
            
        } catch (SQLException e) {
            System.out.println("erreur DAOSejour: " + e);
        }
        
        
        return dma;
    }
     
    

}




