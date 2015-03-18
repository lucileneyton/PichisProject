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
    Services service;
    String placement;
    String numeroChambre;

    
     public Localisation(Services service, String numeroChambre, String placement){
        this.service = service;
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

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }
    
    public String toString(){
        return service.toString();
    }
}
