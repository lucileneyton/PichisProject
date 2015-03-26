package pichisNF;

import java.util.ArrayList;
import java.util.Calendar;
import pichisBD.DAOResultat;
import pichisBD.DAOSejour;

public class fonctions {

    /**
     * Méthode permettant de savoir si une cha^ne de caractère est numérique
     * (renvoie true) ou non (renvoie false)
     *
     * @param str
     * @return boolean
     */
    public static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    /**
     * Méthode permettant la recherche d'un élément dans une liste
     *
     * @param liste
     * @param nomElement
     * @return ArrayList
     */
    public static ArrayList<Object> recherche(ArrayList<Object> liste, String nomElement) {
        ArrayList<Object> listeFin = new ArrayList<Object>();

        for (int i = 0; i < liste.size(); i++) {

            if (nomElement.length() <= liste.get(i).toString().length()) {

                if (liste.get(i).toString().substring(0, nomElement.length()).toLowerCase().equals(nomElement.toLowerCase())) {

                    listeFin.add(liste.get(i));
                }
            } else {
                if (liste.get(i).toString().toLowerCase().equals(nomElement.substring(0, liste.get(i).toString().length()).toLowerCase())) {

                    listeFin.add(liste.get(i));
                }
            }
        }
        return listeFin;
    }

    /**
     * Méthode permettant la génération d'un numéro de séjour en prenant les
     * deux derniers chiffres de l'année de la date d'entrée, son mois et le
     * nombre de séjour dans la base de données
     *
     * @param dateEntree
     * @return String numSejour
     */
    public static String genererNumeroSejour(DateSimple dateEntree) {
        String numSejour = "";
        DAOSejour daoSejour = new DAOSejour();

        String nbSejours = daoSejour.getNombreSejoursTotal();
        numSejour = dateEntree.get2derniersChiffresAnnee() + dateEntree.getMois() + nbSejours;
        return numSejour;
    }

    /**
     * Méthode permettant la génération d'un id pour les résultats en ajoutant
     * 100 au nombre total de résultats
     *
     * @return String idResultat
     */
    public static String genererIdResultat() {
        int idResultat1 = 0;
        DAOResultat daoResultat = new DAOResultat();

        int nbResultat = daoResultat.getNombreResultatTotal();
        idResultat1 = nbResultat + 100;
        String idResultat2 = Integer.toString(idResultat1);
        return idResultat2;
    }

    /**
     * Méthode permettant de renvoyer la datee actuelle avec les heures et les
     * minutes
     *
     * @return DateSimple
     */
    public static DateSimple renvoieDateActuelle() {
        Calendar ca = Calendar.getInstance();
        String minute = "" + ca.getTime().getMinutes();
        String heure = "" + ca.getTime().getHours();
        int rangDuMois = ca.getTime().getMonth() + 1;
        String mois = "" + rangDuMois;
        String jour = "" + ca.getTime().getDate();

        int anne = 1900 + ca.getTime().getYear();
        String annee = "" + anne;
        if (ca.getTime().getDate() < 10) {
            jour = "0" + ca.getTime().getDate();
        }
        if (ca.getTime().getMinutes() < 10) {
            minute = "0" + ca.getTime().getMinutes();
        }
        if (ca.getTime().getHours() < 10) {
            heure = "0" + ca.getTime().getHours();
        }
        if (ca.getTime().getMonth() < 10) {
            mois = "0" + rangDuMois;
        }

        DateSimple date = new DateSimple(jour, mois, annee, heure, minute);

        return date;
    }
}
