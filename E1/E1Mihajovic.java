package E1;

import java.util.Scanner;

public class E1Mihajovic {
    public final static int DES_MIN = 1;
    public final static int DES_MAX = 6;
    public final static int NOMBRES_TUILES = 12;
    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] tuiles = new int[NOMBRES_TUILES];
        boolean enJeu = true;
        System.out.println("**********************************");
        System.out.println("       * 'Shut The Box' *");
        System.out.println("**********************************");
        System.out.println("Il faut baisser les tuiles pour avoir un total équivalent au total de la sommes des dès. Le 0 permet de terminer la partie.");
        for (int i = 0; i < tuiles.length; i++) {
            tuiles[i] = 1;
        }
        while (enJeu) {
            affichetuiles(tuiles);
            int totalDes = tireLesDes();
            System.out.println("Donnez le(s) nombre(s) à enlever : ");
            tuiles = enleveTuiles(tuiles, totalDes);
            boolean encore = contientEncoreDesTuilesABaisser(tuiles);
            if (encore == false) {
                System.out.println("Jeu terminé");
                SCANNER.close();
                enJeu = false;
            }
        }
    }

    public static void affichetuiles(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 0) {
                System.out.print("|__");
            } else if (tab[i] < 0 && tab[i] > 10) {
                System.out.print("|0" + (i + 1));
            } else {
                System.out.print("|" + (i + 1));
            }
        }
        System.out.println("|");
    }

    public static boolean contientEncoreDesTuilesABaisser(int[] tab) {
        boolean vraiFaux = false;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 1) {
                vraiFaux = true;
                return vraiFaux;
            }
        }
        return vraiFaux;
    }

    public static int[] copieTableau(int[] tabInitial) {
        int[] copie = new int[tabInitial.length];
        for (int i = 0; i < copie.length; i++) {
            copie[i] = tabInitial[i];
        }
        return copie;
    }

    public static int tireLesDes() {
        int de1 = (int) (Math.random() * (DES_MAX - DES_MIN + 1)) + DES_MIN;
        int de2 = (int) (Math.random() * (DES_MAX - DES_MIN + 1)) + DES_MIN;
        int somme = de1 + de2;
        System.out.println("Les nombres tirés sont : " + de1 + " et " + de2 + " ce qui font un total de " + somme);
        return somme;
    }

    public static int[] enleveTuiles(int[] tuiles, int totalDes) {
        int[] tuilesTemp = copieTableau(tuiles);
        int totalEnleve = 0;
        boolean demandeEncore = true;
        do {
            int valeur = SCANNER.nextInt();
            totalEnleve += valeur;
            if (valeur == 0) {
                System.out.println("Abandon…");
                for (int i = 0; i < tuilesTemp.length; i++) {
                    tuilesTemp[i] = 0;
                }
                copieTableau(tuilesTemp);
                demandeEncore = false;
            } else if (valeur < 1 || valeur > tuilesTemp.length + 1) {
                System.out.println("Hors limites !");
                totalEnleve = 0;
            } else if (tuilesTemp[valeur - 1] == 0) {
                System.out.println("Vous avez déjà baissé la tuile à la position " + valeur);
                totalEnleve -= valeur;
            } else {
                if (totalEnleve < totalDes) {
                    tuilesTemp[valeur - 1] = 0;
                    System.out.println("Ce n'est pas suffisant, merci d'enlever encore");
                } else if (totalEnleve > totalDes) {
                    System.out.println("Le total est dépassez, choisissez d'autres nombres");
                    tuilesTemp = copieTableau(tuiles);
                    totalEnleve = 0;
                    affichetuiles(tuiles);
                } else {
                    tuilesTemp[valeur - 1] = 0;
                    System.out.println("Parfait !");
                    tuiles = copieTableau(tuilesTemp);
                    demandeEncore = false;
                }
            }
        } while (demandeEncore);
        return tuiles;
    }
}
