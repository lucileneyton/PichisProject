/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pichisBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
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

 
    ConnectionBD c ;

   
     public DMA consulterListeSejourParPatient(DPI patient) {
        
        String num;
        DateSimple dateE;
        DateSimple dateS;
        Medecin resp;
        Localisation loc;
        DMA dma = new DMA();
        c = new ConnectionBD();
        
        DAOMedecin daom = new DAOMedecin();
        DAOLocalisation daol = new DAOLocalisation();
            
       
        try {

            ResultSet resul;
          
            Statement ins = c.connexion.createStatement();
            
            resul = ins.executeQuery("SELECT * FROM sejour WHERE sejour.ipp= "+patient.getIpp()+";");
            
            while (resul.next()) {

                num = resul.getString("id");
                String de = resul.getString("dateentree");
                String ds = resul.getString("datesortie");
                dateE = new DateSimple(de.substring(0, 2), de.substring(3, 5), de.substring(6, 10));
                
                             
                resp = daom.medecinResponsable(num); 
                loc = daol.localisationParNumeroDeSejour(num);
                
                Sejour s = null;

                if(ds == null || ds.equalsIgnoreCase("null") ==true){
                    s = new Sejour(dma,num,dateE,resp,loc);                  
                }
            
                else{
                    dateS = new DateSimple(ds.substring(0, 2),ds.substring(3, 5),ds.substring(6, 10));
                    s = new Sejour(dma,num,dateE,dateS,resp,loc);
                }
                
                dma.ajouterSejour(s);
                
              
            }
       
            
        } catch (SQLException e) {
            System.out.println("erreur DAOSejour (consulterListeSejourParPatient): " + e);
        }
        finally{
            if(c!=null){
                try{
                   c.connexion.close();
                }
                catch(SQLException e){
                    System.out.println(e);
                }
            }
                   
        }
        
        return dma;
     }
     
     public boolean setLettre(String idSejour){
        c=new ConnectionBD();
        boolean b = false;
      
        try {

            if(!lettreDeSortie(idSejour)){
                int resul;

            Statement ins = c.connexion.createStatement();
            resul = ins.executeUpdate("UPDATE sejour SET lettre='true' WHERE id=" + "'"  + idSejour + "' ;");
            b=true;
            }
            
            else{
                b=false;
            }
              
            

        } catch (SQLException e) {
            System.out.println("erreur DAOSejour (setLettre): " + e);
        }
        finally{
            if(c!=null){
                try{
                   c.connexion.close();
                }
                catch(SQLException e){
                    System.out.println(e);
                }
            }
                   
        }
        return b;
    }
     
    public void ajout(Sejour sejour, DPI dpi){
        Statement ins;
        Statement verif;
        ResultSet res;
        DAOServices daoServices = new DAOServices();
        c = new ConnectionBD();
        
        try {
            ins = c.connexion.createStatement();
            verif = c.connexion.createStatement();
            
            res = verif.executeQuery("SELECT id FROM sejour WHERE id='"+sejour.getNumeroSejour()+"'");
            if (res.getRow()!=0){
                System.out.println("Le sejour existe déjà dans la base");
            }
            
            
            else{
                String idService = daoServices.idParService(sejour.getLocalisation().getService());
                ins.executeUpdate("INSERT INTO sejour(ipp, id, dateentree, responsable, loc, datesortie, numerochambre, placement,lettre)" + "VALUES ('" + dpi.getIpp() + "','" + sejour.getNumeroSejour() + "','" + sejour.getDateEntree().toString() + "','" + sejour.getPHResponsable().getId() + "','" + idService + "','" + sejour.getDateSortie() + "','" + sejour.getLocalisation().getNumeroChambre() + "','" + sejour.getLocalisation().getPlacement()+"','"+"false"+ "')"); 
                //ins.executeUpdate("INSERT INTO sejour(ipp, id, dateentree, responsable, loc, datesortie, numerochambre, placement)" + "VALUES ('" + dpi.getIpp() + "','" + sejour.getNumeroSejour() + "','" + sejour.getDateEntree().toString() + "','" + sejour.getPHResponsable().getId() + "','" + sejour.getLocalisation().toString() + "','" + sejour.getDateSortie() + "','" + sejour.getLocalisation().getNumeroChambre() + "','" + sejour.getLocalisation().getPlacement()+ "')");         
            }

        } catch (SQLException ex) {
            System.out.println("Erreur DAOSejour (ajout)" + ex);
        } 
        finally{
            if(c!=null){
                try{
                   c.connexion.close();
                }
                catch(SQLException e){
                    System.out.println(e);
                }
            }
                   
        }
    }
    
    public boolean lettreDeSortie(String idSejour){
        c = new ConnectionBD();
        boolean b = false;
        
        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();

            resul = ins.executeQuery("SELECT * FROM sejour WHERE id='" + idSejour + "'");

            while (resul.next()) {

               
                    String lettre = resul.getString("lettre");

                    if(lettre.equals("true")){
                        b= true;
                    }
                
            }

        } catch (SQLException e) {
            System.out.println("erreur DAOResultat: " + e);
        } finally {
            if (c != null) {
                try {
                    c.connexion.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }

        }

        return b;
    }
    
    public String getNombreSejoursTotal(){
        String nbSejours="";
        c = new ConnectionBD();
        
        try {

            ResultSet resul;
          
            Statement ins = c.connexion.createStatement();
            
            resul = ins.executeQuery("SELECT COUNT(*) FROM sejour;");
            
            if (resul.next()){                       
                nbSejours = resul.getString("COUNT(*)");
            }           
            
        } catch (SQLException e) {
            System.out.println("erreur DAOSejour (getNombreSejoursTotal): " + e);
        }
        finally{
            if(c!=null){
                try{
                   c.connexion.close();
                }
                catch(SQLException e){
                    System.out.println(e);
                }
            }
                   
        }
        
        return nbSejours;
    }
   
    public void ajoutDateSortie(String idSejour){
        c=new ConnectionBD();
        
        int jourTemp = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int moisTemp = Calendar.getInstance().get((Calendar.getInstance().get(Calendar.MONTH))) + 1;
        int anneeTemp = Calendar.getInstance().get(Calendar.YEAR);
        
        String jour = Integer.toString(jourTemp);
        String mois = Integer.toString(moisTemp);
        String annee = Integer.toString(anneeTemp);
        
        DateSimple dateSortie = new DateSimple(jour, mois, annee);
        
        try {
            int resul;

            Statement ins = c.connexion.createStatement();
            resul = ins.executeUpdate("UPDATE sejour SET datesortie=" + "'" + dateSortie + "'" + " WHERE id=" + "'"  + idSejour + "' ;");

        } catch (SQLException e) {
            System.out.println("erreur DAOSejour (ajoutDateSortie): " + e);
        }
        finally{
            if(c!=null){
                try{
                   c.connexion.close();
                }
                catch(SQLException e){
                    System.out.println(e);
                }
            }
                   
        }
    }

}




