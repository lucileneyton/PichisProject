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
            ins.executeUpdate("INSERT INTO operations(id, sejour, date,operation, medecin)" + "VALUES ('" + id + "','" + numSejour + "','" + date + "','" + operation + "','" + auteur + "')");

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
        String date;
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
                
                date = resul.getString("date");
                DateSimple d = new DateSimple(date.substring(0, 1), date.substring(2, 3), date.substring(4, 7));
                
                Operation o = new Operation(numSejour,d,operation,auteur);

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
