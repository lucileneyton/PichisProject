package pichisNF;

public enum TypeServices {

    CLINIQUE("clinique"),
    MEDICO_TECHNIQUE("medicoTechnique");

    private String typeServices;

    /**
     * COnstructeur de la classe TypeServices
     *
     * @param typeServices
     */
    private TypeServices(String typeServices) {
        this.typeServices = typeServices;
    }

    /**
     * Méthode permettant l'affichage du type de services
     *
     * @return String typeServices
     */
    public String toString() {
        return this.typeServices;
    }

}
