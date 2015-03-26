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
import pichisNF.DPI;
import pichisNF.DateSimple;
import pichisNF.Medecin;
import pichisNF.Operation;
import pichisNF.Prescription;

/**
 *
 * @author Lucile
 */
public class DAOOperation {
    
    ConnectionBD c;
    //Operation(String numeroSejour, DateSimple date, String operation, Medecin medecin)
    
//    public void ajoutOperation(String id, String numSejour, String date, String operation, String idMedecin) {
    public void ajoutOperation(String id, String numSejour, String date, String operation, String auteur) {
        Statement ins;
        c = new ConnectionBD();

        try {
            ins = c.connexion.createStatement();
            ins.executeUpdate("INSERT INTO operations(id, numsejour, date,operation, medecin)" + "VALUES ('" + id + "','" + numSejour + "','" + date + "','" + operation + "','" + auteur + "')");

        } catch (SQLException ex) {
            System.out.println("Erreur lors de la création de l'opération" + ex);
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
    
    public ArrayList<Operation> operationSejour(String numSejour){
        
        c = new ConnectionBD();
        ArrayList<Operation> listeOperations = new ArrayList<Operation>();
//        String medecin;
        String auteur;
        DateSimple date = null;
        String operation;
        
        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();

            resul = ins.executeQuery("SELECT * FROM operations WHERE numsejour='" + numSejour + "'");

            while (resul.next()) {

//                medecin = resul.getString("medecin");
                auteur = resul.getString("medecin");
                DAOMedecin daom = new DAOMedecin();
//                Medecin m = daom.medecinParID(medecin);
                
                operation = resul.getString("operation");
                
                String d = resul.getString("date");
                
                
                 if (d != null) {
                    if (d.length() <= 11) {
                        date = new DateSimple(d.substring(0, 2), d.substring(3, 5), d.substring(6, 10));
                    } else {
                        date = new DateSimple(d.substring(0, 2), d.substring(3, 5), d.substring(6, 10), d.substring(13, 15), d.substring(16, 18));
                    }
                }
                Operation o = new Operation(numSejour,date,operation,auteur);

                listeOperations.add(o);
                
            }

        } catch (SQLException e) {
            System.out.println("erreur DAOOperation: " + e);
        } finally {
            if (c != null) {
                try {
                    c.connexion.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }

        }

        return listeOperations;
        
    } 
    
}
