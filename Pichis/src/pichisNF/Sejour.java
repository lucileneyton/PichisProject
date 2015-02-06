/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisNF;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author molit_000
 */
public class Sejour {
    String numeroSejour;
    Date date;
    Medecin PHResponsable;
    ArrayList<Operations> operations;    
    ArrayList<LettresDeSortie> lettresDeSorties;
    Localisation localisation;
    
    public Sejour(String numeroSejour, Date date, Medecin PHResponsable, Localisation localisation){
        this.numeroSejour = numeroSejour;
        this.date = date;
        this.PHResponsable = PHResponsable;
        this.operations = new ArrayList<Operations>();
        this.lettresDeSorties = new ArrayList<LettresDeSortie>();
        this.localisation = localisation;
    }

    public ArrayList<Operations> getOperations() {
        return operations;
    }

    public void setOperations(ArrayList<Operations> operations) {
        this.operations = operations;
    }

    public String getNumeroSejour() {
        return numeroSejour;
    }

    public void setNumeroSejour(String numeroSejour) {
        this.numeroSejour = numeroSejour;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Medecin getPHResponsable() {
        return PHResponsable;
    }

    public void setPHResponsable(Medecin PHResponsable) {
        this.PHResponsable = PHResponsable;
    }

    public ArrayList<LettresDeSortie> getLettresDeSorties() {
        return lettresDeSorties;
    }

    public void setLettresDeSorties(ArrayList<LettresDeSortie> lettresDeSorties) {
        this.lettresDeSorties = lettresDeSorties;
    }

    public Localisation getLocalisation() {
        return localisation;
    }

    public void setLocalisation(Localisation localisation) {
        this.localisation = localisation;
    }
    
    
}
