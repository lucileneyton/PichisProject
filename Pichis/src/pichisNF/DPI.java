/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisNF;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author molit_000
 */
public class DPI {
    private String ipp;
    private String nom;
    private String prenom; 
    private String sexe;
    private DateSimple dateNaissance;
    private String adresse;
    private DMA dma;
    private DM dm;
    private ArrayList<LettreDeSortie> lettresDeSortie;
    private ArrayList<Operation> operations;
    private boolean estOuvert;
    
    public DPI(String ipp, String nom, String prenom, String sexe, DateSimple dateNaissance, String adresse){
        this.dma = new DMA();
        this.dm = new DM();
        this.ipp = ipp;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.sexe = sexe;
        this.adresse = adresse;
        this.lettresDeSortie = new ArrayList<LettreDeSortie>();
        this.operations = new ArrayList<Operation>();
        estOuvert = true; // le DPI est ouvert à l'ouverture
    }

    public DMA getDma() {
        return dma;
    }

    public void setDma(DMA dma) {
        this.dma = dma;
    }

    public DM getDm() {
        return dm;
    }

    public void setDm(DM dm) {
        this.dm = dm;
    }

    public String getIpp() {
        return ipp;
    }

    public void setIpp(String ipp) {
        this.ipp = ipp;
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

    public DateSimple getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(DateSimple dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public boolean isEstOuvert() {
        return estOuvert;
    }

    public void setEstOuvert(boolean estOuvert) {
        this.estOuvert = estOuvert;
    }

    public ArrayList<LettreDeSortie> getLettresDeSortie() {
        return lettresDeSortie;
    }

    public void setLettresDeSortie(ArrayList<LettreDeSortie> lettresDeSortie) {
        this.lettresDeSortie = lettresDeSortie;
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }

    public void setOperations(ArrayList<Operation> operations) {
        this.operations = operations;
    }
    
    
    
    public void ajouterLettreDeSortie(LettreDeSortie l){
        this.lettresDeSortie.add(l);
    }
    
    public void ajouterOperation(Operation op){
        this.operations.add(op);
    }
    
    public String afficherDM(){
        return "----- DM -----"
                +"\nPatient : " + this.nom + " " +this.prenom
                +"\nOperation : "; // a finir !
            }
    
public String afficherDMA(){
    String texteDMA;
    Sejour sejourEnCours = this.getDma().getListeSejours().get(this.getDma().getListeSejours().size() - 1); // on affiche le dernier sejour de la liste, on suppose que c'est le sejour en cours
    texteDMA = "----- DMA -----\nPatient : " + this.nom + this.prenom;
    
    texteDMA = texteDMA + "\n" + sejourEnCours.toString();
  
    if(this.getDma().getListeSejours().size() <= 0){
        System.out.println("Aucune lettre de sortie disponible");
    }
    else{
        //texteDMA = texteDMA + "\n" + this.getLettreDeSortieDuSejour(sejourEnCours).toString();
    }     
    
    return texteDMA;
    
}
    
    public String toString(){
//        
        return nom.toUpperCase() + " " + prenom;
    }
    
    public String afficherDPI(){
        if(this.estOuvert == true){
           return "----- DPI -----"
             + "\nipp : " + this.ipp
             + "\nnom : " + this.nom 
             + "\nprenom : "+this.prenom
             + "\nDate de Naissance : "+this.dateNaissance.toString()
             + "\nSexe : "+this.sexe
             + "\nAdresse : "+this.adresse
             + "\nNombre operations : " +this.operations.size()
             + "\nNombre lettre de sorties : " +this.lettresDeSortie.size();
        }
        else{
            return "----- dpi -----"
                   + "\nCe DPI n'est pas ouvert \n";
        }
    }
    
    public LettreDeSortie getLettreDeSortieDuSejour(Sejour sejour){
        int i = 0;
        while(i<this.getLettresDeSortie().size() && (this.getLettresDeSortie().get(i).getNumeroSejour().equals(sejour.getNumeroSejour())==false)){
            i++;
        }
        if(i == this.getLettresDeSortie().size()){
            return null;
        }
        else{
            return this.getLettresDeSortie().get(i);
        }
    }
    
    public static String CreerIpp(){
        String ipp;
          
        //Pour les deux premiers chiffres de l'ipp
        DateFormat df3 = new SimpleDateFormat("yy");
        Date today = Calendar.getInstance().getTime();
        Calendar.getInstance(); 
        ipp = df3.format(today);

        //pour le reste 
        for(int i=0; i<7; i++){
            ipp = ipp + (int)(Math.random()*10);
        }
        
        return ipp;
    }
    
}
