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
import pichisNF.Medecin;

/**
 *
 * @author Lucile
 */
import pichisNF.Administratif;
import pichisNF.Services;
import pichisNF.Specialite;
import pichisNF.TypeServices;

public class DAOMedecin {
    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

    /**
     *
     * @author Lucile
     */
    ConnectionBD c = new ConnectionBD();

    public ArrayList<Medecin> consulterListeMedecin2() {

        ArrayList<Medecin> listeMedecin = new ArrayList();
        String id;
        String nom;
        String prenom;
        String mdp;
        String type;
        Specialite s;
        TypeServices types;

        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();

            resul = ins.executeQuery("SELECT personnel.id,personnel.mdp,personnel.nom,personnel.prenom,personnel.service,service.type, service.specialite FROM personnel,service WHERE personnel.id=service.id AND personnel.service IS NOT NULL;");

            while (resul.next()) {

                id = resul.getString("id");
                nom = resul.getString("nom");
                prenom = resul.getString("prenom");
                mdp = resul.getString("mdp");

                type = resul.getString("type");
                String spec = resul.getString("specialite");
                types = TypeServices.valueOf(type);
                s = Specialite.valueOf(spec.toUpperCase());

                Services service = new Services(types, s);
                listeMedecin.add(new Medecin(id, nom, prenom, mdp, service));

            }

        } catch (SQLException e) {
            System.out.println("erreur DAOAdministratif: " + e);
        }

        return listeMedecin;

    }

    public boolean identification(String id, String motDePasse) {

        String identif;
        String mdp;
        boolean b = false;

        try {
            ResultSet resul;
            Statement ins;
            ins = c.connexion.createStatement();
            resul = ins.executeQuery("SELECT * FROM personnel WHERE id= " + id);

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
            return b;
        }

    }



   
   

    public boolean estMedecin(String id, String mdp) throws SQLException {
        ResultSet res = null;
        boolean b = false;


        try {

            Statement ins = c.connexion.createStatement();
            //res = ins.executeQuery("SELECT * FROM personnel WHERE id= '"+id+"'");

             res = ins.executeQuery("SELECT * FROM personnel WHERE service IS NOT NULL AND id= " + id);
            
//            while (res.next()) {
//                if (res.getRow() == 0) {
//                    b = false;
//
//                } else {
//                    b = true;
//
//                }
//            }

//            res = ins.executeQuery("SELECT * FROM personnel");
//
//            while (res.next()) {
//                if (res.getRow() == 0) {
//                    b = false;
//
//                } else {
//                    b = true;
//
//                }
//            }

        } catch (SQLException ex) {
            System.out.println("Erreur DAOMedecin (estMedecin)");
        }


        return res.first();

//           

//            System.out.println("" + res.first());
//            if (res.getRow()==0){
//               
//            b= false;
//            return b;
//        }
//            else{
//                b = true;
//                return b;
//            }
    
//       
//        if (res != null) {
//            return res.first();
//        } else {
//            return false;
//        }


        

    }

    public ArrayList<Medecin> consulterListeMedecin() {

        ArrayList<Medecin> listeMedecin = new ArrayList();
        String id;
        String nom;
        String prenom;
        String mdp;
        String type;
        Specialite s;
        TypeServices types;

        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();

            resul = ins.executeQuery("SELECT personnel.id,personnel.mdp,personnel.nom,personnel.prenom,personnel.service,service.type, service.specialite FROM personnel,service WHERE personnel.service=service.id AND personnel.service IS NOT NULL;");

            while (resul.next()) {

                id = resul.getString("id");
                nom = resul.getString("nom");
                prenom = resul.getString("prenom");
                mdp = resul.getString("mdp");

                type = resul.getString("type");
                String spec = resul.getString("specialite");
                types = TypeServices.valueOf(type);
                s = Specialite.valueOf(spec);

                Services service = new Services(types, s);
                listeMedecin.add(new Medecin(id, nom, prenom, mdp, service));

            }

        } catch (SQLException e) {
            System.out.println("erreur DAOAdministratif: " + e);
        }

        return listeMedecin;

    }

    public Medecin medecinResponsable(String numSejour) {
        Medecin med = null;
        String id;
        String nom;
        String prenom;
        String mdp;
        String type;
        TypeServices types;

        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();
            resul = ins.executeQuery("SELECT sejour.responsable, personnel.nom, personnel.prenom, personnel.mdp, personnel.service FROM sejour,personnel WHERE sejour.id=" + numSejour + " AND personnel.id=sejour.responsable;");

            if (resul.getRow() == 0) {

                med = null;

            } else {

                while (resul.next()) {

                    id = resul.getString("id");
                    nom = resul.getString("nom");
                    prenom = resul.getString("prenom");
                    mdp = resul.getString("mdp");

                    String spec = resul.getString("specialite");
                    Specialite sp = Specialite.valueOf("spec");

                    type = resul.getString("service");
                    types = TypeServices.valueOf(type);
                    Services service = new Services(types, sp);

                    med = new Medecin(id, nom, prenom, mdp, service);

                }
            }
        } catch (SQLException e) {
            System.out.println("erreur DAOAdministratif: " + e);
        }

        return med;

    }

    public Medecin medecinParID(String id) {

        Medecin med = null;
        String nom;
        String prenom;
        String mdp;
        String type;
        TypeServices types;

        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();
            resul = ins.executeQuery("SELECT personnel.id,personnel.mdp,personnel.nom,personnel.prenom,personnel.service,service.type,service.specialite FROM personnel,service WHERE personnel.service=service.id AND personnel.service!='NULL' AND personnel.id='" + id + "'");

            while (resul.next()) {
                

                    nom = resul.getString("nom");
                    prenom = resul.getString("prenom");
                    mdp = resul.getString("mdp");
                    type = resul.getString("type");
                    types = TypeServices.valueOf(type);
                    String spec = resul.getString("specialite");
                    Specialite sp = Specialite.valueOf(spec);
                    Services service = new Services(types, sp);

                    med = new Medecin(id, nom, prenom, mdp, service);
                    System.out.println(med.getNom());
            }

            
        } catch (SQLException e) {
            System.out.println("erreur DAOMedecin (medecin par ID): " + e);
        }

        return med;
    }
    
    public String IdService(String specialite){
       Statement ins;
       ResultSet res;
       Services service = null;
       String num = null; 
        
        try {
            ins = c.connexion.createStatement();
            res = ins.executeQuery("SELECT * FROM service WHERE specialite='"+specialite+"'");
            
            while(res.next()){
           num = res.getString("id");
            
            }
        } catch (SQLException ex) {
            System.out.println("Erreur lors de la création du médecin" + ex);
        }
        
           return num;         
        
    }

    public void ajoutMedecin(String id, String nom, String prenom, String motDePasse, String service) {

        Statement ins;
        
        String s = IdService(service);
        
        try {
            ins = c.connexion.createStatement();
            ins.executeUpdate("INSERT INTO personnel(id,nom,prenom,mdp,service,maintenance)" + "VALUES ('" + id + "','" + nom + "','" + prenom + "','" + motDePasse + "','" + s + "','" + "NULL" + "')");

        } catch (SQLException ex) {
            System.out.println("Erreur lors de la création du médecin" + ex);
        }
    }

}
