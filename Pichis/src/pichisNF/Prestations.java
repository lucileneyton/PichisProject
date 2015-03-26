package pichisNF;

public class Prestations implements Comparable {

    private String naturePrestation;
    private Medecin demandeur;
    private DPI patient;
    private Resultat resultat;
    private DateSimple date;
    private String idPrestation;

    /**
     * Premier constructeur de la classe Prestations prenant en compte l'id de
     * la prestation
     *
     * @param naturePrestation
     * @param demandeur
     * @param patient
     * @param resultat
     * @param date
     * @param idPrestation
     */
    public Prestations(String naturePrestation, Medecin demandeur, DPI patient, Resultat resultat, DateSimple date, String idPrestation) {
        this.naturePrestation = naturePrestation;
        this.demandeur = demandeur;
        this.patient = patient;
        this.resultat = resultat;
        this.date = date;
        this.idPrestation = idPrestation;
    }

    /**
     * Deuxième constructeur ne prenant pas en compte l'id de la prestation
     *
     * @param naturePrestation
     * @param demandeur
     * @param patient
     * @param resultat
     * @param date
     */
    public Prestations(String naturePrestation, Medecin demandeur, DPI patient, Resultat resultat, DateSimple date) {
        this.naturePrestation = naturePrestation;
        this.demandeur = demandeur;
        this.patient = patient;
        this.resultat = resultat;
        this.date = date;
    }

    /**
     * Méthode permettant l'accès au dossier patient informatisé (dpi) du
     * patient par d'autres classes
     *
     * @return DPI
     */
    public DPI getPatient() {
        return patient;
    }

    /**
     * Méthode permettant l'accès à la nature de la prestation par d'autres
     * classes
     *
     * @return String naturePrestation
     */
    public String getNaturePrestation() {
        return naturePrestation;
    }

    /**
     * Méthode permettant l'accès au médein qui a demandé la prestation par
     * d'autres classes
     *
     * @return Medecin demandeur
     */
    public Medecin getDemandeur() {
        return demandeur;
    }

    /**
     * Méthode permettant l'accès au résultat de la prestation par d'autres
     * classes
     *
     * @return Resultat
     */
    public Resultat getResultat() {
        return resultat;
    }

    /**
     * Méthode permettant la modification du résultat (initialement égal à null)
     * après réalisation de la prestation
     *
     * @param resultat
     */
    public void setResultat(Resultat resultat) {
        this.resultat = resultat;
    }

    /**
     * Méthode permettant l'accès à la date de demande de la prestation par
     * d'autres classes
     *
     * @return DateSimple
     */
    public DateSimple getDate() {
        return date;
    }

    /**
     * Méthode permettant l'accès à l'id de la prestation par d'autres classes
     *
     * @return idPrestation
     */
    public String getIdPrestation() {
        return idPrestation;
    }

    /**
     * Méthode permettant l'affichage de la prestation avec sa date de demande
     * et sa nature dans les listes de l'interface
     *
     * @return String prestation
     */
    public String toString() {
        return "Demande du " + date.toString() + " / Prestation : " + this.naturePrestation;
    }

    /**
     * Methode permettant de classer les prestations par date
     *
     * @param o
     * @return int
     */
    public int compareTo(Object o) {
        Prestations p = (Prestations) o;
        DateSimple d = p.getDate();
        int resultat = this.date.compareTo(d);

        return resultat;
    }

}
