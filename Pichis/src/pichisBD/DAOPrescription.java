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
import pichisNF.Observation;
import pichisNF.Prescription;

/**
 *
 * @author Lucile
 */
public class DAOPrescription {
    
    ConnectionBD c;
    
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
    
    
    public ArrayList<Prescription> prescriptionsPatient(String idPatient) {
        
        
        c = new ConnectionBD();
        ArrayList<Prescription> liste = new ArrayList<Prescription>();
        String date;
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
                
                date = resul.getString("date");
                DateSimple d = new DateSimple(date.substring(0, 1), date.substring(2, 3), date.substring(4, 7));
                
                Prescription pres = new Prescription(d,texte,med);

                liste.add(pres);
                
            }

        } catch (SQLException e) {
            System.out.println("erreur DAOObservation: " + e);
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
