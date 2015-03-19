/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisUI;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import pichisBD.ConnectionBD;
import pichisBD.DAOLocalisation;
import pichisBD.DAOMedecin;
import pichisNF.DMA;
import pichisNF.DPI;
import pichisNF.DateSimple;
import pichisNF.Localisation;
import pichisNF.Medecin;
import pichisNF.Sejour;
import pichisNF.Services;
import pichisNF.Specialite;
import pichisNF.TypeServices;

/**
 *
 * @author Matilas
 */
public class TestsBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        String num = "1";
        DateSimple dateE;
        DateSimple dateS;
        Medecin resp;
        Localisation loc;

        DateSimple dateNaissance = new DateSimple("", "", "");

        DPI p = new DPI("123", "", "", "", dateNaissance, "");

        ConnectionBD c = new ConnectionBD();

        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();

            resul = ins.executeQuery("SELECT sejour.ipp,sejour.id,sejour.dateentree, sejour.responsable,sejour.loc, sejour.datasortie,sejour.numerochambre,sejour.placement,service.id, service.specialite,service.type FROM sejour,service WHERE service.id = sejour.loc AND sejour.id= " + num);

//            System.out.println("" + resul.next());
//            if (resul.getRow() == 0) {
//
//                loc = null;
//
//            } else {

                while (resul.next()) {
//                    System.out.println("OK");
                    String localisation = resul.getString("loc");
                    String numChambre = resul.getString("numerochambre");
                    String placement = resul.getString("placement");
                    String typeService = resul.getString("service.type");
                    String specialite = resul.getString("service.specialite");

                    TypeServices t = TypeServices.valueOf(typeService);
                    Specialite sp = Specialite.valueOf(specialite);
                    Services s = new Services(t, sp);
                    
                    loc = new Localisation(s, numChambre, placement);
                    System.out.println("" + specialite);

                
            }
        } catch (SQLException e) {
            System.out.println("erreur DAOLocalisation: " + e);
        }

//        DMA dma = new DMA();
//
//        DAOMedecin daom = new DAOMedecin();
//        DAOLocalisation daol = new DAOLocalisation();
//
//        try {
//
//            ResultSet resul;
//
//            Statement ins = c.connexion.createStatement();
//
//            resul = ins.executeQuery("SELECT * FROM sejour WHERE sejour.ipp= " + p.getIpp() );
//
//            
//            while (resul.next()) {
//
//                num = resul.getString("id");
//                String de = resul.getString("dateentree");
//                String ds = resul.getString("datasortie");
//                dateE = new DateSimple(de.substring(0, 1), de.substring(2, 3), de.substring(4, 7));
//
//                resp = daom.medecinResponsable(num);
//                loc = daol.localisationParNumeroDeSejour(num);
//                System.out.println("" +num);
//                Sejour s;
//               
//                
//                s = new Sejour(dma, num, dateE, resp, loc);
//              
//                dma.ajouterSejour(s);
//
//            }
//
//        } catch (SQLException e) {
//            System.out.println("erreur DAOSejour: " + e);
//        }
    }
}
