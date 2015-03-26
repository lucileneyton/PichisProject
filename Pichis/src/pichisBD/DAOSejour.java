/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import pichisNF.DMA;
import pichisNF.DPI;
import pichisNF.DateSimple;
import pichisNF.Localisation;
import pichisNF.Medecin;
import pichisNF.Sejour;

/**
 * Data access object de la classe Sejour
 *
 */
public class DAOSejour {

    public ConnectionBD c;

    /**
     * Fonction permettant de retourner la liste des séjours d'un patient
     *
     * @param patient le DPI d'un patient
     * @return DMA
     */
    public DMA consulterListeSejourParPatient(DPI patient) {

        String num;
        DateSimple dateE;
        DateSimple dateS;
        Medecin resp;
        Localisation loc;
        DMA dma = new DMA();
        c = new ConnectionBD();

        DAOMedecin daom = new DAOMedecin();
        DAOLocalisation daol = new DAOLocalisation();

        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();

            resul = ins.executeQuery("SELECT * FROM sejour WHERE sejour.ipp= " + patient.getIpp() + ";");

            while (resul.next()) {

                num = resul.getString("id");
                String de = resul.getString("dateentree");
                String ds = resul.getString("datesortie");
                dateE = new DateSimple(de.substring(0, 2), de.substring(3, 5), de.substring(6, 10));

                resp = daom.medecinResponsable(num);
                loc = daol.localisationParNumeroDeSejour(num);

                Sejour s = null;

                if (ds == null || ds.equalsIgnoreCase("null") == true) {
                    s = new Sejour(dma, num, dateE, resp, loc);
                } else {
                    dateS = new DateSimple(ds.substring(0, 2), ds.substring(3, 5), ds.substring(6, 10));
                    s = new Sejour(dma, num, dateE, dateS, resp, loc);
                }

                dma.ajouterSejour(s);

            }

        } catch (SQLException e) {
            System.out.println("erreur DAOSejour (consulterListeSejourParPatient): " + e);
        } finally {
            if (c != null) {
                try {
                    c.connexion.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }

        }

        return dma;
    }

    /**
 * Méthode permettant d'ajouter une lettre de sortie pour un séjour
 * @param idSejour le numéro du séjour pour lequel on veut éditer une lettre de sortie
 * @return boolean
 */
    public boolean setLettre(String idSejour) {

        boolean b = false;
        int resul;

        try {

            if (!lettreDeSortie(idSejour)) {
                c = new ConnectionBD();
                Statement ins = c.connexion.createStatement();
                resul = ins.executeUpdate("UPDATE sejour SET lettre='true' WHERE id=" + "'" + idSejour + "' ;");

                b = true;
            } else {
                b = false;
            }

        } catch (SQLException e) {
            System.out.println("erreur DAOSejour (setLettre): " + e);
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
 * Méthode permettant d'ajouter un séjour dans la base de données
 * @param sejour le séjour concerné
 * @param dpi le DPI du patient correspondant
 * 
 */
    public void ajout(Sejour sejour, DPI dpi) {
        Statement ins;
        Statement verif;
        ResultSet res;
        DAOServices daoServices = new DAOServices();
        c = new ConnectionBD();

        try {
            ins = c.connexion.createStatement();
            verif = c.connexion.createStatement();

            res = verif.executeQuery("SELECT id FROM sejour WHERE id='" + sejour.getNumeroSejour() + "'");
            if (res.getRow() != 0) {
                System.out.println("Le sejour existe déjà dans la base");
            } else {
                String idService = daoServices.idParService(sejour.getLocalisation().getService());
                ins.executeUpdate("INSERT INTO sejour(ipp, id, dateentree, responsable, loc, datesortie, numerochambre, placement,lettre)" + "VALUES ('" + dpi.getIpp() + "','" + sejour.getNumeroSejour() + "','" + sejour.getDateEntree().toString() + "','" + sejour.getPHResponsable().getId() + "','" + idService + "','" + sejour.getDateSortie() + "','" + sejour.getLocalisation().getNumeroChambre() + "','" + sejour.getLocalisation().getPlacement() + "','" + "false" + "')");
                }

        } catch (SQLException ex) {
            System.out.println("Erreur DAOSejour (ajout)" + ex);
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
 * Méthode permettant de savoir si un séjour possède ou non une lettre de sortie
 * @param idSejour l'identifiant du séjour concerné
 * @return boolean
 */
    public boolean lettreDeSortie(String idSejour) {
        c = new ConnectionBD();
        boolean b = false;

        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();

            resul = ins.executeQuery("SELECT * FROM sejour WHERE id='" + idSejour + "'");

            while (resul.next()) {

                String lettre = resul.getString("lettre");

                if (lettre.equals("true")) {
                    b = true;
                }

            }

        } catch (SQLException e) {
            System.out.println("erreur DAOSejour(lettreDeSortie): " + e);
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
 *
 * Méthode retournant le nombre de séjour de la base
 * @return String
 */
    public String getNombreSejoursTotal() {
        String nbSejours = "";
        c = new ConnectionBD();

        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();

            resul = ins.executeQuery("SELECT COUNT(*) FROM sejour;");

            if (resul.next()) {
                nbSejours = resul.getString("COUNT(*)");
            }

        } catch (SQLException e) {
            System.out.println("erreur DAOSejour (getNombreSejoursTotal): " + e);
        } finally {
            if (c != null) {
                try {
                    c.connexion.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }

        }

        return nbSejours;
    }

    /**
 * Méthode permettant l'ajout d'une date de sortie à un séjour
 * @param idSejour l'identifiant du séjour 
 */
    public void ajoutDateSortie(String idSejour) {
        c = new ConnectionBD();

        int jourTemp = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int moisTemp = Calendar.getInstance().get((Calendar.getInstance().get(Calendar.MONTH))) + 1;
        int anneeTemp = Calendar.getInstance().get(Calendar.YEAR);

        String jour = Integer.toString(jourTemp);
        String mois = Integer.toString(moisTemp);
        String annee = Integer.toString(anneeTemp);

        DateSimple dateSortie = new DateSimple(jour, mois, annee);

        try {
            int resul;

            Statement ins = c.connexion.createStatement();
            resul = ins.executeUpdate("UPDATE sejour SET datesortie=" + "'" + dateSortie + "'" + " WHERE id=" + "'" + idSejour + "' ;");

        } catch (SQLException e) {
            System.out.println("erreur DAOSejour (ajoutDateSortie): " + e);
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
