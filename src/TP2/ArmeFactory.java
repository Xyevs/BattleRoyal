package TP2;

/**
 * Created by xyevs on 2017-02-23.
 */
public class ArmeFactory {
    public static Arme creerCouteau() {
        Arme arme = new Arme("Couteau", 0.1);
        arme.setTranchante(true);
        return arme;
    }

    public static Arme creerKatana() {
        Arme arme = new Arme("katana", 1);
        arme.setTranchante(true);
        return arme;
    }

    public static Arme creerPistolet() {
        Arme arme = new Arme("Pistolet", 0.6);
        return arme;
    }

    public static Arme creerShotgun() {
        Arme arme = new Arme("Shotgun", 1.5);
        return arme;
    }


    public static Arme creerGrenadeLauncher() {
        Arme arme = new Arme("GrenadeLauncher", 4);
        return arme;
    }

}

