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
                DateSimple d = new DateSimple(date.substring(0, 1), date.substring(2, 3), date.substring(4, 7));
                
                Observation o = new Observation(d,texte,med);

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
