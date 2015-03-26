package pichisNF;

import java.util.ArrayList;

public class DMA {

    private ArrayList<Sejour> sejour;

    /**
     * Constructeur de la classe Dossier Médical Administratif (DMA)
     *
     */
    public DMA() {
        this.sejour = new ArrayList<Sejour>();
    }

    /**
     * Méthode permettant l'accès à un séjour appartenant à la liste de séjours
     * par d'autres classes
     *
     * @param i indice dans la liste de séjours
     * @return Sejour
     */
    public Sejour getSejour(int i) {
        return this.sejour.get(i);
    }

    /**
     * Méthode permettant l'accès de la liste de séjours par d'autres classes
     *
     * @return ArrayList sejour
     */
    public ArrayList<Sejour> getListeSejours() {
        return this.sejour;
    }

    /**
     * Méthode permettant l'ajout d'un séjour à la liste de séjours
     *
     * @param sejour
     */
    public void ajouterSejour(Sejour sejour) {
        this.sejour.add(sejour);
    }

    /**
     * Méthode permettant de retourner le dernier séjour d'un patient avec la
     * date d'entrée la plus récente
     *
     * @return Sejour
     */
    public Sejour getDernierSejour() {
        int index = 0;
        DateSimple dateRecente;

        if (this.getListeSejours().isEmpty() == false) {
            dateRecente = this.getListeSejours().get(0).getDateEntree();

            for (int i = 1; i < this.getListeSejours().size(); i++) {
                if (this.getListeSejours().get(i).getDateEntree().estAvant(dateRecente)) {
                    index = i;
                    dateRecente = this.getListeSejours().get(i).getDateEntree();
                }
            }
            return this.getSejour(index);
        } else {
            return null;
        }

    }
}
