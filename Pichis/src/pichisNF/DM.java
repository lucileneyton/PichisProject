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
    ArrayList<Prescription> prescriptions;
    ArrayList<Observation> observations;
    ArrayList<Prestations> prestations;


    public DM(){
        this.prescriptions = new ArrayList<Prescription>();
        this.observations = new ArrayList<Observation>();
        this.prestations = new ArrayList<Prestations>();
    }

    public ArrayList<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(ArrayList<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public ArrayList<Observation> getObservations() {
        return observations;
    }

    public void setObservations(ArrayList<Observation> observations) {
        this.observations = observations;
    }

    public void ajouterPrescription(Prescription pres){
        this.prescriptions.add(pres);
    }
    
    public void ajouterObservation(Observation obs){
        this.observations.add(obs);
    }

    public ArrayList<Prestations> getPrestations() {
        return prestations;
    }
    
    public void ajouterPrestation (Prestations pr){
        this.prestations.add(pr);
    }
}
