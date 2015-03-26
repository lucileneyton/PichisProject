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
import java.util.logging.Level;
import java.util.logging.Logger;
import pichisNF.Maintenance;

/**
 *
 * @author Johann
 */
public class DAOMaintenance {

    ConnectionBD c ;
    
    public boolean estMaintenance(String id, String mdp ){
        ResultSet res ;
        c= new ConnectionBD();
       boolean b=false;
        
        try {
            
            Statement ins = c.connexion.createStatement();
            res = ins.executeQuery("SELECT * FROM personnel WHERE (maintenance='true' ) AND (service='NULL' OR service IS NULL) AND id='"+id+"'");
            
            
            while (res.next()){
            if (res.getRow()!=0){
            b= true;
            
        }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOMedecin.class.getName()).log(Level.SEVERE, null, ex);
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

    public boolean identification(String id, String motDePasse) {

        String identif;
        String mdp ;
        boolean b = false;
        ResultSet resul;
        Statement ins;
        c = new ConnectionBD();

        try {

            ins = c.connexion.createStatement();
            resul = ins.executeQuery("SELECT * FROM personnel WHERE id='"+id+"'");

            while (resul.next()) {

                identif = resul.getString("id");
                mdp = resul.getString("mdp");

                if (mdp.equals(motDePasse)) {
                    b = true;
                } else {
                    b = false;
                }
            }
            return b;
        } catch (SQLException e) {
            System.out.println("erreur : " + e);
            return false;
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

    public ArrayList<Maintenance> consulterListeMaintenance() {

        ArrayList<Maintenance> listeMaintenance = new ArrayList();
        c = new ConnectionBD();

        try {

            ResultSet resul;
            Statement ins = c.connexion.createStatement();
            resul = ins.executeQuery("SELECT * FROM personnel WHERE service ='NULL' AND maintenance = 'true'");
            while (resul.next()) {

                String id = resul.getString("id");
                String nom = resul.getString("nom");
                String prenom = resul.getString("prenom");
                String mdp = resul.getString("mdp");
                listeMaintenance.add(new Maintenance(id, nom, prenom, mdp));

            }
        } catch (SQLException e) {
            System.out.println("erreur DAOMaintenance: " + e);
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

        return listeMaintenance;
    }

    public Maintenance MaintenanceParID(String id) {

        Maintenance maintenance = null;
        c = new ConnectionBD();

        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();
            resul = ins.executeQuery("SELECT * FROM personnel WHERE id='" + id+"'");

            if (resul.getRow() == 0) {

                maintenance = null;

            } else {

                while (resul.next()) {

                    String nom = resul.getString("nom");
                    String prenom = resul.getString("prenom");
                    String mdp = resul.getString("mdp");
                    maintenance = new Maintenance(id, nom, prenom, mdp);

                             }
            }
        } catch (SQLException e) {
            System.out.println("erreur DAOMaintenance: " + e);
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

        return maintenance;
    }

    public void ajoutMaintenance(String id, String nom, String prenom, String motDePasse) {

        Statement ins;
        c = new ConnectionBD();

        try {
            ins = c.connexion.createStatement();
            ins.executeUpdate("INSERT INTO personnel(id, nom, prenom,mdp, service,maintenance)" + "VALUES ('" + id + "','" + nom + "','" + prenom + "','" + motDePasse + "','" + "NULL"+"','" +"true"+ "')");

        } catch (SQLException ex) {
            System.out.println("Erreur lors de la création du personnel de maintenance" + ex);
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