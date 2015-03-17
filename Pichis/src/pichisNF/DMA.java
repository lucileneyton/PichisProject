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
public class DMA {
    private ArrayList<Sejour> sejour;
    
    public DMA(){
        this.sejour = new ArrayList<Sejour>();
    }
    
    public Sejour getSejour(int i){
        return this.sejour.get(i);
    }
    
    public ArrayList<Sejour> getListeSejours(){
        return this.sejour;
    } 
    
    public void ajouterSejour(Sejour sejour){
        this.sejour.add(sejour);
    }

    public void setSejour(ArrayList<Sejour> sejour) {
        this.sejour = sejour;
    }
    
     public String genererNumeroSejour(DateSimple dateEntree){
        String numSejour = "";
        int compteurSejour = 10000 + this.getListeSejours().size();
        numSejour = dateEntree.get2derniersChiffresAnnee() + dateEntree.getMois() + compteurSejour;
        return numSejour;
    }
}
