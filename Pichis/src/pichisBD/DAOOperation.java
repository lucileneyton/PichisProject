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
 * Data access object de la classe Operation
 *
 */
public class DAOOperation {

    public ConnectionBD c;

    /**
     * Méthode permettant d'ajouter une opération dans la base de données
     *
     * @param id le numéro de l'identification
     * @param numSejour le numéro du séjour associé à l'opération
     * @param date la date de l'opération
     * @param operation le détail de l'opération
     * @param auteur le nom de l'auteur
     */
    public void ajoutOperation(String id, String numSejour, String date, String operation, String auteur) {
        Statement ins;
        c = new ConnectionBD();

        try {
            ins = c.connexion.createStatement();
            ins.executeUpdate("INSERT INTO operations(id, numsejour, date,operation, medecin)" + "VALUES ('" + id + "','" + numSejour + "','" + date + "','" + operation + "','" + auteur + "')");

        } catch (SQLException ex) {
            System.out.println("Erreur lors de la création de l'opération" + ex);
        } finally {
            if (c != null) {
                try {
                    c.connexion.close();
                } catch (SQLException e) {
                    System.out.println("Erreur DAOOperation(ajoutOperation) :" + e);
                }
            }

        }
    }

    /**
     * Méthode retournant la liste des opérations pour un séjour
     *
     * @param numSejour le numéro du séjour
     * @return boolean
     */
    public ArrayList<Operation> operationSejour(String numSejour) {

        c = new ConnectionBD();
        ArrayList<Operation> listeOperations = new ArrayList<Operation>();
        String auteur;
        DateSimple date = null;
        String operation;

        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();

            resul = ins.executeQuery("SELECT * FROM operations WHERE numsejour='" + numSejour + "'");

            while (resul.next()) {

                auteur = resul.getString("medecin");
                DAOMedecin daom = new DAOMedecin();

                operation = resul.getString("operation");

                String d = resul.getString("date");

                if (d != null) {
                    if (d.length() <= 11) {
                        date = new DateSimple(d.substring(0, 2), d.substring(3, 5), d.substring(6, 10));
                    } else {
                        date = new DateSimple(d.substring(0, 2), d.substring(3, 5), d.substring(6, 10), d.substring(13, 15), d.substring(16, 18));
                    }
                }
                Operation o = new Operation(numSejour, date, operation, auteur);

                listeOperations.add(o);

            }

        } catch (SQLException e) {
            System.out.println("erreur DAOOperation (operationSejour): " + e);
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
