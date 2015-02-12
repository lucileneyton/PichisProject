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
    private DateSimple date;
    private String contenu;
    
    public LettreDeSortie(){
    }
    
    public LettreDeSortie(DateSimple date, String contenu){
        this.date = date;
        this.contenu = contenu;
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
    
    
}
