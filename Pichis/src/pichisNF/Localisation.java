package pichisNF;

public class Localisation {

    private Services service;
    private String placement;
    private String numeroChambre;

    /**
     * Constructeur de la classe Localisation
     *
     * @param service
     * @param numeroChambre
     * @param placement
     */
    public Localisation(Services service, String numeroChambre, String placement) {
        this.service = service;
        this.placement = placement;
        this.numeroChambre = numeroChambre;
    }

    /**
     * Méthode permettant l'accès au contenu du placement du patient (porte,
     * fenêtre ou chambre unique) par d'autres classes
     *
     * @return String placement
     */
    public String getPlacement() {
        return placement;
    }

    /**
     * Méthode permettant de modifier le placement du patient
     *
     * @param placement
     */
    public void setPlacement(String placement) {
        this.placement = placement;
    }

    /**
     * Méthode permettant l'accès au numéro de chambre du patient par d'autres
     * classes
     *
     * @return String numeroChambre
     */
    public String getNumeroChambre() {
        return numeroChambre;
    }

    /**
     * Méthode permettant de modifier le numéro de chambre du patient
     *
     * @param numeroChambre
     */
    public void setNumeroChambre(String numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    /**
     * Méthode permettant l'accès au service dans lequel se trouve le patient
     * par d'autres classes
     *
     * @return Services
     */
    public Services getService() {
        return service;
    }

    /**
     * Méthode permettant de modifier le service dans lequel se trouve le
     * patient
     *
     * @param service
     */
    public void setService(Services service) {
        this.service = service;
    }

    /**
     * Méthode permettant d'afficher le service dans lequel se trouve le patient
     *
     * @return String service
     */
    public String toString() {
        return service.toString();
    }
}
