/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pichisBD;

import pichisNF.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author Lucile
 */
public class ConnectionBD {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Lucile
 */


public Connection connexion;


    
    public ConnectionBD(){
        String pilote = "com.mysql.jdbc.Driver";

        try {

            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {

        }
        try {
            Class.forName(pilote);

            connexion = DriverManager.getConnection("jdbc:mysql://localhost/pichisdatabase", "root", "pichisproject2015");// ATTENTION à bien changer l'identifiant et le mot de passe !
            

            

        } catch (Exception e) {

            System.out.println("echec pilote : " + e);
        }
        
        

    }

   

        
        
        
    }



