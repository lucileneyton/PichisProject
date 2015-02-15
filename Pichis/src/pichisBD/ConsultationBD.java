/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pichisBD;

import java.sql.ResultSet;
import java.sql.Statement;
import pichisUI.*;

/**
 *
 * @author Lucile
 */
public class ConsultationBD {
    
    
    public static boolean identification(String id, String motDePasse){
        
      
        String identif;
        String mdp="null";
        
        
        
        try{
        
     
        ResultSet resul;
        
        Statement ins = PICHIS_Manager.bd.connexion.createStatement();
        resul = ins.executeQuery("SELECT * FROM personnel WHERE id= "+id);
        while (resul.next()) {

                identif = resul.getString("id");
                mdp = resul.getString("mdp");
                
            }
        }
        
        catch(Exception e){
            System.out.println("erreur : " + e);
        }
        
        if(mdp.equals(motDePasse)){
            return true;
        }
        
        else{
            return false;
        }
        
    }
}
