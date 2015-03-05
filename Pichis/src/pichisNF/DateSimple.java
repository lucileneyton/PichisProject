/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisNF;

import java.util.Calendar;

/**
 *
 * @author molit_000
 */
public class DateSimple {
    private String jour;
    private String mois;
    private String annee;
    
    public DateSimple(String jour, String mois, String annee){
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public String getJour(){
        return jour;
    }

    public void setJour(String jour) {
        if(Integer.parseInt(jour)>=1 && Integer.parseInt(jour)<=31){
            this.jour = jour;
        }
        else{
            System.out.println("Veuillez rentrer un jour valable");
        }
    }

    public String getMois() {       
        return mois;
    }

    public void setMois(String mois) {
       if(Integer.parseInt(mois)>=1 && Integer.parseInt(mois)<=12){
            this.mois = mois;
       }
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        if(Integer.parseInt(annee)>= 1800 && Integer.parseInt(annee)<= Calendar.getInstance().get(Calendar.YEAR)){
            this.annee = annee;
        }
        else{
            System.out.println("Veuillez entrer une année correcte");
        }
    }
    
    
    public String toString(){
        return this.jour + "/" + this.mois + "/" + this.annee;
    }
    
    public String get2derniersChiffresAnnee(){
        return annee.substring(2);
    }
    
    public boolean estAvant(DateSimple date){
        boolean rep = true;
        if(Integer.valueOf(annee) > Integer.valueOf(date.getAnnee())){
            rep = false;
        }
        if(Integer.valueOf(mois) > Integer.valueOf(date.getMois())){
            rep = false;
        }
        if(Integer.valueOf(jour) > Integer.valueOf(date.getJour())){
            rep = false;
        }
        return rep;
    }
}
