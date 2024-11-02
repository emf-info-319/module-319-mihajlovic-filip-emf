public class ExerciceMethodesTableaux {
    public final static int MIN = 1;
    public final static int MAX = 100;
    public final static int TAB_LENGTH = (int) (Math.random() * ( MAX - MIN + 1 )) + MIN;
    public final static int VALEUR_A_REMPLACER = (int) (Math.random() * ( MAX - MIN + 1 )) + MIN;
    public final static int VALEUR_DE_REMPLACEMENT = (int) (Math.random() * ( MAX - MIN + 1 )) + MIN;
    public final static int NOMBRE_A_TROUVER = (int) (Math.random() * ( MAX - MIN + 1 )) + MIN;

    public static void main(String[] args) {

        int[] tab = creationTableau(TAB_LENGTH);
        tab = remlisageAleatoire(tab);
        int tabLength = calculeTailleTableau(tab);

        System.out.println("Le tableau a une taille de " + tabLength + " cellules\n\n");
        affichageContenuTableau(tab);

        int min = calculerMinimumTableau(tab);
        int max = calculerMaximumTableau(tab);
        System.out.println("La valeur minimum trouvée = " + min);
        System.out.println("La valeur maximum trouvée = " + max);

        tab = remplacerValeurTableau(tab, VALEUR_A_REMPLACER, VALEUR_DE_REMPLACEMENT);
        System.out.println("\n\nAprès remplacement de la valeur " + VALEUR_A_REMPLACER + " par la valeur " + VALEUR_DE_REMPLACEMENT + " voici le contenu du tableau");
        affichageContenuTableau(tab);

        int somme = calculerSommeTableau(tab);
        int moyenne = calculerMoyenneTableau(tab);
        System.out.println("\n\nLa somme des cellules du tableau = " + somme);
        System.out.println("La moyenne des cellules du tableau = " + moyenne);

        int premierApparition = calculerPremierApparitionNombre(tab, NOMBRE_A_TROUVER);
        int dernierApparition = calculrerDernierApparitionNombres(tab, NOMBRE_A_TROUVER);

        if (premierApparition == -1) {
            System.out.println("Le nombre " +  NOMBRE_A_TROUVER + " n'apparait pas dans le tableau");
        }
        else if (premierApparition != dernierApparition) {
            System.out.println("La valeur " + NOMBRE_A_TROUVER + "à été trouvée pour la 1ère fois en position N°" + premierApparition);
            System.out.println("La valeur " + NOMBRE_A_TROUVER + "à été trouvée pour la dernier fois en position N°" + dernierApparition);
        }
        else if (premierApparition == dernierApparition) {
            System.out.println("La valeur " + NOMBRE_A_TROUVER + "n'a été touvée qu'une seule fois en position N°" + premierApparition);
        }


    }

    // ex1
    public static int[] creationTableau(int length) {
        int tab[] = new int[length];
        return tab;
    }

    // ex2
    public static int[] remplisageTableau(int[] tab, int value) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = value;
        }
        return tab;
    }

    // ex3
    public static int[] remlisageAleatoire(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        }
        return tab;
    }

    // ex4
    public static int calculeTailleTableau(int[] tab) {
        int length = tab.length;
        return length;
    }

    // ex5
    public static void affichageContenuTableau(int[] tab) {
        System.out.println("Contenu du tableau aléatoire : :");
        for (int i = 0; i < tab.length; i++) {
            System.out.println("tab[" + i + "]=" + tab[i]);
        }
    }

    // ex6
    public static int calculerMinimumTableau(int[] tab) {
        int min = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (min > tab[i]) {
                min = tab[i];
            }
        }
        return min;
    }

    // ex7
    public static int calculerMaximumTableau(int[] tab) {
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (max < tab[i]) {
                max = tab[i];
            }
        }
        return max;
    }

    // ex8
    public static int calculerFrequanceNombre(int[] tab, int value) {
        int nombreFréquance = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == value) {
                nombreFréquance++;
            }
        }
        return nombreFréquance;
    }

    // ex9
    public static int calculerSommeTableau(int[] tab) {
        int somme = 0;
        for (int i = 0; i < tab.length; i++) {
            somme += tab[i];
        }
        return somme;
    }

    // ex10
    public static int calculerMoyenneTableau(int[] tab) {
        int somme = 0;
        for (int i = 0; i < tab.length; i++) {
            somme += tab[i];
        }
        int moyenne = somme / tab.length;
        return moyenne;
    }

    // ex11
    public static int[] remplacerValeurTableau(int[] tab, int valueToReplace, int newValue) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valueToReplace) {
                tab[i] = newValue;
            }
        }
        return tab;
    }

    // ex12
    public static int calculerPremierApparitionNombre(int[] tab, int valueToSearch) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valueToSearch) {
                return i;
            }
        }
        return -1;
    }

    // ex13
    public static int calculrerDernierApparitionNombres(int[] tab, int valueToSearch) {
        int lastApparition = -1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valueToSearch) {
                lastApparition = i;
            }
        }
        return lastApparition;
    }
}
