/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisNF;

import java.util.ArrayList;

/**
 *
 * @author molit_000
 */
public class DMA {
    private ArrayList<Sejour> sejour;
    
    public DMA(){
        this.sejour = new ArrayList<Sejour>();
    }
    
    public void ajouterSejour(Sejour sejour){
        this.sejour.add(sejour);
    }
    
}