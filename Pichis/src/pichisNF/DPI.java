/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisNF;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author molit_000
 */
public class DPI {
    private DMA dma;
    private DM dm;
    private String ipp;
    private String nom;
    private String prenom;
    private DateSimple dateNaissance;
    private String sexe;
    private String adresse;
    private boolean estOuvert;
    
    public DPI(String ipp, String nom, String prenom, DateSimple dateNaissance, String sexe, String adresse){
        this.dma = new DMA();
        this.dm = new DM();
        this.ipp = ipp;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.sexe = sexe;
        this.adresse = adresse;
        estOuvert = true; // le DPI est ouvert à l'ouverture
    }

    public DMA getDma() {
        return dma;
    }

    public void setDma(DMA dma) {
        this.dma = dma;
    }

    public DM getDm() {
        return dm;
    }

    public void setDm(DM dm) {
        this.dm = dm;
    }

    public String getIpp() {
        return ipp;
    }

    public void setIpp(String ipp) {
        this.ipp = ipp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public DateSimple getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(DateSimple dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public boolean isEstOuvert() {
        return estOuvert;
    }

    public void setEstOuvert(boolean estOuvert) {
        this.estOuvert = estOuvert;
    }
    
    public String toString(){
        if(this.estOuvert == true){
           return "----- dpi -----"
             + "\nipp : " + this.ipp
             + "\nnom : " + this.nom 
             + "\nprenom : "+this.prenom
             + "\nDate de Naissance : "+this.dateNaissance.toString()
             + "\nSexe : "+this.sexe
             + "\nAdresse : "+this.adresse
             + "\n";
        }
        else{
            return "----- dpi -----"
                   + "\nCe DPI n'est pas ouvert \n";
        }
        
    }
    
}
