package pichisNF;

public class Medecin extends Personnel {

    private Services specialite;

    /**
     * Constructeur de la classe médecin
     *
     * @param id
     * @param nom
     * @param prenom
     * @param motDePasse
     * @param specialite
     */
    public Medecin(String id, String nom, String prenom, String motDePasse, Services specialite) {
        super(id, nom, prenom, motDePasse);
        this.specialite = specialite;

    }

    /**
     * Méthode permettant l'accès au service du médecin par d'autres classes
     *
     * @return Services
     */
    public Services getSpecialite() {
        return specialite;
    }

    /**
     * Méthode permettant l'affichage du nom et prénom du médecin
     *
     * @return String nom + prenom
     */
    public String toString() {
        return super.getNom().toUpperCase() + " " + super.getPrenom();
    }

}
