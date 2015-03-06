/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pichisBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import pichisNF.Localisation;
import pichisNF.Services;
import pichisNF.TypeServices;

/**
 *
 * @author Lucile
 */
public class DAOLocalisation {
 
    ConnectionBD c = new ConnectionBD();

   
    public Localisation localisationParNumeroDeSejour(String num) {

        Localisation loc = null;

        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();
            resul = ins.executeQuery("SELECT * FROM sejour WHERE id= " + num);

            if (resul.getRow() == 0) {

                loc = null;

            } else {

                while (resul.next()) {

                    String id = resul.getString("id");
                    String type = resul.getString("type");  
                    String spec = resul.getString("specialite");              
                    
                    TypeServices t = TypeServices.valueOf(type);
                    Services s = new Services(t,spec);
                    loc = new Localisation(s);

                }
            }
        } catch (SQLException e) {
            System.out.println("erreur DAOLocalisation: " + e);
        }

        return loc;
    }

    

}


