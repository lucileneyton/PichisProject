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
import pichisNF.Medecin;

/**
 *
 * @author Lucile
 */
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
    ConnectionBD c;

    public ArrayList<Medecin> consulterListeMedecin2() {

        ArrayList<Medecin> listeMedecin = new ArrayList();
        String id;
        String nom;
        String prenom;
        String mdp;
        String type;
        Specialite s;
        TypeServices types;
        c = new ConnectionBD();

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
            System.out.println("erreur DAOMedecin (consulterListeMedecin2): " + e);
        } finally {
            if (c != null) {
                try {
                    c.connexion.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }

        }

        return listeMedecin;

    }

    public boolean identification(String id, String motDePasse) {

        String identif;
        String mdp;
        boolean b = false;
        c = new ConnectionBD();
        ResultSet resul;
        Statement ins;

        try {

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
            System.out.println("erreur DAOMedecin (identification): " + e);
            return b;
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

    public boolean estMedecin(String id, String mdp) throws SQLException {
        ResultSet res = null;
        boolean b = false;
        c = new ConnectionBD();

        try {

            Statement ins = c.connexion.createStatement();
            //res = ins.executeQuery("SELECT * FROM personnel WHERE id= '"+id+"'");

            res = ins.executeQuery("SELECT * FROM personnel WHERE service!='NULL' AND id=" + id + ";");

            while (res.next()) {
                if (res.getRow() != 0) {
                    b = true;

                }
            }

        } catch (SQLException ex) {
            System.out.println("Erreur DAOMedecin (estMedecin)");
        } finally {
            if (c != null) {
                try {
                    c.connexion.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }

        }

//        System.out.println("estMedecin" + b);
        return b;

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
        c = new ConnectionBD();

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
            System.out.println("erreur DAOMedecin (consulterListeMedecin): " + e);
        } finally {
            if (c != null) {
                try {
                    c.connexion.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }

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
        c = new ConnectionBD();

        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();
            resul = ins.executeQuery("SELECT personnel.id, personnel.nom, personnel.prenom, personnel.mdp, personnel.service, service.specialite "
                    + "FROM sejour,personnel,service "
                    + "WHERE sejour.id=" + numSejour + " AND personnel.id = sejour.responsable AND service.id = personnel.service;");

            while (resul.next()) {

                if (resul.getRow() == 0) {

                    med = null;

                } else {

                    id = resul.getString("id");
                    nom = resul.getString("nom");
                    prenom = resul.getString("prenom");
                    mdp = resul.getString("mdp");

                    String spec = resul.getString("service.specialite");

                    Specialite sp = Specialite.valueOf(spec.toUpperCase());

                    //type = resul.getString("service");
                    //types = TypeServices.valueOf(type);
                    types = TypeServices.CLINIQUE;
                    Services service = new Services(types, sp);

                    med = new Medecin(id, nom, prenom, mdp, service);

                }
            }
        } catch (SQLException e) {
            System.out.println("erreur DAOAMedecin medecinResponsable: " + e);
        } finally {
            if (c != null) {
                try {
                    c.connexion.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }

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
        c = new ConnectionBD();

        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();
            //resul = ins.executeQuery("SELECT personnel.id,personnel.mdp,personnel.nom,personnel.prenom,personnel.service,service.type,service.specialite FROM personnel,service WHERE personnel.service=service.id AND personnel.service!='NULL' AND personnel.id='" + id + "'");

            resul = ins.executeQuery("SELECT * FROM personnel WHERE (service IS NOT NULL or service!='NULL') AND id= " + id);
            while (resul.next()) {

                nom = resul.getString("nom");
                prenom = resul.getString("prenom");
                mdp = resul.getString("mdp");
                String idService = resul.getString("service");
//                    type = resul.getString("type");
//                    types = TypeServices.valueOf(type);
//                    String spec = resul.getString("specialite").toUpperCase();
//                    Specialite sp = Specialite.valueOf(spec);
//                    
//                    if (spec.equals("Radiologie") || spec.equals("Anesthesie")){
//                        types = TypeServices.MEDICO_TECHNIQUE;
//                    }
//                    else{
//                        types = TypeServices.CLINIQUE;
//                    }
//                    Services service = new Services(types, sp);

                DAOServices d = new DAOServices();

                Services service = d.serviceParID(idService);
                

                

                med = new Medecin(id, nom, prenom, mdp, service);
//                System.out.println(med.getNom());
            }

        } catch (SQLException e) {
            System.out.println("erreur DAOMedecin (medecin par ID): " + e);
        } finally {
            if (c != null) {
                try {
                    c.connexion.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }

        }

        return med;
    }

    public String IdService(String specialite) {
        Statement ins;
        ResultSet res;
        Services service = null;
        String num = null;
        c = new ConnectionBD();

        try {
            ins = c.connexion.createStatement();
            res = ins.executeQuery("SELECT * FROM service WHERE specialite='" + specialite + "'");

            while (res.next()) {
                num = res.getString("id");

            }
        } catch (SQLException ex) {
            System.out.println("Erreur DAOMedecin (IdService)" + ex);
        } finally {
            if (c != null) {
                try {
                    c.connexion.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }

        }

        return num;

    }

    public void ajoutMedecin(String id, String nom, String prenom, String motDePasse, String service) {

        Statement ins;

        String s = IdService(service);
        c = new ConnectionBD();

        try {
            ins = c.connexion.createStatement();
            ins.executeUpdate("INSERT INTO personnel(id,nom,prenom,mdp,service,maintenance)" + "VALUES ('" + id + "','" + nom + "','" + prenom + "','" + motDePasse + "','" + s + "','" + "NULL" + "')");

        } catch (SQLException ex) {
            System.out.println("Erreur lors de la création du médecin" + ex);
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

}
