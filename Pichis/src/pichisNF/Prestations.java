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
    private Medecin prestataire;
    private DPI patient;
    private Resultat resultat;
    private Calendar date;

    public Prestations(String naturePrestation, Medecin prestataire, DPI patient, Resultat resultat, Calendar date) {
        this.naturePrestation = naturePrestation;
        this.prestataire = prestataire;
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

    public Medecin getPrestataire() {
        return prestataire;
    }

    public Resultat getResultat() {
        return resultat;
    }

    public void setResultat(Resultat resultat) {
        this.resultat = resultat;
    }

    public Calendar getDate() {
        return date;
    }
    
    public String toString1(){
        return "Nom :" + patient.getNom().toUpperCase()+ "      Prestation : " + this.naturePrestation + "      Date : " + date; 
    }
    
}
