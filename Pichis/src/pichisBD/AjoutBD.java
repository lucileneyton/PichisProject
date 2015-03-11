/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pichisBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import pichisNF.Services;

/**
 *
 * @author Lucile
 */
public class AjoutBD {
    
    public static void ajoutMedecin(String id, String nom, String prenom, String motDePasse, Services specialite){
        ConnectionBD bd = new ConnectionBD(); // à enlever quand interface ready !
       
        Statement ins;
        Statement verif;
        ResultSet res;
        
        try {
            ins = bd.connexion.createStatement();
            verif = bd.connexion.createStatement();
            
            res = verif.executeQuery("SELECT nom, prenom FROM personnel WHERE nom='"+nom+"' AND prenom='"+prenom+"'");
            if (res.getRow()!=0){
                System.out.println("Le personnel existe déjà dans la base");
            }
            
            
            else{
                ins.executeUpdate("INSERT INTO personnel(id, nom, prenom,mdp, service)" + "VALUES ('" + id + "','" + nom + "','" + prenom + "','" + motDePasse + "','" + specialite + "')");
            }

        } catch (SQLException ex) {
            System.out.println("Erreur lors de la création du medecin" + ex);
        } 
    }
    
    
    
}
