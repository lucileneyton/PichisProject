/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pichisBD;

import pichisNF.Resultat;

/**
 *
 * @author Lucile
 */
public class TestDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DAOPrestations daop = new DAOPrestations();
        //daop.ajoutPrestation("injection", "1", "123", "NULL", "2015-03-17", "1");
        
        DAOResultat daor = new DAOResultat();
        Resultat res = daor.resultatPrestation("1");
        //res.toString();
        
        daor.ajoutResultat("2015-03-17", "taux de leucocytes anormal", "1", "1", "1");
        res = daor.resultatPrestation("1");
        System.out.println(res.getDescriptions().toString());
        
    }
    
}
