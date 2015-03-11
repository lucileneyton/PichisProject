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
public enum TypeServices {
    CLINIQUE("clinique"),
    MEDICO_TECHNIQUE("medicoTechnique"),
    MAINTENANCE("Maintenance");
    
    private String typeServices;
    
    private TypeServices(String typeServices){
        this.typeServices = typeServices;
    }
    
    public String toString(){
        return this.typeServices;
    }
    
}
