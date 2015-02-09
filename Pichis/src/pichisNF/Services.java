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
    String specialite;
    
    public Services(TypeServices type, String specialite){
        this.type = type;
        this.specialite = specialite;
    }

    public TypeServices getType() {
        return type;
    }

    public void setType(TypeServices type) {
        this.type = type;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    
    public String toString(){
        return specialite;
    }
}
