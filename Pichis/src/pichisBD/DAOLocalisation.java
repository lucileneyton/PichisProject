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
import pichisNF.Specialite;
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
            resul = ins.executeQuery("SELECT sejour.ipp,sejour.id,sejour.dateentree, sejour.responsable,sejour.loc, sejour.datasortie,sejour.numerochambre,sejour.placement,service.id, service.specialite,service.type FROM sejour,service WHERE service.id = sejour.loc AND sejour.id= " + num);

            if (resul.getRow() == 0) {

                loc = null;

            } else {

                while (resul.next()) {
                    
                    String localisation = resul.getString("loc");
                    String numChambre = resul.getString("numerochambre");
                    String placement = resul.getString("placement");
                    String typeService = resul.getString("service.type");
                    String specialite = resul.getString("service.specialite");
                    
                    TypeServices t = TypeServices.valueOf(typeService);
                    Specialite sp = Specialite.valueOf(specialite);
                    Services s = new Services(t,sp); 
                    loc = new Localisation(s,numChambre,placement);

                }
            }
        } catch (SQLException e) {
            System.out.println("erreur DAOLocalisation: " + e);
        }

        return loc;
    }

    

}


