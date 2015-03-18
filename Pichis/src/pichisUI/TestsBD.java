/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisUI;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import pichisBD.ConnectionBD;

/**
 *
 * @author Matilas
 */
public class TestsBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        ConnectionBD c = new ConnectionBD();
        Statement ins;
        ResultSet resul;

        ins = c.connexion.createStatement();
        resul = ins.executeQuery("SELECT * FROM personnel WHERE maintenance IS NULL AND service IS NULL AND id =123");
        System.out.println("" + resul.first());

    }
}
