/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisNF;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author molit_000
 */
public class Medecin extends Personnel {

    private Services specialite;

    public Medecin(String id, String nom, String prenom, String motDePasse, Services specialite) {
        super(id, nom, prenom, motDePasse);
        this.specialite = specialite;

        bd = new ConnectionBD();

        Statement ins;
        try {
            ins = bd.connexion.createStatement();
            ins.executeUpdate("INSERT INTO personnel(id, nom, prenom,mdp, service)" + "VALUES ('" + id + "','" + nom + "','" + prenom + "','" + motDePasse + "','" + specialite + "')");

        } catch (SQLException ex) {
            System.out.println("Erreur lors de la création du medecin" + ex);
        } finally {
            try {
                
                bd.connexion.close(); // Fermeture de la connexion avec la BD
                
            } catch (SQLException e) {

            }
        }
    }


public Services getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Services specialite) {
        this.specialite = specialite;
    }
    
    public String toString(){
        return super.getNom() + " " + super.getPrenom() + " ";
    }
    
}

