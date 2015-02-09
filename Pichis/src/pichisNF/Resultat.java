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
    
    public Resultat(DateSimple date, String descriptions){
        this.date = date;
        this.descriptions = descriptions;
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
