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
import pichisNF.Prescription;

/**
 *
 * Data access object de la classe Prescription
 */
public class DAOPrescription {

    public ConnectionBD c;

    /**
     * Méthode permettant d'ajouter une prescription dans la base de données
     *
     * @param id l'identifiant de la prescription
     * @param idPatient l'ipp du patient concerné
     * @param idMedecin l'identifiant du médecin
     * @param texte le détail de la prescription
     * @param date la date de la prescription
     */
    public void ajoutPrescription(String id, String idPatient, String idMedecin, String texte, String date) {
        Statement ins;
        c = new ConnectionBD();

        try {
            ins = c.connexion.createStatement();
            ins.executeUpdate("INSERT INTO prescriptions(id, patient, medecin,texte, date)" + "VALUES ('" + id + "','" + idPatient + "','" + idMedecin + "','" + texte + "','" + date + "')");

        } catch (SQLException ex) {
            System.out.println("Erreur lors de la création de la prescription" + ex);
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
     * Méthode permettant de récupérer les prescriptions d'un patient
     *
     * @param idPatient l'ipp du patient
     * @return ArrayList
     */
    public ArrayList<Prescription> prescriptionsPatient(String idPatient) {

        c = new ConnectionBD();
        ArrayList<Prescription> liste = new ArrayList<Prescription>();
        DateSimple date = null;
        String m;
        String texte;
        String p;

        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();

            resul = ins.executeQuery("SELECT * FROM prescriptions WHERE patient='" + idPatient + "'");

            while (resul.next()) {

                m = resul.getString("medecin");
                DAOMedecin daom = new DAOMedecin();
                Medecin med = daom.medecinParID(m);

                texte = resul.getString("texte");

                p = resul.getString("patient");
                DAODPI daop = new DAODPI();
                DPI dpi = daop.dpiParIPP(p);

                String d = resul.getString("date");

                if (d != null) {
                    if (d.length() <= 11) {
                        date = new DateSimple(d.substring(0, 2), d.substring(3, 5), d.substring(6, 10));
                    } else {
                        date = new DateSimple(d.substring(0, 2), d.substring(3, 5), d.substring(6, 10), d.substring(13, 15), d.substring(16, 18));
                    }
                }

                Prescription pres = new Prescription(date, texte, med);

                liste.add(pres);

            }

        } catch (SQLException e) {
            System.out.println("erreur DAOPrescription (prescriptionsPatient): " + e);
        } finally {
            if (c != null) {
                try {
                    c.connexion.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }

        }

        return liste;
    }

}
