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

    /**
     * constructeur de la classe sejour qui génère un numéro de séjour et qui ne
     * possède pas de dateSortie
     *
     *
     */
    public Sejour(DMA dma, DateSimple dateEntree, Medecin PHResponsable, Localisation localisation) {
        this.numeroSejour = fonctions.genererNumeroSejour(dateEntree);
        this.dateEntree = dateEntree;
        this.dateSortie = null;
        this.PHResponsable = PHResponsable;
        this.localisation = localisation;
    }

    /** constructeur de la classe séjour qui ne possède pas de dateSortie
     * 
     * @param dma
     * @param numeroSejour
     * @param dateEntree
     * @param PHResponsable
     * @param localisation 
     */
    public Sejour(DMA dma, String numeroSejour, DateSimple dateEntree, Medecin PHResponsable, Localisation localisation) {
        this.numeroSejour = numeroSejour;
        this.dateEntree = dateEntree;
        this.dateSortie = null;
        this.PHResponsable = PHResponsable;
        this.localisation = localisation;
    }
    
    /** constructeur de la classe séjour qui prend un numéroSéjour et dateSortie
     * 
     * @param dma
     * @param numeroSejour
     * @param dateEntree
     * @param dateSortie
     * @param PHResponsable
     * @param localisation 
     */
    public Sejour(DMA dma, String numeroSejour, DateSimple dateEntree, DateSimple dateSortie, Medecin PHResponsable, Localisation localisation) {
        this.numeroSejour = numeroSejour;
        this.dateEntree = dateEntree;
        this.dateSortie = dateSortie;
        this.PHResponsable = PHResponsable;
        this.localisation = localisation;
    }

    /** constructeur de la classe séjour qui prend un numéro de séjour et une date de sortie
     * 
     * @param dma
     * @param dateEntree
     * @param dateSortie
     * @param PHResponsable
     * @param localisation 
     */
    public Sejour(DMA dma, DateSimple dateEntree, DateSimple dateSortie, Medecin PHResponsable, Localisation localisation) {
        this.numeroSejour = fonctions.genererNumeroSejour(dateEntree);
        this.dateEntree = dateEntree;
        this.dateSortie = dateSortie;
        this.dateSortie = null;
        this.PHResponsable = PHResponsable;
        this.localisation = localisation;
    }

    /** méthode permettant l'accès de la date d'entrée aux autres classes
     * 
     * 
     */
    public DateSimple getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(DateSimple dateEntree) {
        this.dateEntree = dateEntree;
    }
    
    /** méthode permettant l'accès de la date de sortie aux autres classes
     * 
     * 
     */
    public DateSimple getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(DateSimple dateSortie) {
        this.dateSortie = dateSortie;
    }

    /** méthode permettant l'accès au numéro de séjour aux autres classes
     * 
     * 
     */
    public String getNumeroSejour() {
        return numeroSejour;
    }

    public void setNumeroSejour(String numeroSejour) {
        this.numeroSejour = numeroSejour;
    }

    /** méthode permettant l'accès au PH responsable aux autres classes
     * 
     * 
     */
    public Medecin getPHResponsable() {
        return PHResponsable;
    }

    public void setPHResponsable(Medecin PHResponsable) {
        this.PHResponsable = PHResponsable;
    }
    
    /** méthode permettant l'accès de la localisation aux autres classes
     * 
     * 
     */
    public Localisation getLocalisation() {
        return localisation;
    }

    public void setLocalisation(Localisation localisation) {
        this.localisation = localisation;
    }

    /** méthode qui renvoie le numéro de séjour sous version texte
     * 
     * 
     */
    public String toString() {
        return this.numeroSejour;

    }

}
