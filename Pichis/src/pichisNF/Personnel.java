package pichisNF;

public class Personnel {

    private String id;
    private String nom;
    private String prenom;
    private String motDePasse;

    /**
     * Constructeur de la classe Personnel
     *
     * @param id
     * @param nom
     * @param prenom
     * @param motDePasse
     */
    public Personnel(String id, String nom, String prenom, String motDePasse) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.motDePasse = motDePasse;

    }

    /**
     * Méthode permettant l'accès à l'id du personnel par d'autres classes
     *
     * @return String id
     */
    public String getId() {
        if (this.equals(null)) {
            return "NULL";
        } else {
            return id;
        }
    }

    /**
     * Méthode permettant l'accès au nom du personnel par d'autres classes
     *
     * @return String nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Méthode permettant l'accès au prénom du personnel par d'autres classes
     *
     * @return String
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Méthode permettant l'accès au mot de passe du personnel par d'autres
     * classes
     *
     * @return String motDePasse
     */
    public String getMotDePasse() {
        return motDePasse;
    }

}
