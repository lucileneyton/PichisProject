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
       Services s = new Services(TypeServices.CLINIQUE, Specialite.NEUROLOGIE);
       Medecin med = new Medecin("789","Essai","Essai","ghi",s);
       Medecin med1 = new Medecin("788","Essai","Essai","ghi",s);
       
        
       DateSimple date1 = new DateSimple("24", "04", "1995");
       DateSimple date2 = new DateSimple("23", "02", "1993");
       DateSimple date3 = new DateSimple("01", "05", "2014");
       
        System.out.println(date1.estAvant(date2));
       
//       Services service1 = new Services(TypeServices.CLINIQUE, Specialite.CARDIOLOGIE);
//       
//       Medecin medecin1 = new Medecin("1", "House", "Gregory", "123", service1);
//       Medecin medecin2 = new Medecin("2", "Marie", "Curie", "345", service1);
//       
//       Localisation localisation1 = new Localisation(service1, "23", "F");          
//       
//       DPI dpi1 = new DPI("1", "Me", "Henry", "H", date1, "21, rue des agagous");
//       DPI dpi2 = new DPI("2", "Vousmalade", "Josette", "F", date1, "22, rue des agagous");
//       
//       Prescription prescription1 = new Prescription(date3, "Aspirine 10 fois/jour", medecin1);
//       dpi1.getDm().ajouterPrescription(prescription1);
//       
//       Sejour sejour1 = new Sejour(dpi1.getDma(), date1, date2, medecin1, localisation1);
//       dpi1.getDma().ajouterSejour(sejour1);
//       Sejour sejour2 = new Sejour(dpi1.getDma(), date2, date3, medecin2, localisation1);
//       dpi1.getDma().ajouterSejour(sejour2);
//       
//       Operation op1 = new Operation(sejour1.getNumeroSejour(),date2, "Pansement",medecin1);
//       dpi1.ajouterOperation(op1);
//       
//       dpi2.setEstOuvert(false);
//       
//        System.out.println(dpi1.toString());
//        System.out.println(dpi1.afficherDMA());
//        
//        System.out.println(dpi1.CreerIpp());
    }
    
}
