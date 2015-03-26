/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pichisBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import pichisNF.Localisation;
import pichisNF.Services;
import pichisNF.Specialite;
import pichisNF.TypeServices;

/**
 * Data access object pour la classe Localisation
 * 
 */
public class DAOLocalisation {
 
    ConnectionBD c ;

   
    /**
 * Méthode permettant de récupérer la localisation d'un séjour
 * @param num le numéro du séjour
 * @return Localisation
 */
    public Localisation localisationParNumeroDeSejour(String num) {

        c=new ConnectionBD();
        Localisation loc = null;
        
        
        try {

            ResultSet resul;

            Statement ins = c.connexion.createStatement();

           // resul = ins.executeQuery("SELECT sejour.ipp,sejour.id,sejour.dateentree, sejour.responsable,sejour.loc, sejour.datesortie,sejour.numerochambre,sejour.placement,service.id, service.specialite,service.type FROM sejour,service WHERE service.id = sejour.loc AND sejour.id= " + num);
//            resul = ins.executeQuery("SELECT id, loc, numerochambre, placement FROM sejour WHERE id='" + num + "';");

            resul = ins.executeQuery("SELECT sejour.loc, sejour.numerochambre, sejour.placement FROM sejour, service WHERE sejour.id=" + num);
            if (resul.getRow() != 0) {
                loc = null;

            } else {

                while (resul.next()) {
                    DAOServices d = new DAOServices();
                      Services service = d.serviceParID(resul.getString("loc"));
                      String numChambre = resul.getString("numerochambre");
                      String placement = resul.getString("placement");
//                      
//                      
//
//                
//                  String typeService = resul.getString("service.type");
//                 String specialite = resul.getString("service.specialite");
//                    
//                    TypeServices t = TypeServices.valueOf(typeService);
//                    Specialite sp = Specialite.valueOf(localisation);
//                    Services s = new Services(t,sp); 
                    loc = new Localisation(service,numChambre,placement);

                }
            }
        } catch (SQLException e) {
            System.out.println("erreur DAOLocalisation (localisationParNumeroDeSejour): " + e);
        }
        finally{
            if(c!=null){
                try{
                   c.connexion.close();
                }
                catch(SQLException e){
                    System.out.println(e);
                }
            }
                   
        }

        return loc;
    }
    
    /**
 * Méthode permettant de changer la localisation d'un séjour dans la base de données 
 * @param idSejour l'id du séjour 
 * @param idSpecialite l'id du nouveau service où va se trouver le patient
 * @param numeroChambre le numéro de la nouvelle chambre du patient
 * @param placement le nouveau placement dans la chambre
 */
    public void changerLocalisationSejour(String idSejour, String idSpecialite, String numeroChambre, String placement){
        c=new ConnectionBD();
      
        try {

            int resul;

            Statement ins = c.connexion.createStatement();
            resul = ins.executeUpdate("UPDATE sejour SET loc=" + idSpecialite + ", numerochambre=" +  numeroChambre + ", placement=" + "'" + placement + "'" + " WHERE id=" + "'"  + idSejour + "' ;");

        } catch (SQLException e) {
            System.out.println("erreur DAOLocalisation (changerLocalisationSejour): " + e);
        }
        finally{
            if(c!=null){
                try{
                   c.connexion.close();
                }
                catch(SQLException e){
                    System.out.println(e);
                }
            }
                   
        }
    }

    

}


