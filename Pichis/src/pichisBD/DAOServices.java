/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import pichisNF.Services;
import pichisNF.Specialite;
import pichisNF.TypeServices;

/**
 *
 * @author Lucile
 */
public class DAOServices {

    ConnectionBD c = new ConnectionBD();

    public void ajoutService(String naturePrestation, String demandeur, String patient, String resultat, String date, String id) {

    }

    public Services serviceParID(String id) throws SQLException {

        /**
         * Méthode permettant la création d'une instance "Services" à partir des
         * informations contenues dans la base de données.
         */
        Services s = null;
         

        try {
            Statement ins = c.connexion.createStatement();
            ResultSet resul;
            

            resul = ins.executeQuery("SELECT * FROM service WHERE id= " + id);
            

            while (resul.next()) {

                String spec = resul.getString("specialite");
                String type = resul.getString("type");

                System.out.println("" + spec);
                Specialite sp = Specialite.valueOf(spec.toUpperCase());
                TypeServices types = TypeServices.valueOf(type);
                s = new Services(types, sp);
                System.out.println("" +s);
            }

        } catch (SQLException e) {
            System.out.println("erreur DAOService (service par ID): " + e);
        }
        return s;
    }
}
