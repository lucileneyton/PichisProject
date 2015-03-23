/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisUI;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import pichisBD.ConnectionBD;
import pichisBD.DAODPI;
import pichisBD.DAOMedecin;
import pichisBD.DAOResultat;
import pichisNF.DPI;
import pichisNF.DateSimple;
import pichisNF.Localisation;
import pichisNF.Medecin;
import pichisNF.Prestations;
import pichisNF.Resultat;
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

//        DateSimple dateNaissance = new DateSimple("", "", "", "", "");

//        DPI p = new DPI("123", "", "", "", dateNaissance, "");
        
        String naturePrestation;
    Medecin demandeur;
    DPI patient;
    Resultat resultat;
    DateSimple date = null;
    Prestations p1;
    
    DAOMedecin daom = new DAOMedecin();
    DAODPI daod = new DAODPI();
    DAOResultat daor = new DAOResultat();
    ResultSet resul;
    ConnectionBD c = new ConnectionBD();
    Statement ins = c.connexion.createStatement();
    String id ="1";
    Services s = null;

    
        try {
 resul = ins.executeQuery("SELECT * FROM service WHERE id= " + id);
 

            while (resul.next()) {
                
//                naturePrestation = resul.getString("nature");
//                String idMedecin = resul.getString("demandeur");
//                demandeur = daom.medecinParID(idMedecin);
//                patient = daod.dpiParIPP("patient");
//                resultat = daor.resultatPrestation("resultat");
//                String d = resul.getString("date");
//                if (d !=null){
//
//                date = new DateSimple(d.substring(0, 2), d.substring(3, 5), d.substring(6, 10), d.substring(13, 15), d.substring(16, 18));
//                    
//                }
//                Prestations p4 = new Prestations(naturePrestation, demandeur, patient, resultat, date);
//                ArrayList<Prestations> l = new ArrayList<Prestations>();
//                l.add(p4);
                String spec = resul.getString("specialite");
                String type = resul.getString("type");

                System.out.println("" + spec);
                Specialite sp = Specialite.valueOf(spec.toUpperCase());
                TypeServices types = TypeServices.valueOf(type);
                s = new Services(types, sp);
                System.out.println("" +s);
                
                
            }
            

        } catch (SQLException e) {
            System.out.println("erreur DAOPrestations: " + e);
        }
        
        
        
        
        
        

//            
//            Statement ins = c.connexion.createStatement();
//
//            resul = ins.executeQuery("SELECT * FROM prestations");
//
////            System.out.println("" + resul.next());
////            if (resul.getRow() == 0) {)
////
////                loc = null;
////
////            } else {
//            int i = 0;
//            System.out.println("" + resul.first());
//
//            while (resul.next()) {
//                i++;
//            }

//            System.out.println("" + i);
////                    System.out.println("OK");
//                    String localisation = resul.getString("loc");
//                    String numChambre = resul.getString("numerochambre");
//                    String placement = resul.getString("placement");
//                    String typeService = resul.getString("service.type");
//                    String specialite = resul.getString("service.specialite");
//
//                    TypeServices t = TypeServices.valueOf(typeService);
//                    Specialite sp = Specialite.valueOf(specialite);
//                    Services s = new Services(t, sp);
//                    
//                    loc = new Localisation(s, numChambre, placement);
//                    System.out.println("" + specialite);
//
//                
//            }
      

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
