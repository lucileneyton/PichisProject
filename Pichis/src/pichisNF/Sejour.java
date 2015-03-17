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
    private DateSimple dateEntree;
    private DateSimple dateSortie;
    private Medecin PHResponsable;
    private Localisation localisation;
    
    
    public Sejour(DMA dma, DateSimple dateEntree, DateSimple dateSortie, Medecin PHResponsable, Localisation localisation){
        //int compteurSejour = 10000 + dma.getListeSejours().size();
        //this.numeroSejour = dateEntree.get2derniersChiffresAnnee() + dateEntree.getMois() + compteurSejour;
        this.numeroSejour = dma.genererNumeroSejour(dateEntree);
        this.dateEntree = dateEntree;
        this.dateSortie = dateSortie;
        this.PHResponsable = PHResponsable;
        this.localisation = localisation;
    }

    public DateSimple getDateEntree() {
        return dateEntree;
    }
    

    public void setDateEntree(DateSimple dateEntree) {
        this.dateEntree = dateEntree;
    }

    public DateSimple getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(DateSimple dateSortie) {
        this.dateSortie = dateSortie;
    }

    public String getNumeroSejour() {
        return numeroSejour;
    }

    public void setNumeroSejour(String numeroSejour) {
        this.numeroSejour = numeroSejour;
    }

    public Medecin getPHResponsable() {
        return PHResponsable;
    }

    public void setPHResponsable(Medecin PHResponsable) {
        this.PHResponsable = PHResponsable;
    }

    public Localisation getLocalisation() {
        return localisation;
    }

    public void setLocalisation(Localisation localisation) {
        this.localisation = localisation;
    }
    
    public String toString(){
        return  "   ----- Sejour -----"
                + "\n   numeroSejour : " + this.numeroSejour
                + "\n   dateEntree : " + this.dateEntree.toString()
                +"\n    dateSortie : " + this.dateSortie.toString()
                + "\n   PH responsable : " + this.PHResponsable.toString()
                + "\n   localisation : " + this.localisation.toString()
                + "\n";

    }
    
}
