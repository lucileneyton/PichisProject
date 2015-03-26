package pichisNF;

public class Observation {

    private DateSimple date;
    private String description;
    private Medecin medecin;

    /**
     * Constructeur de la classe Observation
     *
     * @param date
     * @param description
     * @param medecin
     */
    public Observation(DateSimple date, String description, Medecin medecin) {
        this.date = date;
        this.description = description;
        this.medecin = medecin;
    }

    /**
     * Méthode permettant l'accès au médecin ayant réalisé l'observation par
     * d'autres classes
     *
     * @return Medecin
     */
    public Medecin getMedecin() {
        return medecin;
    }

    /**
     * Méthode permettant l'accès à la date à laquelle a été réalisée
     * l'observation par d'autres classes
     *
     * @return DateSimple
     */
    public DateSimple getDate() {
        return date;
    }

    /**
     * Méthode permettant l'accès à la description de l'observation par d'autres
     * classes
     *
     * @return String description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Méthode permettant l'affichage de l'observation avec sa date dans les
     * listes de l'interface
     *
     * @return String observation
     */
    public String toString() {
        return "Observation du " + this.getDate();
    }

}
