/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisNF;

import java.util.ArrayList;

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
            if(liste.get(i).toString() == nomElement){
                listeFin.add(liste.get(i));
            }
        }
        return listeFin;
    }
}
