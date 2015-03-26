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
public class Operation {
    DateSimple date;
    String operation;
    String numeroSejour;
//    Medecin medecin;
    String auteur;
    
//    public Operation(String numeroSejour, DateSimple date, String operation, Medecin medecin){
//        this.date = date;
//        this.operation = operation;
//        this.numeroSejour = numeroSejour;
//        this.medecin=medecin;
//    }
    
     public Operation(String numeroSejour, DateSimple date, String operation, String auteur){
        this.date = date;
        this.operation = operation;
        this.numeroSejour = numeroSejour;
        this.auteur = auteur;
    }

    public String getAuteur() {
        return auteur;
    }

//    public Medecin getMedecin() {
//        return medecin;
//    }

    public String getNumeroSejour() {
        return numeroSejour;
    }

    public void setNumeroSejour(String numeroSejour) {
        this.numeroSejour = numeroSejour;
    }
    

    public DateSimple getDate() {
        return date;
    }

    public void setDate(DateSimple date) {
        this.date = date;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
    
    public String toString(){
        return "date : " + this.date
                +"\noperation : " + this.operation;
    }
}
