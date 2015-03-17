/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisNF;

/**
 *
 * @author molit_000
 */
public enum Specialite {
    ANESTHESIE ("Anesthesie"),
    CARDIOLOGIE ("Cardiologie"),
    NEUROLOGIE ("Neurologie"),
    RADIOLOGIE("Radiologie"),
    UROLOGIE ("Urologie");
   
    private String specialite;
    
    private Specialite(String specialite){
        this.specialite = specialite;
    }
    
    public String toString(){
        return this.specialite;
    }
    
}
