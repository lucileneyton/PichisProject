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
    ArrayList<LettreDeSortie> lettresDeSortie;
    ArrayList<Operation> operations;
    ArrayList<Resultat> resultats;


    public DM(){
        this.prescriptions = new ArrayList<Prescription>();
        this.observations = new ArrayList<Observation>();
        this.lettresDeSortie = new ArrayList<LettreDeSortie>();
        this.resultats = new ArrayList<Resultat>();
        this.operations = new ArrayList<Operation>();
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

    public ArrayList<LettreDeSortie> getLettresDeSortie() {
        return lettresDeSortie;
    }

    public void setLettresDeSortie(ArrayList<LettreDeSortie> lettresDeSortie) {
        this.lettresDeSortie = lettresDeSortie;
    }
    
    public ArrayList<Operation> getOperations() {
        return operations;
    }

    public void setOperations(ArrayList<Operation> operations) {
        this.operations = operations;
    }

    public ArrayList<Resultat> getResultats() {
        return resultats;
    }

    public void setResultats(ArrayList<Resultat> resultats) {
        this.resultats = resultats;
    }
    
    public void ajouterPrescription(Prescription pres){
        this.prescriptions.add(pres);
    }
    
    public void ajouterObservation(Observation obs){
        this.observations.add(obs);
    }
    
    public void ajouterLettreDeSortie(LettreDeSortie l){
        this.lettresDeSortie.add(l);
    }
    
    public void ajouterOperation(Operation op){
        this.operations.add(op);
    }
    
    public void ajouteResultat(Resultat res){
        this.resultats.add(res);
    }
}
