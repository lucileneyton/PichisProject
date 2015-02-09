/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisNF;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author molit_000
 */
public class Sejour {
    private String numeroSejour;
    private DateSimple date;
    private Medecin PHResponsable;
    private ArrayList<Operation> operations;    
    private ArrayList<LettreDeSortie> lettresDeSorties;
    private Localisation localisation;
    
    
    public Sejour(DMA dma, DateSimple date, Medecin PHResponsable, Localisation localisation){
        int compteurSejour = 10000 + dma.getListeSejours().size();
        this.numeroSejour = date.get2derniersChiffresAnnee() + date.getMois() + compteurSejour;
        this.date = date;
        this.PHResponsable = PHResponsable;
        this.operations = new ArrayList<Operation>();
        this.lettresDeSorties = new ArrayList<LettreDeSortie>();
        this.localisation = localisation;
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }

    public void setOperations(ArrayList<Operation> operations) {
        this.operations = operations;
    }

    public String getNumeroSejour() {
        return numeroSejour;
    }

    public void setNumeroSejour(String numeroSejour) {
        this.numeroSejour = numeroSejour;
    }

    public DateSimple getDate() {
        return date;
    }

    public void setDate(DateSimple date) {
        this.date = date;
    }

    public Medecin getPHResponsable() {
        return PHResponsable;
    }

    public void setPHResponsable(Medecin PHResponsable) {
        this.PHResponsable = PHResponsable;
    }

    public ArrayList<LettreDeSortie> getLettresDeSorties() {
        return lettresDeSorties;
    }

    public void setLettresDeSorties(ArrayList<LettreDeSortie> lettresDeSorties) {
        this.lettresDeSorties = lettresDeSorties;
    }

    public Localisation getLocalisation() {
        return localisation;
    }

    public void setLocalisation(Localisation localisation) {
        this.localisation = localisation;
    }
    
    public String toString(){
        return  "----- Sejour -----"
                + "\nnumeroSejour : " + this.numeroSejour
                + "\ndate : " + this.date.toString()
                + "\nPH responsable : " + this.PHResponsable.toString()
                + "\noperations : " + this.operations.size()
                + "\nlettres de sortie : " + this.lettresDeSorties.size()
                + "\nlocalisation : " + this.localisation.toString()
                + "\n";

    }
    
}
