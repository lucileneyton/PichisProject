/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisNF;

import pichisBD.DAOMaintenance;

/**
 *
 * @author Johann
 */
public class Maintenance extends Personnel {

    public Maintenance(String id, String nom, String prenom, String motDePasse) {
        super(id, nom, prenom, motDePasse);
    }

    @SuppressWarnings("null")
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

    public String toString() {
        return super.getNom().toUpperCase() + " " + super.getPrenom();
    }
}
