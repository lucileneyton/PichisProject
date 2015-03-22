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
import pichisNF.Administratif;

/**
 *
 * @author Lucile
 */
public class DAOAdministratif {

    ConnectionBD c ;
    
    

    public boolean identification(String id, String motDePasse) throws SQLException {

        c = new ConnectionBD();
        String identif;
        String mdp;
        boolean b = false;
        ResultSet resul;
        Statement ins = null;
        

        try {

            ins = c.connexion.createStatement();
            resul = ins.executeQuery("SELECT * FROM personnel WHERE id=" + id + " AND (maintenance='NULL' OR maintenance IS NULL) AND (service='NULL' OR service IS NULL)");

            while (resul.next()) {

                identif = resul.getString("id");
                mdp = resul.getString("mdp");

                if (mdp.equals(motDePasse)) {
                    b = true;
                    
                } else {
                    b = false;
                }
                return b;
            }
            
            

        } catch (SQLException e) {
            System.out.println("erreur DAOAdministratif (identification) : " + e);
            return b;
        }
        finally{
            if(c!=null){
                try{
                   c.connexion.close();
                }
                catch(SQLException e){
                    System.out.println(e);
                }
            }
                   
        }
        
        
        
        
        return b;
    }

    public ArrayList<Administratif> consulterListeAdministratif() {

        ArrayList<Administratif> listeAdministratif = new ArrayList();
        c=new ConnectionBD();
        
        try {

            ResultSet resul;
            Statement ins = c.connexion.createStatement();
            resul = ins.executeQuery("SELECT * FROM personnel WHERE service='NULL' AND maintenance ='false'");
            while (resul.next()) {

                String id = resul.getString("id");
                String nom = resul.getString("nom");
                String prenom = resul.getString("prenom");
                String mdp = resul.getString("mdp");
                listeAdministratif.add(new Administratif(id, nom, prenom, mdp));

            }
           
            
        } catch (SQLException e) {
            System.out.println("erreur DAOAdministratif (consulterListeAdinistratif): " + e);
        }
        
        finally{
            if(c!=null){
                try{
                   c.connexion.close();
                }
                catch(SQLException e){
                    System.out.println(e);
                }
            }
                   
        }

        return listeAdministratif;
    }

    public Administratif administratifParID(String id) {

        Administratif admin = null;
        c = new ConnectionBD();

        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();
            resul = ins.executeQuery("SELECT * FROM personnel WHERE id='" + id + "'");

            while (resul.next()) {

                String nom = resul.getString("nom");
                String prenom = resul.getString("prenom");
                String mdp = resul.getString("mdp");
                admin = new Administratif(id, nom, prenom, mdp);

            }

        } catch (SQLException e) {
            System.out.println("erreur DAOAdministratif: (administratifParID) " + e);
        }
        
        finally{
            if(c!=null){
                try{
                   c.connexion.close();
                }
                catch(SQLException e){
                    System.out.println(e);
                }
            }
                   
        }

        return admin;
    }

    public void ajoutAdministratif(String id, String nom, String prenom, String motDePasse) {

        Statement ins;
        c= new ConnectionBD();

        try {
            ins = c.connexion.createStatement();
            ins.executeUpdate("INSERT INTO personnel(id, nom, prenom,mdp, service,maintenance)" + "VALUES ('" + id + "','" + nom + "','" + prenom + "','" + motDePasse + "','" + "NULL" + "','" + "false" + "')");

        } catch (SQLException ex) {
            System.out.println("Erreur DAOAdministratif (ajoutAdministratif)" + ex);
        }
        finally{
            if(c!=null){
                try{
                   c.connexion.close();
                }
                catch(SQLException e){
                    System.out.println(e);
                }
            }
                   
        }
    }

}
