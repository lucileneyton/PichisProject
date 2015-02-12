/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisNF;


import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author molit_000
 */
public class Personnel {
    private String id;
    private String nom;
    private String prenom;
    private String motDePasse;
    
    static ConnectionBD bd = new ConnectionBD();
    
    public Personnel(String id, String nom, String prenom, String motDePasse){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.motDePasse = motDePasse;   
        
    }
  
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    
    public static boolean identification(String id, String motDePasse){
        
      
        String identif;
        String mdp="null";
        
        
        
        try{
        
     
        ResultSet resul;
        
        Statement ins = bd.connexion.createStatement();
        resul = ins.executeQuery("SELECT * FROM personnel WHERE id= "+id);
        while (resul.next()) {

                identif = resul.getString("id");
                mdp = resul.getString("mdp");
                
            }
        }
        
        catch(Exception e){
            System.out.println("erreur : " + e);
        }
        
        if(mdp.equals(motDePasse)){
            return true;
        }
        
        else{
            return false;
        }
        
    }
    
    
    
}
