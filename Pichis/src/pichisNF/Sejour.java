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
    private Localisation localisation;
    
    
    public Sejour(DMA dma, DateSimple date, Medecin PHResponsable, Localisation localisation){
        int compteurSejour = 10000 + dma.getListeSejours().size();
        this.numeroSejour = date.get2derniersChiffresAnnee() + date.getMois() + compteurSejour;
        this.date = date;
        this.PHResponsable = PHResponsable;
        this.localisation = localisation;
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

    public Localisation getLocalisation() {
        return localisation;
    }

    public void setLocalisation(Localisation localisation) {
        this.localisation = localisation;
    }
    
    public String toString(){
        return  "   ----- Sejour -----"
                + "\n   numeroSejour : " + this.numeroSejour
                + "\n   date : " + this.date.toString()
                + "\n   PH responsable : " + this.PHResponsable.toString()
                + "\n   localisation : " + this.localisation.toString()
                + "\n";

    }
    
}
