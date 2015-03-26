package pichisBD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Classe permettant la connexion à la base de données
 *
 */
public class ConnectionBD {

    public Connection connexion;

    /**
     * Méthode permettant de se connecter à la base de données
     *
     */
    public ConnectionBD() {
        String pilote = "com.mysql.jdbc.Driver";

        try {

            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {

        }
        try {
            Class.forName(pilote);

            connexion = DriverManager.getConnection("jdbc:mysql://localhost/pichisdatabase", "root", "pichisproject2015");// ATTENTION à bien changer l'identifiant et le mot de passe pour se connecter au serveur
            //connexion = DriverManager.getConnection("jdbc:mysql://adresseip/pichisdatabase", "user", "user"); // Enlever le commentaire pour configurer un accès à la base en réseau local

        } catch (Exception e) {

            System.out.println("Echec lors du chargement du pilote : " + e);
        }

    }

}
