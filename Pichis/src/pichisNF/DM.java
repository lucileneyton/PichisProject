package pichisNF;

import java.util.ArrayList;

public class DM {

    private ArrayList<Prescription> prescriptions;
    private ArrayList<Observation> observations;
    private ArrayList<Prestations> prestations;

    /**
     * Constructeur de la classe Dossier Médical (DM)
     */
    public DM() {
        this.prescriptions = new ArrayList<Prescription>();
        this.observations = new ArrayList<Observation>();
        this.prestations = new ArrayList<Prestations>();
    }

    /**
     * Méthode permettant l'accès de la liste de prescriptions par d'autres
     * classes
     *
     * @return ArrayList prescriptions
     */
    public ArrayList<Prescription> getPrescriptions() {
        return prescriptions;
    }

    /**
     * Méthode permettant l'accès de la liste d'observations par d'autres
     * classes
     *
     * @return ArrayList observations
     */
    public ArrayList<Observation> getObservations() {
        return observations;
    }

    /**
     * Méthode permettant l'ajout d'une prescription à la liste de prescriptions
     *
     * @param prescription
     */
    public void ajouterPrescription(Prescription prescription) {
        this.prescriptions.add(prescription);
    }

    /**
     * Méthode permettant l'ajout d'une observation à la liste d'observations
     *
     * @param observation
     */
    public void ajouterObservation(Observation observation) {
        this.observations.add(observation);
    }

    /**
     * Méthode permettant l'accès de la liste de prestations par d'autres
     * classes
     *
     * @return ArrayList prestations
     */
    public ArrayList<Prestations> getPrestations() {
        return prestations;
    }

    /**
     * Méthode permettant l'ajout d'une prescription à la liste de prescriptions
     *
     * @param prestation
     */
    public void ajouterPrestation(Prestations prestation) {
        this.prestations.add(prestation);
    }
}
