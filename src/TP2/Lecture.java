package TP2;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 * Created by xyevs on 2017-02-09.
 *
 * La plupart du code ici est inspirer sur internet. J'ai utiliser
 * beaucoup de code d'un site que j'ai perdu la page web.
 */
public class Lecture {

    private String chemin;

    public Lecture (String fichierChemin){
        chemin = fichierChemin;
    }

    public String[] ouvrirFichier() throws IOException{

        FileReader lireFichier = new FileReader(chemin);
        BufferedReader textReader = new BufferedReader(lireFichier);
        int nombreLigne = lireLigne();
        String[] donneeTexte = new String[nombreLigne];

        for (int i = 0; i < nombreLigne; i++){
            donneeTexte[i] = textReader.readLine();
        }

        textReader.close();
        return donneeTexte;
    }

    private int lireLigne() throws IOException{

        FileReader fichierALire = new FileReader(chemin);
        BufferedReader fichier = new BufferedReader(fichierALire);

        String ligne;
        int nombreLigne = 0;

        while ((ligne = fichier.readLine()) != null){
            nombreLigne++;
        }

        fichier.close();
        return nombreLigne;
    }

    public void fichier() {

        String nomFichier = "C:/Users/xyevs/OneDrive/Documents/IntelliJ/BattleRoyal/src/TP2/nom.txt";

        try {
            Lecture fichier = new Lecture(nomFichier);
            String[] arrayLigne = fichier.ouvrirFichier();

            for (int i = 0; i < arrayLigne.length; i++) {
                System.out.println(arrayLigne[i]);
            }
        } catch (IOException exeption) {
            System.out.println(exeption.getMessage());
        }

    }
}
