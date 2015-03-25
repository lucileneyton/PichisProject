/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichisNF;

import java.util.Calendar;

/**
 *
 * @author molit_000
 */
public class DateSimple implements Comparable {

    private String jour;
    private String mois;
    private String annee;
    private String heure;
    private String minute;

    public DateSimple(String jour, String mois, String annee, String heure, String minute) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
        this.heure = heure;
        this.minute = minute;
    }

    public DateSimple(String jour, String mois, String annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;

    }

    public String getJour() {
        return jour;
    }

    public String getHeure() {
        return heure;
    }

    public String getMinute() {
        return minute;
    }

    public void setJour(String jour) {
        if (Integer.parseInt(jour) >= 1 && Integer.parseInt(jour) <= 31) {
            this.jour = jour;
        } else {
            System.out.println("Veuillez rentrer un jour valable");
        }
    }

    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        if (Integer.parseInt(mois) >= 1 && Integer.parseInt(mois) <= 12) {
            this.mois = mois;
        }
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        if (Integer.parseInt(annee) >= 1800 && Integer.parseInt(annee) <= Calendar.getInstance().get(Calendar.YEAR)) {
            this.annee = annee;
        } else {
            System.out.println("Veuillez entrer une année correcte");
        }
    }

    public String toString() {
        String texte;

        if (jour.length() == 1) {
            jour = "0" + jour;
        }
        if (mois.length() == 1) {
            mois = "0" + mois;
        }
        texte = this.jour + "-" + this.mois + "-" + this.annee;

        if (heure != null) {
            texte += " à " + heure + "h" + minute;
        }

        return texte;
    }

    public String get2derniersChiffresAnnee() {
        return annee.substring(2);
    }

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

    @Override
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
