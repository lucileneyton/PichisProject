package pichisNF;

public class Sejour {

    private String numeroSejour;
    private DateSimple dateEntree;
    private DateSimple dateSortie;
    private Medecin PHResponsable;
    private Localisation localisation;

    /**
     * Constructeur de la classe sejour qui génère un numéro de séjour et qui ne
     * possède pas de dateSortie
     *
     * @param dma
     * @param dateEntree
     * @param PHResponsable
     * @param localisation
     */
    public Sejour(DMA dma, DateSimple dateEntree, Medecin PHResponsable, Localisation localisation) {
        this.numeroSejour = fonctions.genererNumeroSejour(dateEntree);
        this.dateEntree = dateEntree;
        this.dateSortie = null;
        this.PHResponsable = PHResponsable;
        this.localisation = localisation;
    }

    /**
     * Constructeur de la classe séjour qui ne possède pas de dateSortie
     *
     * @param dma
     * @param numeroSejour
     * @param dateEntree
     * @param PHResponsable
     * @param localisation
     */
    public Sejour(DMA dma, String numeroSejour, DateSimple dateEntree, Medecin PHResponsable, Localisation localisation) {
        this.numeroSejour = numeroSejour;
        this.dateEntree = dateEntree;
        this.dateSortie = null;
        this.PHResponsable = PHResponsable;
        this.localisation = localisation;
    }

    /**
     * Constructeur de la classe séjour qui prend un numéroSéjour et dateSortie
     *
     * @param dma
     * @param numeroSejour
     * @param dateEntree
     * @param dateSortie
     * @param PHResponsable
     * @param localisation
     */
    public Sejour(DMA dma, String numeroSejour, DateSimple dateEntree, DateSimple dateSortie, Medecin PHResponsable, Localisation localisation) {
        this.numeroSejour = numeroSejour;
        this.dateEntree = dateEntree;
        this.dateSortie = dateSortie;
        this.PHResponsable = PHResponsable;
        this.localisation = localisation;
    }

    /**
     * Constructeur de la classe séjour qui prend un numéro de séjour et une
     * date de sortie
     *
     * @param dma
     * @param dateEntree
     * @param dateSortie
     * @param PHResponsable
     * @param localisation
     */
    public Sejour(DMA dma, DateSimple dateEntree, DateSimple dateSortie, Medecin PHResponsable, Localisation localisation) {
        this.numeroSejour = fonctions.genererNumeroSejour(dateEntree);
        this.dateEntree = dateEntree;
        this.dateSortie = dateSortie;
        this.dateSortie = null;
        this.PHResponsable = PHResponsable;
        this.localisation = localisation;
    }

    /**
     * Méthode permettant l'accès de la date d'entrée par d'autres classes
     *
     * @return DateSimple dateEntree
     */
    public DateSimple getDateEntree() {
        return dateEntree;
    }

    /**
     * Méthode permettant l'accès de la date de sortie par d'autres classes
     *
     * @return DateSimple dateSortie
     */
    public DateSimple getDateSortie() {
        return dateSortie;
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
     * Méthode permettant l'accès au PH responsable par d'autres classes
     *
     * @return Medecin
     */
    public Medecin getPHResponsable() {
        return PHResponsable;
    }

    /**
     * Méthode permettant l'accès de la localisation aux autres classes
     *
     * @return Localisation
     */
    public Localisation getLocalisation() {
        return localisation;
    }

    /**
     * Méthode permettant la modification de la localisation du patient dans son
     * séjour
     *
     * @param localisation
     */
    public void setLocalisation(Localisation localisation) {
        this.localisation = localisation;
    }

    /**
     * Méthode permettant l'affichage du numéro de séjour
     *
     * @return String numeroSejour
     */
    public String toString() {
        return this.numeroSejour;

    }

}
