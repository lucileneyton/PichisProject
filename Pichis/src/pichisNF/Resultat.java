package pichisNF;

public class Resultat {

    private DateSimple date;
    private String descriptions;
    private Medecin medecin;

    /**
     * Constructeur de la classe Résultat
     *
     * @param date
     * @param descriptions
     * @param medecin
     */
    public Resultat(DateSimple date, String descriptions, Medecin medecin) {
        this.date = date;
        this.descriptions = descriptions;
        this.medecin = medecin;
    }

    /**
     * Méthode permettant l'accès au médecin ayant édité le résultat par
     * d'autres classes
     *
     * @return Medecin
     */
    public Medecin getMedecin() {
        return medecin;
    }

    /**
     * Méthode permettant l'accès à la date d'édition du résultat par d'autres
     * classes
     *
     * @return DateSimple
     */
    public DateSimple getDate() {
        return date;
    }

    /**
     * Méthode permettant l'accès à la description du résultat par d'autres
     * classes
     *
     * @return String description
     */
    public String getDescriptions() {
        return descriptions;
    }

}
