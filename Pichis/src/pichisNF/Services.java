package pichisNF;

public class Services {

    private TypeServices type;
    private Specialite specialite;

    /**
     * Constructeur de la classe Services
     *
     * @param type
     * @param specialite
     */
    public Services(TypeServices type, Specialite specialite) {
        this.type = type;
        this.specialite = specialite;
    }

    /**
     * Méthode permettant l'accès au type de service (clinique ou
     * médico-technique) par d'autres classes
     *
     * @return TypesServices
     */
    public TypeServices getType() {
        return type;
    }

    /**
     * Méthode permettant l'accès à la spécialité du service (cardiologie,
     * neurologie...) par d'autres classes
     *
     * @return Specialite
     */
    public Specialite getSpecialite() {
        return specialite;
    }

    /**
     * Méthode permettant l'affichage de la spécialité d'un service
     *
     * @return String specialite
     */
    public String toString() {
        return specialite.toString();
    }
}
