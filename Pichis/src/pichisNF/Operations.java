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
public class Operations {
    Date date;
    String operation;
    Observations observations;
    Resultats resultats;
    
    public Operations(Date date, String operation){
        this.date = date;
        this.operation = operation;
        observations = new Observations();
        resultats = new Resultats();
    }

    public Observations getObservations() {
        return observations;
    }

    public void setObservations(Observations observations) {
        this.observations = observations;
    }

    public Resultats getResultats() {
        return resultats;
    }

    public void setResultats(Resultats resultats) {
        this.resultats = resultats;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
    
    
}
