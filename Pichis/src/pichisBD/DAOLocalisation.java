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
            resul = ins.executeQuery("SELECT * FROM sejour WHERE id.sejour= " + num);

            if (resul.getRow() == 0) {

                loc = null;

            } else {

                while (resul.next()) {
                    
                    String localisation = resul.getString("loc");
                    String numChambre = resul.getString("numerochambre");
                    String placement = resul.getString("placement");
                    String typeService = resul.getString(Mettre Nom Colonne);
                    String specialite = resul.getString(Mettre nom colonne);
                    
                    TypeServices t = TypeServices.valueOf(typeService);
                    Specialite sp = Specialite.valueOf(specialite);
                    Services s = new Services(t,sp); //Services(TypeServices type, Specialite specialite)
                    loc = new Localisation(s,numChambre,placement);

                }
            }
        } catch (SQLException e) {
            System.out.println("erreur DAOLocalisation: " + e);
        }

        return loc;
    }

    

}


