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
    
    public Sejour getDernierSejour(){
        int index=0;
        DateSimple dateRecente;
        
        if(this.getListeSejours().isEmpty() == false){
            dateRecente = this.getListeSejours().get(0).getDateEntree();
                    
            for(int i=1; i<this.getListeSejours().size(); i++){               
                if(this.getListeSejours().get(i).getDateEntree().estAvant(dateRecente)){
                    index = i;
                    dateRecente = this.getListeSejours().get(i).getDateEntree();
                }
            }
            return this.getSejour(index);
        }
        else{
            return null;
        }
        
    }
}
