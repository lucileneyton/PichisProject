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

    ConnectionBD c = new ConnectionBD();

    String naturePrestation;
    Medecin demandeur;
    DPI patient;
    Resultat resultat;
    DateSimple date;
    Prestations p;
    DAOMedecin daom = new DAOMedecin();
    DAODPI daod = new DAODPI();
    DAOResultat daor = new DAOResultat();

    /**
     * Permet d'ajouter un patient dans la base de données, prend en paramètre
     * la nature de la prestation, l'id du médecin demandeur, l'ipp du patient,
     * l'id du résultat associé si il existe, la date et l'id de la prestation
     */
    public void ajoutPrestation(String naturePrestation, String demandeur, String patient, String resultat, String date, String id) {
        Statement ins;
        //String patient : IPP du patient
        try {
            ins = c.connexion.createStatement();
            ins.executeUpdate("INSERT INTO prestations(id, demandeur, patient,resultat, date,nature)" + "VALUES ('" + id + "','" + demandeur + "','" + patient + "','" + resultat + "','" + date + "','" + naturePrestation + "')");

        } catch (SQLException ex) {
            System.out.println("Erreur lors de la création de la prestation" + ex);
        }
    }

   public ArrayList<Prestations> prestationsPatient(String idPatient) {

        ArrayList<Prestations> l = new ArrayList<Prestations>();
        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();
            //idPatient est l'IPP du patient

            resul = ins.executeQuery("SELECT * FROM prestations WHERE patient='" + idPatient + "'");

            while (resul.next()) {

                naturePrestation = resul.getString("nature");
                demandeur = daom.medecinParID("demandeur");
                patient = daod.dpiParIPP("patient");
                resultat = daor.resultatPrestation("resultat");
                String d = resul.getString("date");
                date = new DateSimple(d.substring(0, 1), d.substring(2, 3), d.substring(4, 7));

                p = new Prestations(naturePrestation, demandeur, patient, resultat, date);
                l.add(p);
            }

        } catch (SQLException e) {
            System.out.println("erreur DAOPrestations: " + e);
        }

        return l;
    }
    public ArrayList<Prestations> consulterListePrestationsNonRealisee() {

        ArrayList<Prestations> listePrestations = new ArrayList();

        try {

            ResultSet resul;
            Statement ins = c.connexion.createStatement();
            resul = ins.executeQuery("SELECT * FROM prestations WHERE resultat='NULL'");
            while (resul.next()) {

                String naturePrestation = resul.getString("nature");
                demandeur = daom.medecinParID("demandeur");
                patient = daod.dpiParIPP("patient");
                resultat = daor.resultatPrestation("resultat");
                String d = resul.getString("date");
                date = new DateSimple(d.substring(0, 1), d.substring(2, 3), d.substring(4, 7));

                p = new Prestations(naturePrestation, demandeur, patient, resultat, date);
                listePrestations.add(p);
            }
        } catch (SQLException e) {
            System.out.println("erreur DAOPrestations: " + e);
        }

        return listePrestations;
    }

}
