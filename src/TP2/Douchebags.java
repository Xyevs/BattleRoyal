package TP2;

/**
 * Created by xyevs on 2017-02-23.
 */
public class Douchebags {
/*
    String nomFichier = "C:/Users/xyevs/OneDrive/Documents/IntelliJ/BattleRoyal/src/TP2/nom.txt";
    Lecture lec = new Lecture(nomFichier);
    lec.fichier();
*/

    private static final double BASE_NB_ETUDIANT = 41;
    private static final double BASE_POINT_VIE = 100;

    private double nombreZombies;
    private double pointVie;

    private void subirDegat(double degat){
        pointVie -= degat;
    }

    public boolean estMort(){
        return pointVie <= 0.0;
    }

    public double attaquer(){
        if (estMort()){
            return 0;
        }

        return pointVie;
    }
}
