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
public class Observation {
    DateSimple date;
    String description;
    Medecin medecin;
    
    public Observation(DateSimple date, String description,Medecin medecin){
        this.date = date;
        this.description = description;
        this.medecin=medecin;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
