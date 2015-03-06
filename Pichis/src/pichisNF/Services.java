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
public class Services {
    TypeServices type;
    Specialite specialite;
    
    public Services(TypeServices type, Specialite specialite){
        this.type = type;
        this.specialite = specialite;
    }

    public TypeServices getType() {
        return type;
    }

    public void setType(TypeServices type) {
        this.type = type;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }
    
    public String toString(){
        return specialite.toString();
    }
}
