package pichisNF;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

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

    /**
     * Constructeur de la classe Dossier Patient Informatisé (DPI)
     *
     * @param ipp
     * @param nom
     * @param prenom
     * @param sexe
     * @param dateNaissance
     * @param adresse
     */
    public DPI(String ipp, String nom, String prenom, String sexe, DateSimple dateNaissance, String adresse) {
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

    /**
     * Méthode permettant l'accès au dossier médical administratif (dma) par
     * d'autres classes
     *
     * @return String dma
     */
    public DMA getDma() {
        return dma;
    }

    /**
     * Méthode permettant l'accès au dossier médical (dm) par d'autres classes
     *
     * @return String dm
     */
    public DM getDm() {
        return dm;
    }

    /**
     * /** Méthode permettant l'accès à l'IPP du patient par d'autres classes
     *
     * @return String ipp
     */
    public String getIpp() {
        return ipp;
    }

    /**
     * Méthode permettant l'accès au nom du patient par d'autres classes
     *
     * @return String nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Méthode permettant l'accès au prénom du patient par d'autres classes
     *
     * @return String prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Méthode permettant l'accès à la date de naissance du patient par d'autres
     * classes
     *
     * @return String dateNaissance
     */
    public DateSimple getDateNaissance() {
        return dateNaissance;
    }

    /**
     * Méthode permettant l'accès au sexe du patient par d'autres classes
     *
     * @return String sexe
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * Méthode permettant l'accès à l'adresse du patient par d'autres classes
     *
     * @return String adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Méthode permettant de savoir si le dossier patient informatisé (dpi) est
     * ouvert (patient dans l'hôpital) ou non
     *
     * @return boolean
     */
    public boolean isEstOuvert() {
        return estOuvert;
    }

    /**
     * Méthode permettant de modifier le statut (ouvert/fermé) du dossier
     * patient informatisé (dpi)
     *
     * @param estOuvert vaut true si le dpi est ouvert, false s'il est fermé
     */
    public void setEstOuvert(boolean estOuvert) {
        this.estOuvert = estOuvert;
    }

    /**
     * Méthode permettant l'accès à la liste de lettres de sortie du patient par
     * d'autres classes
     *
     * @return ArrayList lettresDeSortie
     */
    public ArrayList<LettreDeSortie> getLettresDeSortie() {
        return lettresDeSortie;
    }

    /**
     * Méthode permettant l'accès à la liste d'opérations du patient par
     * d'autres classes
     *
     * @return ArrayList operations
     */
    public ArrayList<Operation> getOperations() {
        return operations;
    }

    /**
     * Méthode permettant l'ajout d'une lettre de sortie à la liste de lettres
     * de sortie
     *
     * @param lettreDeSortie Lettre de sortie à ajouter
     */
    public void ajouterLettreDeSortie(LettreDeSortie lettreDeSortie) {
        this.lettresDeSortie.add(lettreDeSortie);
    }

    /**
     * Méthode permettant l'ajout d'opérations à la liste d'opérations
     *
     * @param operation Opération à ajouter
     */
    public void ajouterOperation(Operation operation) {
        this.operations.add(operation);
    }

    /**
     * Méthode de test permettant d'afficher le dossier médical administratif
     * (dma) du patient
     *
     * @return String texteDMA
     */
    public String afficherDMA() {
        String texteDMA;
        Sejour sejourEnCours = this.getDma().getListeSejours().get(this.getDma().getListeSejours().size() - 1); // on affiche le dernier sejour de la liste, on suppose que c'est le sejour en cours
        texteDMA = "----- DMA -----\nPatient : " + this.nom + this.prenom;

        texteDMA = texteDMA + "\n" + sejourEnCours.toString();

        if (this.getDma().getListeSejours().size() <= 0) {
            System.out.println("Aucune lettre de sortie disponible");
        } else {
            texteDMA = texteDMA + "\n" + this.getLettreDeSortieDuSejour(sejourEnCours).toString();
        }
        return texteDMA;
    }

    /**
     * Méthode permettant l'affichage du nom et du prénom du patient
     *
     * @return String nom + prenom
     */
    public String toString() {
        return nom.toUpperCase() + " " + prenom;
    }

    /**
     * Méthode de test permettant l'affichage du dossier patient informatisé
     * (dpi)
     *
     * @return String dpi
     */
    public String afficherDPI() {
        if (this.estOuvert == true) {
            return "----- DPI -----"
                    + "\nipp : " + this.ipp
                    + "\nnom : " + this.nom
                    + "\nprenom : " + this.prenom
                    + "\nDate de Naissance : " + this.dateNaissance.toString()
                    + "\nSexe : " + this.sexe
                    + "\nAdresse : " + this.adresse
                    + "\nNombre operations : " + this.operations.size()
                    + "\nNombre lettre de sorties : " + this.lettresDeSortie.size();
        } else {
            return "----- dpi -----"
                    + "\nCe DPI n'est pas ouvert \n";
        }
    }

    /**
     * Méthode permettant l'accès à une lettre de sortie pour un séjour donné
     *
     * @param sejour
     * @return LettreDeSortie
     */
    public LettreDeSortie getLettreDeSortieDuSejour(Sejour sejour) {
        int i = 0;
        while (i < this.getLettresDeSortie().size() && (this.getLettresDeSortie().get(i).getNumeroSejour().equals(sejour.getNumeroSejour()) == false)) {
            i++;
        }
        if (i == this.getLettresDeSortie().size()) {
            return null;
        } else {
            return this.getLettresDeSortie().get(i);
        }
    }

    /**
     * Méthode permettant de créer un IPP pour un patient
     *
     * @return String ipp
     */
    public static String CreerIpp() {
        String ipp;

        //Création pour les deux premiers chiffres de l'ipp
        DateFormat df3 = new SimpleDateFormat("yy");
        Date today = Calendar.getInstance().getTime();
        Calendar.getInstance();
        ipp = df3.format(today);

        //Création du reste de l'ipp
        for (int i = 0; i < 7; i++) {
            ipp = ipp + (int) (Math.random() * 10);
        }

        return ipp;
    }

}
