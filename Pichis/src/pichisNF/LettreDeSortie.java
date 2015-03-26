package pichisNF;

public class LettreDeSortie {

    private String numeroSejour;
    private DateSimple date;
    private String contenu;

    /**
     * Construteur de la classe LettreDeSortie
     *
     * @param numeroSejour
     * @param date
     * @param contenu
     */
    public LettreDeSortie(String numeroSejour, DateSimple date, String contenu) {
        this.numeroSejour = numeroSejour;
        this.date = date;
        this.contenu = contenu;
    }

    /**
     * Méthode permettant l'accès au numéro de séjour par d'autres classes
     *
     * @return String numeroSejour
     */
    public String getNumeroSejour() {
        return numeroSejour;
    }

    /**
     * Méthode permettant l'accès à la date par d'autres classes
     *
     * @return date
     */
    public DateSimple getDate() {
        return date;
    }

    /**
     * Méthode permettant l'accès au contenu de la lettre par d'autres classes
     *
     * @return contenu
     */
    public String getContenu() {
        return contenu;
    }

    /**
     * Méthode de test permettant d'afficher la lettre de sortie
     *
     * @return String lettre
     */
    public String toString() {
        String lettre = "    ----- Lettre de sortie -----";
        if (date == null || contenu == null) {
            lettre = lettre + "";
        } else {
            lettre = lettre + "\n     date : " + this.date
                    + "\n     contenu : " + this.contenu;
        }

        return lettre;

    }

}
