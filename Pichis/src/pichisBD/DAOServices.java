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
 * Data access object de la classe Services
 *
 */
public class DAOServices {

    public ConnectionBD c;

    /**
     * Méthode retournant une instance de Services par rapport à son identifiant
     *
     * @param id l'identifiant du service
     * @return Services
     * @exception SQLException
     */
    public Services serviceParID(String id) throws SQLException {
        c= new ConnectionBD();
        Services s = null;

        try {
            Statement ins = c.connexion.createStatement();
            ResultSet resul;

            resul = ins.executeQuery("SELECT * FROM service WHERE id= " + id);

            while (resul.next()) {

                String spec = resul.getString("specialite");
                String type = resul.getString("type");

                Specialite sp = Specialite.valueOf(spec.toUpperCase());
                TypeServices types = TypeServices.valueOf(type);
                s = new Services(types, sp);

            }

        } catch (SQLException e) {
            System.out.println("erreur DAOService (serviceParID): " + e);
        }
        return s;
    }

    /**
     * Méthode déterminant l'identifiant d'un service à partir d'une instance de Services
     *
     * @param s l'instance du service
     * @return String
     */
    public String idParService(Services s) {
        c= new ConnectionBD();
        String id = null;

        try {
            Statement ins = c.connexion.createStatement();
            ResultSet resul;

            resul = ins.executeQuery("SELECT * FROM service WHERE specialite= " + "'" + s.getSpecialite().toString() + "';");

            while (resul.next()) {
                id = resul.getString("id");
            }

        } catch (SQLException e) {
            System.out.println("erreur DAOService (idParService): " + e);
        }

        return id;
    }
}
