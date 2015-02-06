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
public class LettresDeSortie {
    private Date date;
    private String contenu;
    
    public LettresDeSortie(){
    }
    
    public LettresDeSortie(Date date, String contenu){
        this.date = date;
        this.contenu = contenu;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
    
    
}
