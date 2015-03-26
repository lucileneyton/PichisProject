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
import pichisNF.DateSimple;
import pichisNF.Observation;
import pichisNF.Medecin;
import pichisNF.DPI;

/**
 *
 * @author Lucile
 */
public class DAOObservation {
    
    ConnectionBD c;
    
    public void ajoutObservation(String id, String idMedecin, String texte, String patient, String date) {
        Statement ins;
        c = new ConnectionBD();

        try {
            ins = c.connexion.createStatement();
            ins.executeUpdate("INSERT INTO observations(id, medecin, texte,patient, date)" + "VALUES ('" + id + "','" + idMedecin + "','" + texte + "','" + patient + "','" + date + "')");

        } catch (SQLException ex) {
            System.out.println("Erreur lors de la création de l'observation" + ex);
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
    
    public ArrayList<Observation> observationsPatient(String idPatient) {
        
        
        c = new ConnectionBD();
        ArrayList<Observation> liste = new ArrayList<Observation>();
        String date;
        String m;
        String texte;
        String p;
        
        
        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();

            resul = ins.executeQuery("SELECT * FROM observations WHERE patient='" + idPatient + "'");

            while (resul.next()) {

                m = resul.getString("medecin");
                DAOMedecin daom = new DAOMedecin();
                Medecin med = daom.medecinParID(m);
                
                texte = resul.getString("texte");
                
                p = resul.getString("patient");
                DAODPI daop = new DAODPI();
                DPI dpi = daop.dpiParIPP(p);
                
                date = resul.getString("date");
                
                DateSimple dateRenvoyee =null;
                if (date != null) {
                    if (date.length() <= 11) {
                        dateRenvoyee = new DateSimple(date.substring(0, 2), date.substring(3, 5), date.substring(6, 10));
                    } else {
                        dateRenvoyee = new DateSimple(date.substring(0, 2), date.substring(3, 5), date.substring(6, 10), date.substring(13, 15), date.substring(16, 18));
                    }
                }
                Observation o = new Observation(dateRenvoyee,texte,med);

                liste.add(o);
                
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
