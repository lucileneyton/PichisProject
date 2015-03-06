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
public class Localisation {
    Services localisation;
    String placement;
    String numeroChambre;

    
     public Localisation(Services localisation, String numeroChambre, String placement){
        this.localisation = localisation;
        this.placement = placement;
        this.numeroChambre = numeroChambre;
     }
    
    public String getPlacement() {
        return placement;
    }

    public void setPlacement(String placement) {
        this.placement = placement;
    }

    public String getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(String numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public Services getLocalisation() {
        return localisation;
    }

    public void setLocalisation(Services localisation) {
        this.localisation = localisation;
    }
    
    public String toString(){
        return localisation.toString();
    }
}
