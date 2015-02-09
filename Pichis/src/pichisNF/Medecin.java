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
public class Medecin extends Personnel{
    
    private Services specialite;
    
    public Medecin(String id, String nom, String prenom, String motDePasse, Services specialite){
        super(id, nom, prenom, motDePasse);
        this.specialite = specialite;
    }

    public Services getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Services specialite) {
        this.specialite = specialite;
    }
    
    public String toString(){
        return super.getNom() + " " + super.getPrenom() + " ";
    }
    
}
