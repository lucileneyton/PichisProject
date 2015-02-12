package pichisNF;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author molit_000
 */
public class Administratif extends Personnel{
    
    ConnectionBD bd = new ConnectionBD();
    
    public Administratif(String id, String nom, String prenom, String motDePasse){
        super(id, nom, prenom, motDePasse);
        
        Statement ins;
        try {
            ins = bd.connexion.createStatement();
            ins.executeUpdate("INSERT INTO personnel(id, nom, prenom,mdp, service)" + "VALUES ('"+id+"','"+nom+"','"+prenom+"','"+motDePasse+"','"+"NULL"+"')");
            
        } catch (SQLException ex) {
            System.out.println("Erreur lors de la création du patient"+ex);
        }
        
       


       
    }
    
    
}
