/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testbd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Lucile
 */


import java.sql.*;

class Test{

public static void main(String[] args){

	String pilote = "com.mysql.jdbc.Driver";
        

try {

    Class.forName( "com.mysql.jdbc.Driver" );

} catch ( ClassNotFoundException e ) {

    
}
	try{
		Class.forName(pilote);
 
		Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost/pichisdatabase","root","pichisproject2015");
                Statement instruction = connexion.createStatement();

                 ResultSet resultat = instruction.executeQuery("SELECT adresse FROM dpi WHERE adresse='pifpafpouf'"); 
                while ( resultat.next() ) {

    

                    String adresse = resultat.getString( "adresse" );
                    System.out.println(adresse);
   

}
		
	}
	catch (Exception e){

		System.out.println("echec pilote : "+e);
	}

	}
}


