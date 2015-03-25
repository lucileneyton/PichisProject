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
    public ArrayList<Operation> operationSejour(String numSejour){
        
        c = new ConnectionBD();
        ArrayList<Operation> listeOperations = new ArrayList<Operation>();
        String medecin;
        String date;
        String operation;
        
        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();

            resul = ins.executeQuery("SELECT * FROM operations WHERE sejour='" + numSejour + "'");

            while (resul.next()) {

                medecin = resul.getString("medecin");
                DAOMedecin daom = new DAOMedecin();
                Medecin m = daom.medecinParID(medecin);
                
                operation = resul.getString("operation");
                
                date = resul.getString("date");
                DateSimple d = new DateSimple(date.substring(0, 1), date.substring(2, 3), date.substring(4, 7));
                
                Operation o = new Operation(numSejour,d,operation,m);

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
