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
public class Prescriptions {
    Date date;
    String prescriptions;
    Medecin medecin;
    
    public Prescriptions(){
    }
    
    public Prescriptions(Date date, String prescriptions, Medecin medecin){
        this.date = date;
        this.prescriptions = prescriptions;
        this.medecin = medecin;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(String prescriptions) {
        this.prescriptions = prescriptions;
    }
    
    
}
