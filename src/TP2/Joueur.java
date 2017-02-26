package TP2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by xyevs on 2017-02-21.
 */
public class Joueur {

    private String nom;
    private double pointVie;
    private ArrayList<Arme> arme;

    public Joueur(String nom) {
        this.nom = nom;
        pointVie = 100;

    }

    public void subirDegat(double degat) {
        pointVie -= degat;
    }

    public boolean estMort() {
        return pointVie <= 0.0;
    }

    public double attaquer() {
        int choix = selectionnerArme();

        if (choix == 99) {
            return 0;
        }
        return arme.get(choix).attaquer();
    }

    public void afficherInformation() {
        System.out.print(nom + " [" + Console.ANSI_GREEN);
        int totalVitalite = (int) (pointVie / 10);
        for (int i = 0; i < totalVitalite; ++i) {
            System.out.print("\u2764");
        }
        for (int i = 0; i < (10 - totalVitalite); ++i) {
            System.out.print(" ");
        }
        System.out.println(Console.ANSI_RESET + "]");
    }

    private int selectionnerArme() {
        boolean estValide;
        int choix;

        do {
            afficherSelectionArme();
            System.out.println("99 - Ne rien faire");
            System.out.println("Votre choix : ");
            Scanner scanner = new Scanner(System.in);
            choix = scanner.nextInt();
            estValide = estSelectionValide(choix);
        } while (!estValide);
        return choix;
    }

    public void ajouterArme(Arme arme) {
       // arme.add(arme);
    }

    private void afficherSelectionArme() {
       /*
        for (int i = 0; i < arme.size(); ++i) {
            Arme arme = arme.get(i);
            System.out.print(i + " - ");
            arme.afficher();
        }
        */
    }

    private boolean estSelectionValide(int choix) {
        if (choix < 0 || (choix >= arme.size() && choix != 99)) {
            System.out.println(Console.ANSI_RED + "Choix invalide. Veillez faire un autre choix");
            return false;
        }
/*
        if (choix != 99) {
            Arme arme = arme.get(choix);
            if (!arme.estTranchate() && arme.getMunition() <= 0) {
                System.out.println(Console.ANSI_RED + "L'armes n'a plus de munitions. Faites une autre choix");
                return false;
            }
        }
        */
        return true;
    }
}

