/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisNF;

import java.util.ArrayList;

/**
 *
 * @author molit_000
 */
public class DM {
    ArrayList<Prescriptions> prescriptions;
    ArrayList<Observations> observations;
    ArrayList<LettresDeSortie> lettresDeSortie;
    
    public DM(){
        this.prescriptions = new ArrayList<Prescriptions>();
        this.observations = new ArrayList<Observations>();
        this.lettresDeSortie = new ArrayList<LettresDeSortie>();
    }

    public ArrayList<Prescriptions> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(ArrayList<Prescriptions> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public ArrayList<Observations> getObservations() {
        return observations;
    }

    public void setObservations(ArrayList<Observations> observations) {
        this.observations = observations;
    }

    public ArrayList<LettresDeSortie> getLettresDeSortie() {
        return lettresDeSortie;
    }

    public void setLettresDeSortie(ArrayList<LettresDeSortie> lettresDeSortie) {
        this.lettresDeSortie = lettresDeSortie;
    }
    
    
}
