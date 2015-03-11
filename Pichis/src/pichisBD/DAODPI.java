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
import pichisNF.DM;
import pichisNF.DMA;
import pichisNF.DateSimple;
import pichisNF.LettreDeSortie;
import pichisNF.Operation;
import pichisNF.Prestations;
import pichisNF.DPI;

/**
 *
 * @author Lucile
 */
public class DAODPI {
    //  boolean IPPexiste(ipp)
    
    String ipp;
    String nom;
    String prenom; 
    String sexe;
    DateSimple dateNaissance;
    String adresse;
    DMA dma;
    DM dm;
    ArrayList<LettreDeSortie> lettresDeSortie;
    ArrayList<Operation> operations;
    boolean estOuvert;
    DPI dpi;
    
    ConnectionBD c = new ConnectionBD();
    
    DPI dpiParIPP(String ipp){
         try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();

            resul = ins.executeQuery("SELECT * FROM dpi WHERE ipp.dpi= " + ipp + ";");

            while (resul.next()) {
                
                
            ipp = resul.getString("ipp");
            nom = resul.getString("nom");
            prenom = resul.getString("prenom");
            sexe = resul.getString("sexe");
            String d = resul.getString("dateNaissance");
            dateNaissance = new DateSimple(d.substring(0, 1), d.substring(2, 3), d.substring(4, 7));
            adresse = resul.getString("adresse");
            String ouvert = resul.getString("ouvert");
            
            if(ouvert.equals("T")){
                estOuvert = true;
            }
            else{
                estOuvert = false;
            }
            
             
             
            dpi = new DPI(ipp, nom, prenom, dateNaissance, sexe, adresse);
            
             

            }

        } catch (SQLException e) {
            System.out.println("erreur DAOSejour: " + e);
        }

        return dpi;
    }
    
    public void ajout(String ipp, String nom, String prenom, String sexe, DateSimple dateNaissance, String adresse){
        //ConnectionBD bd = new ConnectionBD(); // à enlever quand interface ready !
       
        Statement ins;
        Statement verif;
        ResultSet res;
        String ouvert = "T";
        
        try {
            ins = c.connexion.createStatement();
            verif = c.connexion.createStatement();
            
            res = verif.executeQuery("SELECT nom, prenom, dateNaissance FROM dpi WHERE nom='"+nom+"' AND prenom='"+prenom+"' AND dateNaissance='"+dateNaissance.toString()+"'");
            if (res.getRow()!=0){
                System.out.println("Le patient existe déjà dans la base");
            }
            
            
            else{
                ins.executeUpdate("INSERT INTO dpi(ipp, nom, prenom, sexe, dateNaissance, adresse, ouvert)" + "VALUES ('" + ipp + "','" + nom + "','" + prenom + "','" + sexe + "','" + dateNaissance.toString() + "','" + adresse + "','" + ouvert + "')");
            }

        } catch (SQLException ex) {
            System.out.println("Erreur lors de la création du patient" + ex);
        } 
    }
        
    }
    
    
    
    

