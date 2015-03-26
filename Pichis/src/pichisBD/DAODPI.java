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
import pichisNF.DPI;

/**
 * Data access object pour la classe DPI
 *
 */
public class DAODPI {

    public String ipp;
    public String nom;
    public String prenom;
    public String sexe;
    public DateSimple dateNaissance;
    public String adresse;
    public DMA dma;
    public DM dm;
    public ArrayList<LettreDeSortie> lettresDeSortie;
    public ArrayList<Operation> operations;
    public boolean estOuvert;
    public DPI dpi;

    public ConnectionBD c;

    /**
     * Méthode retournant le DPI d'un patient
     *
     * @param ipp l'identifiant du patient
     * @return DPI
     */
    public DPI dpiParIPP(String ipp) {
        c = new ConnectionBD();
        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();

            resul = ins.executeQuery("SELECT * FROM dpi WHERE dpi.ipp='" + ipp + "'");

            while (resul.next()) {

                ipp = resul.getString("ipp");
                nom = resul.getString("nom");
                prenom = resul.getString("prenom");
                sexe = resul.getString("sexe");
                String d = resul.getString("dateNaissance");
                dateNaissance = new DateSimple(d.substring(0, 2), d.substring(3, 5), d.substring(6, 10));
                adresse = resul.getString("adresse");
                String ouvert = resul.getString("ouvert");

                if (ouvert.equals("T")) {
                    estOuvert = true;
                } else {
                    estOuvert = false;
                }

                dpi = new DPI(ipp, nom, prenom, sexe, dateNaissance, adresse);

            }

        } catch (SQLException e) {
            System.out.println("erreur DAOSejour (dpiParIPP): " + e);
        } finally {
            if (c != null) {
                try {
                    c.connexion.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }

        }

        return dpi;
    }

    /**
     * Méthode permettant l'ajout d'un DPI dans la base de données
     *
     * @param ipp l'identifiant du patient à créer
     * @param nom le nom du nouveau patient
     * @param prenom le prénom du nouveau patient
     * @param sexe le sexe du nouveau patient
     * @param dateNaissance la date de naissance du nouveau patient
     * @param adresse l'adresse du nouveau patient
     *
     */
    public void ajout(String ipp, String nom, String prenom, String sexe, DateSimple dateNaissance, String adresse) {
        Statement ins;
        Statement verif;
        ResultSet res;
        String ouvert = "T";
        c = new ConnectionBD();

        try {
            ins = c.connexion.createStatement();
            verif = c.connexion.createStatement();

            res = verif.executeQuery("SELECT nom, prenom, dateNaissance FROM dpi WHERE nom='" + nom + "' AND prenom='" + prenom + "' AND dateNaissance='" + dateNaissance.toString() + "'");
            if (res.getRow() != 0) {
                System.out.println("Le patient existe déjà dans la base");
            } else {
                ins.executeUpdate("INSERT INTO dpi(ipp, nom, prenom, sexe, dateNaissance, adresse, ouvert)" + "VALUES ('" + ipp + "','" + nom + "','" + prenom + "','" + sexe + "','" + dateNaissance.toString() + "','" + adresse + "','" + ouvert + "')");
            }

        } catch (SQLException ex) {
            System.out.println("Erreur lors de la création du patient" + ex);
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
     * Méthode retournant la liste des DPI de l'hôpital
     *
     * @return ArrayList
     */
    public ArrayList<DPI> consulterListeDPI() {

        ArrayList<DPI> listeDPI = new ArrayList();
        String ipp = "";
        String nom = "";
        String prenom = "";
        String sexe = "";
        String date = "";
        String adresse = "";
        c = new ConnectionBD();

        try {

            ResultSet resul;
            Statement ins = c.connexion.createStatement();
            resul = ins.executeQuery("SELECT * FROM dpi");
            while (resul.next()) {

                ipp = resul.getString("ipp");
                nom = resul.getString("nom");
                prenom = resul.getString("prenom");
                sexe = resul.getString("sexe");
                date = resul.getString("dateNaissance");
                dateNaissance = new DateSimple(date.substring(0, 2), date.substring(3, 5), date.substring(6, 10));
                adresse = resul.getString("adresse");
                listeDPI.add(new DPI(ipp, nom, prenom, sexe, dateNaissance, adresse));

            }
        } catch (SQLException e) {
            System.out.println("erreur DAODPI (consulterListeDPI): " + e);
        } finally {
            if (c != null) {
                try {
                    c.connexion.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }

        }

        return listeDPI;
    }

    /**
     * Méthode permettant de fermer le DPI d'un patient
     *
     * @param ipp l'identifiant du patient
     */
    public void fermerDPI(String ipp) {
        c = new ConnectionBD();

        try {
            int resul;

            Statement ins = c.connexion.createStatement();
            resul = ins.executeUpdate("UPDATE dpi SET ouvert = 'F' WHERE ipp=" + "'" + ipp + "' ;");

        } catch (SQLException e) {
            System.out.println("erreur DAODPI (fermerDPI): " + e);
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
     * Méthode permettant de fermer le DPI d'un patient
     *
     * @param ipp l'identifiant du patient
     */
    public void ouvrirDPI(String ipp) {
        c = new ConnectionBD();

        try {
            int resul;

            Statement ins = c.connexion.createStatement();
            resul = ins.executeUpdate("UPDATE dpi SET ouvert = 'T' WHERE ipp=" + "'" + ipp + "' ;");

        } catch (SQLException e) {
            System.out.println("erreur DAODPI (ouvrirDPI): " + e);
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
     * Méthode permettant de savoir si le DPI d'un patient est ouvert ou non
     *
     * @param ipp l'identifiant du patient
     * @return boolean true si le DPI est ouvert et false si le DPI est fermé
     */
    public boolean getOuvert(String ipp) {
        c = new ConnectionBD();
        boolean b = false;

        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();

            resul = ins.executeQuery("SELECT * FROM dpi WHERE ipp='" + ipp + "'");

            while (resul.next()) {

                String ouvert = resul.getString("ouvert");

                if (ouvert.equals("T")) {
                    b = true;
                }

            }

        } catch (SQLException e) {
            System.out.println("erreur DAODPI (getOuvert): " + e);
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
    
    public boolean estDejaPresent(String nomAttr, String prenomAttr, DateSimple dateAttr){
        boolean b = false;
        
        c = new ConnectionBD();

        try {

            ResultSet resul;
            Statement ins = c.connexion.createStatement();
            resul = ins.executeQuery("SELECT * FROM dpi");
            while (resul.next()) {
                
                nom = resul.getString("nom");
                prenom = resul.getString("prenom");
                
                if(nom.equalsIgnoreCase(nomAttr)){
                    if(prenom.equalsIgnoreCase(prenomAttr)){
                        String d = resul.getString("dateNaissance");
                        dateNaissance = new DateSimple(d.substring(0, 2), d.substring(3, 5), d.substring(6, 10));
                        if(d.equalsIgnoreCase(dateAttr.toString())){
                            b = true;
                        }
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("erreur DAODPI (consulterListeDPI): " + e);
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

}
