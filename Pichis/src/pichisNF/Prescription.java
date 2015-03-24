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
public class Prescription {
    DateSimple date;
    String prescriptions;
    Medecin medecin;
    
    public Prescription(){
    } 
    
    public Prescription(DateSimple date, String prescriptions, Medecin medecin){
        this.date = date;
        this.prescriptions = prescriptions;
        this.medecin = medecin;
    }

    public DateSimple getDate() {
        return date;
    }

    public void setDate(DateSimple date) {
        this.date = date;
    }

    public String getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(String prescriptions) {
        this.prescriptions = prescriptions;
    }
    
    public String toString(){
        return "----- Prescription -----"
                + "\ndate : " + this.date.toString()
                +"\nprescription : " + this.prescriptions
                +"\nmedecin : " +this.medecin.toString();
    }
    
}
