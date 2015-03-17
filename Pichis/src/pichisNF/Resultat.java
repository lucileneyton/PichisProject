/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisNF;

import java.text.SimpleDateFormat;

/**
 *
 * @author molit_000
 */
public class Resultat {
    DateSimple date;
    String descriptions;
    Medecin medecin;
    
    public Resultat(DateSimple date, String descriptions,Medecin medecin){
        this.date = date;
        this.descriptions = descriptions;
        this.medecin=medecin;
    }
    
    public void toSring(){
        System.out.println(descriptions);
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public DateSimple getDate() {
        return date;
    }

    public void setDate(DateSimple date) {
        this.date = date;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }
    
    
    
    
    
}
