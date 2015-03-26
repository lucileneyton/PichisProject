/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisNF;

import java.util.ArrayList;
import java.util.Calendar;
import pichisBD.DAOResultat;
import pichisBD.DAOSejour;

/**
 *
 * @author molit_000
 */
public class fonctions {
    
    public static boolean isNumeric(String str)  
    {  
      try  
      {  
        double d = Double.parseDouble(str);  
      }  
      catch(NumberFormatException nfe)  
      {  
        return false;  
      }  
      return true;  
    }
    
    public static ArrayList<Object> recherche(ArrayList<Object> liste, String nomElement){
        ArrayList<Object> listeFin = new ArrayList<Object>();
        
        for(int i=0; i<liste.size();i++){
            
            if (nomElement.length()<= liste.get(i).toString().length()){
          
           
            if(liste.get(i).toString().substring(0, nomElement.length()).toLowerCase().equals(nomElement.toLowerCase())){
                
                listeFin.add(liste.get(i));
            }
            }
            else{
                if(liste.get(i).toString().toLowerCase().equals(nomElement.substring(0, liste.get(i).toString().length()).toLowerCase())){
                
                listeFin.add(liste.get(i));
            }
            }
        }
        return listeFin;
    }
    
     public static String genererNumeroSejour(DateSimple dateEntree){
        String numSejour = "";
        DAOSejour daoSejour= new DAOSejour();
        
        String nbSejours = daoSejour.getNombreSejoursTotal();
        numSejour = dateEntree.get2derniersChiffresAnnee() + dateEntree.getMois() + nbSejours;
        return numSejour;
    }
     
     public static String genererIdResultat(){
        int idResultat = 0;
        DAOResultat daoResultat= new DAOResultat();
        
        int nbResultat = daoResultat.getNombreResultatTotal();
        idResultat = nbResultat + 100;
        String s = Integer.toString(idResultat);
        return s;
    }
     
     public static DateSimple renvoieDateActuelle(){
        Calendar ca = Calendar.getInstance();
                        String minute = "" + ca.getTime().getMinutes();
                        String heure = "" + ca.getTime().getHours();
                        int rangDuMois = ca.getTime().getMonth() + 1;
                        String mois = "" + rangDuMois;
                        String jour = "" + ca.getTime().getDate();

                        int anne = 1900 + ca.getTime().getYear();
                        String annee = "" + anne;
                        if (ca.getTime().getDate() < 10) {
                            jour = "0" + ca.getTime().getDate();
                        }
                        if (ca.getTime().getMinutes() < 10) {
                            minute = "0" + ca.getTime().getMinutes();
                        }
                        if (ca.getTime().getHours() < 10) {
                            heure = "0" + ca.getTime().getHours();
                        }
                        if (ca.getTime().getMonth() < 10) {
                            mois = "0" + rangDuMois;
                        }
                        
                        DateSimple date = new DateSimple(jour, mois, annee, heure, minute);
                        
                        return date;
    }
}
