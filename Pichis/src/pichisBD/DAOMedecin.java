package pichisBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import pichisNF.Medecin;
import pichisNF.Services;
import pichisNF.Specialite;
import pichisNF.TypeServices;

/**
 *
 * Data access object de la classe Medecin
 */
public class DAOMedecin {

    public ConnectionBD c;

    /**
     * Méthode permettant de consulter la liste des médecins
     *
     * @return ArrayList
     */
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

    /**
     *
     * Méthode pour l'identification d'un médecin
     *
     * @param id l'identifiant entré par le médecin
     * @param motDePasse le mot de passe renseigné par le médecin
     * @return boolean
     */
    public boolean identification(String id, String motDePasse) {

        String identif;
        String mdp;
        boolean b = false;
        c = new ConnectionBD();
        ResultSet resul;
        Statement ins;

        try {

            ins = c.connexion.createStatement();
            resul = ins.executeQuery("SELECT * FROM personnel WHERE id= '" + id + "'");

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

    /**
     * Méthode déterminant si un personnel est un médecin ou non
     *
     * @param id l'identifiant du personnel
     * @param mdp le mot de passe du personnel
     * @return boolean
     * @exception SQLException
     */
    public boolean estMedecin(String id, String mdp) throws SQLException {
        ResultSet res = null;
        boolean b = false;
        c = new ConnectionBD();

        try {

            Statement ins = c.connexion.createStatement();

            res = ins.executeQuery("SELECT * FROM personnel WHERE service!='NULL' AND id='" + id + "'");

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

        return b;

    }

    /**
     * Méthode permettant d'avoir la liste des médecins
     *
     * @return ArrayList
     */
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

    /**
     * Méthode retournant le médecin responsable d'un séjour
     *
     * @param numSejour le numéro du séjour concerné
     * @return Medecin
     */
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
            System.out.println("erreur DAOAMedecin (medecinResponsable): " + e);
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

    /**
     * Méthode donnant une instance de médecin à partir de son identifiant
     *
     * @param id l'identifiant du médecin
     * @return Medecin
     */
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

            resul = ins.executeQuery("SELECT * FROM personnel WHERE (service IS NOT NULL or service!='NULL') AND id= '" + id + "'");
            while (resul.next()) {

                nom = resul.getString("nom");
                prenom = resul.getString("prenom");
                mdp = resul.getString("mdp");
                String idService = resul.getString("service");

                DAOServices d = new DAOServices();

                Services service = d.serviceParID(idService);

                med = new Medecin(id, nom, prenom, mdp, service);

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

    /**
     * Méthode déterminant l'identifiant du service à partir de sa spécialité
     *
     * @param specialite le nom de la spécialité du service
     * @return String
     */
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

    /**
     * Méthode permettant d'ajouter un médecin dans la base de données
     *
     * @param id l'identifiant du personnel
     * @param nom le nom du nouveau personnel
     * @param prenom le prénom du personnel
     * @param motDePasse le mot de passe du nouveau personnel
     * @param service l'id du service du personnel
     */
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
