package pichisNF;

import pichisBD.DAOMaintenance;

public class Maintenance extends Personnel {

    /** Constructeur de la classe Maintenance
     * 
     * @param id
     * @param nom
     * @param prenom
     * @param motDePasse 
     */
    public Maintenance(String id, String nom, String prenom, String motDePasse) {
        super(id, nom, prenom, motDePasse);
    }

    /** Méthode permettant l'identification du personnel de maintenance à la connexion
     * 
     * @param id
     * @param mdp
     * @return boolean
     */
    public boolean identification(String id, String mdp) {

        DAOMaintenance daoMaintenance;
        daoMaintenance = new DAOMaintenance();
        Maintenance maintenance;

        maintenance = daoMaintenance.MaintenanceParID(id);
        String motDePasse = maintenance.getMotDePasse();

        if (maintenance != null) {

            if (mdp.equals(motDePasse)) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }

    /** Méthode permettant l'affichage du nom et du prénom du personnel administratif
     * 
     * @return String nom + prenom
     */
    public String toString() {
        return super.getNom().toUpperCase() + " " + super.getPrenom();
    }
}
