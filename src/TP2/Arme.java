package TP2;

/**
 * Created by xyevs on 2017-02-21.
 */
public class Arme {
    private String nom;
    private int munition;
    private boolean tranchante;
    private double degat;

    public Arme(String nom, double degat) {
        this.nom = nom;
        this.degat = degat;
        tranchante = false;
        munition = 0;
    }

    public double attaquer(){
        if (!tranchante){
            munition--;
        }
        return degat;
    }

    public void afficher() {
        String message = nom;
        if (!tranchante) {
            message += " (" + munition + ")";
        }
        System.out.println(message);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void incrementMunition(int munition) {
        this.munition += munition;
    }

    public void setTranchante(boolean tranchante) {
        this.tranchante = tranchante;
    }

    public void setDegat(double degat) {
        this.degat = degat;
    }

    public boolean estTranchate(){
        return tranchante;
    }

    public int getMunition(){
        return munition;
    }
}