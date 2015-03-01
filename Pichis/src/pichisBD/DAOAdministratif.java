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
import pichisNF.Administratif;

/**
 *
 * @author Lucile
 */
public class DAOAdministratif {

    ConnectionBD c = new ConnectionBD();

    public ArrayList<Administratif> consulterListeAdministratif() {

        ArrayList<Administratif> listeAdministratif = new ArrayList();

        try {

            ResultSet resul;
            Statement ins = c.connexion.createStatement();
            resul = ins.executeQuery("SELECT * FROM personnel WHERE service='NULL'");
            while (resul.next()) {

                String id = resul.getString("id");
                String nom = resul.getString("nom");
                String prenom = resul.getString("prenom");
                String mdp = resul.getString("mdp");
                listeAdministratif.add(new Administratif(id, nom, prenom, mdp));

            }
        } catch (SQLException e) {
            System.out.println("erreur DAOAdministratif: " + e);
        }

        return listeAdministratif;
    }

    public Administratif administratifParID(String id) {

        Administratif admin = null;

        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();
            resul = ins.executeQuery("SELECT * FROM personnel WHERE id= " + id);

            if (resul.getRow() == 0) {

                admin = null;
                
            } else {

                while (resul.next()) {

                    String nom = resul.getString("nom");
                    String prenom = resul.getString("prenom");
                    String mdp = resul.getString("mdp");
                    admin = new Administratif(id, nom, prenom, mdp);

                }
            }
        } catch (SQLException e) {
            System.out.println("erreur DAOAdministratif: " + e);
        }

        return admin;
    }

    public void ajoutAdministratif(String id, String nom, String prenom, String motDePasse) {

        Statement ins;

        try {
            ins = c.connexion.createStatement();
            ins.executeUpdate("INSERT INTO personnel(id, nom, prenom,mdp, service)" + "VALUES ('" + id + "','" + nom + "','" + prenom + "','" + motDePasse + "','" + "NULL" + "')");

        } catch (SQLException ex) {
            System.out.println("Erreur lors de la création de l'administratif" + ex);
        }
    }

}
