package pichisNF;

public class Operation {

    private DateSimple date;
    private String operation;
    private String numeroSejour;
    private String auteur;

    /**
     * Constructeur de la classe Operation
     *
     * @param numeroSejour
     * @param date
     * @param operation
     * @param auteur
     */
    public Operation(String numeroSejour, DateSimple date, String operation, String auteur) {
        this.date = date;
        this.operation = operation;
        this.numeroSejour = numeroSejour;
        this.auteur = auteur;
    }

    /**
     * Méthode permettant l'accès à l'auteur de la prestation (personnel
     * infirmier) par d'autres classes
     *
     * @return String auteur
     */
    public String getAuteur() {
        return auteur;
    }

    /**
     * Méthode permettant l'accès au numéro de séjour du patient par d'autres
     * classes
     *
     * @return String numeroSejour
     */
    public String getNumeroSejour() {
        return numeroSejour;
    }

    /**
     * Méthode permettant l'accès à la date à laquelle a été réalisée
     * l'opération sur le patient par d'autres classes
     *
     * @return DateSimple
     */
    public DateSimple getDate() {
        return date;
    }

    /**
     * Méthode permettant l'accès à la description de l'opération réalisée sur
     * le patient par d'autres classes
     *
     * @return String operation
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Méthode permettant l'affichage des opérations avec leur date de
     * réalisation dans les listes de l'interface
     *
     * @return String
     */
    public String toString() {
        return "Réalisée le : " + this.date.toString();
    }
}
