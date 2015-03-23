/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisNF;

import java.util.Calendar;

/**
 *
 * @author Johann
 */
public class Prestations {

    private String naturePrestation;
    private Medecin demandeur;
    private DPI patient;
    private Resultat resultat;
    private DateSimple date;

    public Prestations(String naturePrestation, Medecin demandeur, DPI patient, Resultat resultat, DateSimple date) {
        this.naturePrestation = naturePrestation;
        this.demandeur = demandeur;
        this.patient = patient;
        this.resultat = resultat;
        this.date = date;
    }

    public DPI getPatient() {
        return patient;
    }

    public String getNaturePrestation() {
        return naturePrestation;
    }

    public Medecin getDemandeur() {
        return demandeur;
    }

    public Resultat getResultat() {
        return resultat;
    }

    public void setResultat(Resultat resultat) {
        this.resultat = resultat;
    }

    public DateSimple getDate() {
        return date;
    }

    public String toString2() {
        return "Nom :" + patient.getNom().toUpperCase() + "      Prestation : " + this.naturePrestation + "      Date : " + date.toString();
    }

    public String toString() {
        return "Demande du " + date.toString();
    }

}
