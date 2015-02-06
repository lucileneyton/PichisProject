/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisNF;

import java.util.Date;

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
    private Date dateNaissance;
    private String sexe;
    private String adresse;
    private boolean estOuvert;
    
    public DPI(String ipp, String nom, String prenom, Date DateNaissance, String sexe, String adresse){
        this.dma = new DMA();
        this.dm = new DM();
        this.ipp = ipp;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = DateNaissance;
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

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
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
    
}
