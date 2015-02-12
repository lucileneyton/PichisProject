/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisNF;

import java.util.Calendar;

/**
 *
 * @author molit_000
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Administratif adm = new Administratif("456", "Test", "Test", "def");
        
       DateSimple date1 = new DateSimple("24", "04", "1993");
       DateSimple date2 = new DateSimple("12", "01", "2015");
       DateSimple date3 = new DateSimple("15", "01", "2015");
       
       Services service1 = new Services(TypeServices.CLINIQUE, "cardiologie");
       
       Medecin medecin1 = new Medecin("1", "House", "Gregory", "123", service1);
       Medecin medecin2 = new Medecin("2", "Marie", "Curie", "345", service1);
       
       Localisation localisation1 = new Localisation(service1);          
       
       DPI dpi1 = new DPI("1", "Me", "Henry", date1, "M", "21, rue des agagous");
       DPI dpi2 = new DPI("2", "Vousmalade", "Josette", date1, "F", "22, rue des agagous");
       
       Sejour sejour1 = new Sejour(dpi1.getDma(), date2, medecin1, localisation1);
       dpi1.getDma().ajouterSejour(sejour1);
       Sejour sejour2 = new Sejour(dpi1.getDma(), date3, medecin2, localisation1);
       dpi1.getDma().ajouterSejour(sejour2);
       
       dpi2.setEstOuvert(false);
         
      // System.out.println(dpi1.toString());
       //System.out.println(dpi2.toString());
       //System.out.println(dpi1.getDma().getSejour().get(0).toString());
       //System.out.println(dpi1.getDma().getSejour().get(1).toString());
       
    }
    
}
