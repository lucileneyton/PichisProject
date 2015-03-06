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

    ConnectionBD c = new ConnectionBD();
    DateSimple date;
    String descriptions;
    Medecin medecin;
    Resultat res;
    String numPrestation;
    DAOMedecin daom = new DAOMedecin();
    

    Resultat resultatPrestation(String idPrestation) {

        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();

            resul = ins.executeQuery("SELECT * FROM resultat WHERE id.resultat= " + idPrestation + ";");

            while (resul.next()) {
                
             String d = resul.getString("date");   
             date = new DateSimple(d.substring(0, 1), d.substring(2, 3), d.substring(4, 7));
             descriptions = resul.getString("description");
             String id = resul.getString("medecin");
             medecin = daom.medecinParID(id);
             
             res = new Resultat(date,descriptions, medecin);
             

            }

        } catch (SQLException e) {
            System.out.println("erreur DAOSejour: " + e);
        }

        return res;
    }

}
