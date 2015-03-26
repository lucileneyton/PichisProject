package pichisNF;

import pichisBD.DAOAdministratif;

public class Administratif extends Personnel {

    /**
     * Constructeur de la classe Amnistratif
     *
     * @param id
     * @param nom
     * @param prenom
     * @param motDePasse
     */
    public Administratif(String id, String nom, String prenom, String motDePasse) {
        super(id, nom, prenom, motDePasse);
    }

    /**
     * Méthode permettant l'identification d'un personnel administratif à la
     * connexion
     *
     * @param id
     * @param mdp
     * @return boolean
     */
    public boolean identification(String id, String mdp) {

        DAOAdministratif daoAdministratif;
        daoAdministratif = new DAOAdministratif();
        Administratif administratif;

        administratif = daoAdministratif.administratifParID(id);
        String motDePasse = administratif.getMotDePasse();

        if (administratif != null) {

            if (mdp.equals(motDePasse)) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }

    /**
     * Méthode permettant l'affichage du nom et prénom du personnel
     * administratif
     *
     * @return String
     */
    public String toString() {
        return super.getNom().toUpperCase() + " " + super.getPrenom();
    }
}
