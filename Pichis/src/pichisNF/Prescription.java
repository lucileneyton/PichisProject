package pichisNF;

public class Prescription {

    private DateSimple date;
    private String prescriptions;
    private Medecin medecin;

    /**
     * Constructeur de la classe Prescription
     *
     * @param date
     * @param prescriptions
     * @param medecin
     */
    public Prescription(DateSimple date, String prescriptions, Medecin medecin) {
        this.date = date;
        this.prescriptions = prescriptions;
        this.medecin = medecin;
    }

    /**
     * Méthode permettant l'accès à la date de la prescrition par d'autres
     * classes
     *
     * @return DateSimple
     */
    public DateSimple getDate() {
        return date;
    }

    /**
     * Méthode permettant l'accès à la description de la prescription par
     * d'autres classes
     *
     * @return String prescription
     */
    public String getPrescriptions() {
        return prescriptions;
    }

    /**
     * Méthode permettant l'accès au medecin ayant fait la prescription par
     * d'autres classes
     *
     * @return Medecin
     */
    public Medecin getMedecin() {
        return medecin;
    }

    /**
     * Méthode permettant l'affichage des informations de la prescription avec
     * la date d'édition dans les listes de l'interface
     *
     * @return String prescription
     */
    public String toString() {
        return "Editée le " + this.date.toString();
    }

}
