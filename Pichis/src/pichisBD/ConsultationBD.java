/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pichisBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        
        Statement ins = Identification.bd.connexion.createStatement();
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
    
    public static boolean typePersonnel(){
        
        ResultSet typ;
        Statement ins;
        boolean b = false;
        
        try {
            ins = Identification.bd.connexion.createStatement();
            typ = ins.executeQuery("SELECT service FROM personnel WHERE service='NULL'");
            
            if (typ.getRow()==0){
            b= false;
        }
            
            else{
                b= true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultationBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return b;
        
    }
}
