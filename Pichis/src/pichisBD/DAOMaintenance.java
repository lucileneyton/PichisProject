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
import java.util.logging.Level;
import java.util.logging.Logger;
import pichisNF.Maintenance;

/**
 * Data access object pour la classe Maintenance
 *
 */
public class DAOMaintenance {

    public ConnectionBD c;

    /**
     * Méthode permettant de déterminer si un personnel est un personnel de
     * maintenance
     *
     * @param id l'identifiant du personnel
     * @param mdp le mot de passe du personnel
     * @return boolean
     */
    public boolean estMaintenance(String id, String mdp) {
        ResultSet res;
        c = new ConnectionBD();
        boolean b = false;

        try {

            Statement ins = c.connexion.createStatement();
            res = ins.executeQuery("SELECT * FROM personnel WHERE (maintenance='true' ) AND (service='NULL' OR service IS NULL) AND id='" + id + "'");

            while (res.next()) {
                if (res.getRow() != 0) {
                    b = true;

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOMedecin.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (c != null) {
                try {
                    c.connexion.close();
                } catch (SQLException e) {
                    System.out.println("Erreur DAOMedecin (estMedecin): "+e);
                }
            }

        }

        return b;
    }

    /**
     * Méthode permettant l'identification d'un personnel de maintenance
     *
     * @param id l'identifiant entré dans le champ identifiant
     * @param motDePasse le mot de passe entré dans le champ mot de passe
     * @return boolean
     */
    public boolean identification(String id, String motDePasse) {

        String identif;
        String mdp;
        boolean b = false;
        ResultSet resul;
        Statement ins;
        c = new ConnectionBD();

        try {

            ins = c.connexion.createStatement();
            resul = ins.executeQuery("SELECT * FROM personnel WHERE id='" + id + "'");

            while (resul.next()) {

                identif = resul.getString("id");
                mdp = resul.getString("mdp");

                if (mdp.equals(motDePasse)) {
                    b = true;
                } else {
                    b = false;
                }
            }
            return b;
        } catch (SQLException e) {
            System.out.println("erreur DAOMedecin(identification) : " + e);
            return false;
        } finally {
            if (c != null) {
                try {
                    c.connexion.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }

        }

    }

    /**
     * Méthode permettant de consulter la liste du personnel de maintenance
     *
     * @return ArrayList
     */
    public ArrayList<Maintenance> consulterListeMaintenance() {

        ArrayList<Maintenance> listeMaintenance = new ArrayList();
        c = new ConnectionBD();

        try {

            ResultSet resul;
            Statement ins = c.connexion.createStatement();
            resul = ins.executeQuery("SELECT * FROM personnel WHERE service ='NULL' AND maintenance = 'true'");
            while (resul.next()) {

                String id = resul.getString("id");
                String nom = resul.getString("nom");
                String prenom = resul.getString("prenom");
                String mdp = resul.getString("mdp");
                listeMaintenance.add(new Maintenance(id, nom, prenom, mdp));

            }
        } catch (SQLException e) {
            System.out.println("erreur DAOMaintenance(consulterListeMaintenance): " + e);
        } finally {
            if (c != null) {
                try {
                    c.connexion.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }

        }

        return listeMaintenance;
    }

    /**
     * Méthode permettant de récupérer une instance de personnel de maintenance
     *
     * @param id l'identifiant du personnel
     * @return Maintenance
     */
    public Maintenance MaintenanceParID(String id) {

        Maintenance maintenance = null;
        c = new ConnectionBD();

        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();
            resul = ins.executeQuery("SELECT * FROM personnel WHERE id='" + id + "' ;");

            if (resul.getRow() != 0) {

                maintenance = null;

            } else {

                while (resul.next()) {

                    String nom = resul.getString("nom");
                    String prenom = resul.getString("prenom");
                    String mdp = resul.getString("mdp");
                    maintenance = new Maintenance(id, nom, prenom, mdp);

                }
            }
        } catch (SQLException e) {
            System.out.println("erreur DAOMaintenance(MaintenanceParID): " + e);
        } finally {
            if (c != null) {
                try {
                    c.connexion.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }

        }

        return maintenance;
    }

    /**
     * Méthode permettant d'ajouter un personnel de maintenance dans la base de
     * données
     *
     * @param id l'identifiant du nouveau personnel
     * @param nom le nom du nouveau personnel
     * @param prenom le prénom du nouveau personnel
     * @param motDePasse le mot de passe du nouveau personnel
     */
    public void ajoutMaintenance(String id, String nom, String prenom, String motDePasse) {

        Statement ins;
        c = new ConnectionBD();

        try {
            ins = c.connexion.createStatement();
            ins.executeUpdate("INSERT INTO personnel(id, nom, prenom,mdp, service,maintenance)" + "VALUES ('" + id + "','" + nom + "','" + prenom + "','" + motDePasse + "','" + "NULL" + "','" + "true" + "')");

        } catch (SQLException ex) {
            System.out.println("Erreur lors de la création du personnel de maintenance" + ex);
        } finally {
            if (c != null) {
                try {
                    c.connexion.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }

        }
    }

}
