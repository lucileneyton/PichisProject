/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisNF;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author molit_000
 */
public class LettreDeSortie {
    private String numeroSejour;
    private DateSimple date;
    private String contenu;
    
    public LettreDeSortie(){
    }
    
    public LettreDeSortie(String numeroSejour, DateSimple date, String contenu){
        this.numeroSejour = numeroSejour;
        this.date = date;
        this.contenu = contenu;
    }

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

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
    
    public String toString(){
        String texte = "    ----- Lettre de sortie -----";
                if(date == null || contenu == null){
                    texte = texte + "";
                }
                else{
                    texte = texte + "\n     date : " + this.date  
                                  + "\n     contenu : " + this.contenu;
                }
                
                return texte;
        
    }
    
    
}
