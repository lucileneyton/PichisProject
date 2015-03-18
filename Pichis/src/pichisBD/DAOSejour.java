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

   
     public DMA consulterListeSejourParPatient(DPI patient) {
        
        String num;
        DateSimple dateE;
        DateSimple dateS;
        Medecin resp;
        Localisation loc;
<<<<<<< HEAD
        DMA dma= new DMA();
=======
        DMA dma = new DMA();
>>>>>>> origin/master
        
        DAOMedecin daom = new DAOMedecin();
        DAOLocalisation daol = new DAOLocalisation();
            
       
        try {

            ResultSet resul;
          
            Statement ins = c.connexion.createStatement();
            
            resul = ins.executeQuery("SELECT * FROM sejour WHERE sejour.ipp= "+patient.getIpp()+";");
            
            while (resul.next()) {

                num = resul.getString("id");
                String de = resul.getString("dateentree");
                String ds = resul.getString("datasortie");
                dateE = new DateSimple(de.substring(0, 1),de.substring(2, 3),de.substring(4, 7));
                
                             
                resp = daom.medecinResponsable(num); 
                loc = daol.localisationParNumeroDeSejour(num);
                
                Sejour s;
                //if(ds.equalsIgnoreCase("null") != true){
               //     dateS = new DateSimple(ds.substring(0, 1),ds.substring(2, 3),ds.substring(4, 7));
                //    s = new Sejour(dma,dateE,dateS,resp,loc);
               // }
               // else{
                    s = new Sejour(dma, num, dateE,resp,loc);
                //}
                
                
                dma.ajouterSejour(s);
                
              
            }
       
            
        } catch (SQLException e) {
            System.out.println("erreur DAOSejour: " + e);
        }
        
        
        return dma;
    }
     
    public void ajout(Sejour sejour, DPI dpi){
        Statement ins;
        Statement verif;
        ResultSet res;
        
        try {
            ins = c.connexion.createStatement();
            verif = c.connexion.createStatement();
            
            res = verif.executeQuery("SELECT id FROM sejour WHERE id='"+sejour.getNumeroSejour()+"'");
            if (res.getRow()!=0){
                System.out.println("Le sejour existe déjà dans la base");
            }
            
            
            else{
                ins.executeUpdate("INSERT INTO sejour(ipp, id, dateentree, responsable, loc, datesortie, numerochambre)" + "VALUES ('" + dpi.getIpp() + "','" + sejour.getNumeroSejour() + "','" + sejour.getDateEntree().toString() + "','" + sejour.getPHResponsable().getId() + "','" + sejour.getLocalisation().toString() + "','" + sejour.getDateSortie() + "','" + sejour.getLocalisation().getNumeroChambre()+ "')");         
            }

        } catch (SQLException ex) {
            System.out.println("Erreur lors de la création du sejour" + ex);
        } 
    }

}




