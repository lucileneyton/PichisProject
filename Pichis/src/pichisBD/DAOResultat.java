/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import pichisNF.DateSimple;
import pichisNF.Medecin;
import pichisNF.Resultat;

/**
 *
 * @author Lucile
 */
public class DAOResultat {

    ConnectionBD c;
    DateSimple date;
    String descriptions;
    Medecin medecin;
    Resultat res;
    String numPrestation;
    DAOMedecin daom = new DAOMedecin();

    public void ajoutResultat(String date, String description, String medecin, String prestation, String id) {
        Statement ins;
        c = new ConnectionBD();

        try {
            ins = c.connexion.createStatement();
            ins.executeUpdate("INSERT INTO resultat(date, description, medecin,prestation, id)" + "VALUES ('" + date + "','" + description + "','" + medecin + "','" + prestation + "','" + id + "')");

        } catch (SQLException ex) {
            System.out.println("Erreur lors de la création du résultat" + ex);
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

    public Resultat resultatPrestation(String idPrestation) {
        c = new ConnectionBD();
        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();

            resul = ins.executeQuery("SELECT * FROM resultat WHERE resultat.id='" + idPrestation + "'");

            while (resul.next()) {

                if (resul.getRow() != 0) {
                    String d = resul.getString("date");
                    if (d.equalsIgnoreCase("null")==false){
                    if(d.length() <= 11){
                        date = new DateSimple(d.substring(0, 2), d.substring(3, 5), d.substring(6, 10));
                    }
                    else{
                        date = new DateSimple(d.substring(0, 2), d.substring(3, 5), d.substring(6, 10), d.substring(13, 15), d.substring(16, 18));
                    }   
                }
                    descriptions = resul.getString("description");
                    String id = resul.getString("medecin");
                    medecin = daom.medecinParID(id);

                    res = new Resultat(date, descriptions, medecin);

                } else {
                    System.out.println("Il n'y a pas de résultat associé à la prestation");
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

        return res;
    }

    public int getNombreResultatTotal() {
        int nbResultat = 0;
        c = new ConnectionBD();

        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();

            resul = ins.executeQuery("SELECT COUNT(*) FROM resultat;");

            if (resul.next()) {
                nbResultat = resul.getInt("COUNT(*)");
            }

        } catch (SQLException e) {
            System.out.println("erreur DAOSejour (getNombreResultatTotal): " + e);
        } finally {
            if (c != null) {
                try {
                    c.connexion.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }

        }

        return nbResultat;
    }
}
