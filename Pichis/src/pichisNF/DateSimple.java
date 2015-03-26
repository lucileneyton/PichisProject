package pichisNF;

import java.util.Calendar;

/**
 *
 * @author Johann
 */
public class DateSimple implements Comparable {

    private String jour;
    private String mois;
    private String annee;
    private String heure;
    private String minute;

    /**
     * Premier constructeur de la classe DateSimple permettant d'initialiser la
     * date avec les heures et les minutes (utilisés pour la traçabilité des
     * actions)
     *
     * @param jour
     * @param mois
     * @param annee
     * @param heure
     * @param minute
     */
    public DateSimple(String jour, String mois, String annee, String heure, String minute) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
        this.heure = heure;
        this.minute = minute;
    }

    /**
     * Deuxième constructeur de la classe DateSimple permettant d'initialiser la
     * date de naissance des patients
     *
     * @param jour
     * @param mois
     * @param annee
     */
    public DateSimple(String jour, String mois, String annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;

    }

    /**
     * Méthode permettant l'accès au jour par d'autres classes
     *
     * @return String jour
     */
    public String getJour() {
        return jour;
    }

    /**
     * Méthode permettant l'accès aux heures par d'autres classes
     *
     * @return String heure
     */
    public String getHeure() {
        return heure;
    }

    /**
     * Méthode permettant l'accès aux minutes par d'autres classes
     *
     * @return String minute
     */
    public String getMinute() {
        return minute;
    }

    /**
     * Méthode permettant de modifier le jour avec un contrôle de validité au
     * niveau des champs de l'interface
     *
     * @param jour
     */
    public void setJour(String jour) {
        if (Integer.parseInt(jour) >= 1 && Integer.parseInt(jour) <= 31) {
            this.jour = jour;
        } else {
            System.out.println("Veuillez rentrer un jour valable");
        }
    }

    /**
     * Méthode permettant l'accès au mois par d'autres classes
     *
     * @return String mois
     */
    public String getMois() {
        return mois;
    }

    /**
     * Méthode permettant de modifier le mois avec un contrôle de validité au
     * niveau des champs de l'interface
     *
     * @param mois
     */
    public void setMois(String mois) {
        if (Integer.parseInt(mois) >= 1 && Integer.parseInt(mois) <= 12) {
            this.mois = mois;
        }
    }

    /**
     * Méthode permettant l'accès à l'année par d'autres classes
     *
     * @return String annee
     */
    public String getAnnee() {
        return annee;
    }

    /**
     * Méthode permettant de modifier l'année avec un contrôle de validité au
     * niveau des champs de l'interface
     *
     * @param annee
     */
    public void setAnnee(String annee) {
        if (Integer.parseInt(annee) >= 1800 && Integer.parseInt(annee) <= Calendar.getInstance().get(Calendar.YEAR)) {
            this.annee = annee;
        } else {
            System.out.println("Veuillez entrer une année correcte");
        }
    }

    /**
     * Méthode permettant l'affichage de la date
     *
     * @return String date
     */
    public String toString() {
        String date;

        if (jour.length() == 1) {
            jour = "0" + jour;
        }
        if (mois.length() == 1) {
            mois = "0" + mois;
        }
        date = this.jour + "-" + this.mois + "-" + this.annee;

        if (heure != null) {
            date += " à " + heure + ":" + minute;
        }

        return date;
    }

    /**
     * Méthode permettant de récupérer les deux derniers chiffres de l'année
     * pour la génération du numéro de séjour
     *
     * @return String annee
     */
    public String get2derniersChiffresAnnee() {
        return annee.substring(2);
    }

    /**
     * Méthode permettant de comparer deux dates afin de voir si la date voulue
     * est plus récente que la date entrée en paramètre
     *
     * @param date
     * @return boolean
     */
    public boolean estAvant(DateSimple date) {
        boolean rep = false;

        if (Integer.valueOf(annee) < Integer.valueOf(date.getAnnee())) {
            return true;
        } else if (Integer.valueOf(annee) > Integer.valueOf(date.getAnnee())) {
            return false;
        } else {
            if (Integer.valueOf(mois) < Integer.valueOf(date.getAnnee())) {
                return true;
            } else if (Integer.valueOf(mois) > Integer.valueOf(date.getAnnee())) {
                return false;
            } else {
                if (Integer.valueOf(jour) < Integer.valueOf(date.getAnnee())) {
                    return true;
                } else if (Integer.valueOf(jour) > Integer.valueOf(date.getAnnee())) {
                    return false;
                } else {
                    if (heure != null && minute != null) {
                        if (Integer.valueOf(heure) < Integer.valueOf(date.getAnnee())) {
                            return true;
                        } else if (Integer.valueOf(heure) > Integer.valueOf(date.getAnnee())) {
                            return false;
                        } else {
                            if (Integer.valueOf(minute) < Integer.valueOf(date.getAnnee())) {
                                return true;
                            } else if (Integer.valueOf(minute) > Integer.valueOf(date.getAnnee())) {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return rep;
    }

    /**
     * Méthode permettant de classer les listes de la date la plus récente à la
     * plus ancienne
     *
     * @param o
     * @return int
     */
    public int compareTo(Object o) {
        DateSimple d = (DateSimple) o;
        int resultat = 0;
//        
        if (Integer.valueOf(annee) != Integer.valueOf(d.getAnnee())) {
            if (Integer.valueOf(annee) > Integer.valueOf(d.getAnnee())) {
                resultat = -1;
            } else {
                resultat = 1;
            }
        } else {
            if (Integer.valueOf(mois) != Integer.valueOf(d.getMois())) {
                if (Integer.valueOf(mois) > Integer.valueOf(d.getMois())) {
                    resultat = -1;
                } else {
                    resultat = 1;
                }
            } else {
                if (Integer.valueOf(jour) != Integer.valueOf(d.getJour())) {
                    if (Integer.valueOf(jour) > Integer.valueOf(d.getJour())) {
                        resultat = -1;
                    } else {
                        resultat = 1;
                    }
                } else {
                    if (Integer.valueOf(heure) != Integer.valueOf(d.getHeure())) {
                        if (Integer.valueOf(heure) > Integer.valueOf(d.getHeure())) {
                            resultat = -1;
                        } else {
                            resultat = 1;
                        }
                    } else {
                        if (Integer.valueOf(minute) != Integer.valueOf(d.getMinute())) {
                            if (Integer.valueOf(minute) > Integer.valueOf(d.getMinute())) {
                                resultat = -1;
                            } else {
                                resultat = 1;
                            }
                        }
                    }
                }
            }
        }

        return resultat;
    }
}
