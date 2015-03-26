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
import pichisNF.DPI;
import pichisNF.DateSimple;
import pichisNF.Medecin;
import pichisNF.Prestations;
import pichisNF.Resultat;

/**
 *
 * @author Lucile
 */
public class DAOPrestations {

    ConnectionBD c;

    String naturePrestation;
    Medecin demandeur;
    DPI patient;
    Resultat resultat;
    DateSimple date;
    Prestations p;
    String idPrestation;
    DAOMedecin daom = new DAOMedecin();
    DAODPI daod = new DAODPI();
    DAOResultat daor = new DAOResultat();

    /**
     * Permet d'ajouter un patient dans la base de données
     * @param naturePrestation la nature de la prestation
     * @param demandeur l'id du médecin demandeur
     * @param patient l'ipp du patient
     * @param resultat l'id du résultat associé si il existe
     * @param date la date de la prestation
     * @param id l'id de la prestation
     */
    public void ajoutPrestation(String naturePrestation, String demandeur, String patient, String resultat, String date, String id) {
        Statement ins;
        c = new ConnectionBD();

        try {
            ins = c.connexion.createStatement();
            ins.executeUpdate("INSERT INTO prestations(id, demandeur, patient,resultat, date,nature)" + "VALUES ('" + id + "','" + demandeur + "','" + patient + "','" + resultat + "','" + date + "','" + naturePrestation + "')");

        } catch (SQLException ex) {
            System.out.println("Erreur lors de la création de la prestation" + ex);
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

    public void setResultat(String idPrestation2, String idResultat) {
        Statement ins;
        c = new ConnectionBD();

        try {
            ins = c.connexion.createStatement();
            ins.executeUpdate("UPDATE prestations SET resultat=" + "'" + idResultat + "'" + " WHERE id=" + "'" + idPrestation2 + "' ;");

        } catch (SQLException ex) {
            System.out.println("Erreur lors de la modification du résultat de la prestation" + ex);
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

    public ArrayList<Prestations> prestationsPatient(String idPatient) {
        ArrayList<Prestations> l = new ArrayList<Prestations>();
        c = new ConnectionBD();
        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();

            resul = ins.executeQuery("SELECT * FROM prestations WHERE patient=" + idPatient);

            while (resul.next()) {

                naturePrestation = resul.getString("nature");
                String idMedecin = resul.getString("demandeur");
                demandeur = daom.medecinParID(idMedecin);
                String idPatient2 = resul.getString("patient");
                patient = daod.dpiParIPP(idPatient2);
                String resultat2 = resul.getString("resultat");
                resultat = daor.resultatPrestation(resultat2);
                String d = resul.getString("date");
                if (d != null) {
                    if (d.length() <= 11) {
                        date = new DateSimple(d.substring(0, 2), d.substring(3, 5), d.substring(6, 10));
                    } else {
                        date = new DateSimple(d.substring(0, 2), d.substring(3, 5), d.substring(6, 10), d.substring(13, 15), d.substring(16, 18));
                    }
                }

                p = new Prestations(naturePrestation, demandeur, patient, resultat, date);
                l.add(p);
            }

        } catch (SQLException e) {
            System.out.println("erreur DAOPrestations: " + e);
        } finally {
            if (c != null) {
                try {
                    c.connexion.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }

        }

        return l;
    }

    public ArrayList<Prestations> consulterListePrestationsNonRealisee() {

        ArrayList<Prestations> listePrestations = new ArrayList();
        c = new ConnectionBD();

        try {

            ResultSet resul;
            Statement ins = c.connexion.createStatement();
            resul = ins.executeQuery("SELECT * FROM prestations WHERE resultat='NULL'");
            while (resul.next()) {

                String naturePrestation = resul.getString("nature");
                String idMedecin = resul.getString("demandeur");
                demandeur = daom.medecinParID(idMedecin);
                String idPatient2 = resul.getString("patient");
                patient = daod.dpiParIPP(idPatient2);
                String resultat2 = resul.getString("resultat");
                resultat = daor.resultatPrestation(resultat2);
                String d = resul.getString("date");

                if (d != null) {
                    if (d.length() <= 11) {
                        date = new DateSimple(d.substring(0, 2), d.substring(3, 5), d.substring(6, 10));
                    } else {
                        date = new DateSimple(d.substring(0, 2), d.substring(3, 5), d.substring(6, 10), d.substring(13, 15), d.substring(16, 18));
                    }
                }

                p = new Prestations(naturePrestation, demandeur, patient, resultat, date);
                listePrestations.add(p);
            }
        } catch (SQLException e) {
            System.out.println("erreur DAOPrestations: " + e);
        } finally {
            if (c != null) {
                try {
                    c.connexion.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }

        }

        return listePrestations;
    }

    public ArrayList<Prestations> consulterListePrestationsNonRealisee2() {

        ArrayList<Prestations> listePrestations = new ArrayList();
        c = new ConnectionBD();

        try {

            ResultSet resul;
            Statement ins = c.connexion.createStatement();
            resul = ins.executeQuery("SELECT * FROM prestations WHERE resultat='NULL'");
            while (resul.next()) {

                String naturePrestation = resul.getString("nature");
                String idMedecin = resul.getString("demandeur");
                demandeur = daom.medecinParID(idMedecin);
                String idPatient2 = resul.getString("patient");
                patient = daod.dpiParIPP(idPatient2);
                String resultat2 = resul.getString("resultat");
                resultat = daor.resultatPrestation(resultat2);
                String d = resul.getString("date");

                if (d != null) {
                    if (d.length() <= 11) {
                        date = new DateSimple(d.substring(0, 2), d.substring(3, 5), d.substring(6, 10));
                    } else {
                        date = new DateSimple(d.substring(0, 2), d.substring(3, 5), d.substring(6, 10), d.substring(13, 15), d.substring(16, 18));
                    }
                }
                String idPrestation = resul.getString("id");

                p = new Prestations(naturePrestation, demandeur, patient, resultat, date, idPrestation);
                listePrestations.add(p);
            }
        } catch (SQLException e) {
            System.out.println("erreur DAOPrestations: " + e);
        } finally {
            if (c != null) {
                try {
                    c.connexion.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }

        }

        return listePrestations;
    }

}
