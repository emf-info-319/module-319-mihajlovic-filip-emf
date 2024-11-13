public class Devoir6 {
    public final static int TAILLE_TABLEAU = 20;
    public final static int VALEUR_MIN = 0;
    public final static int VALEUR_MAX = 50;
    public final static int VALEUR_RECHERCHEE = 7;

    public static void main(String[] args) {
        int[] tableau = genereTableau(VALEUR_MIN, VALEUR_MAX, TAILLE_TABLEAU);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("tableau[" + i + "] = " + tableau[i]);

        }
        System.out.println("La plus petite valeur touvée est : " + rechercheMin(tableau));
        System.out.println("La plus grande valeur trouvée est : " + rechercheMax(tableau));
        if (rechercheValeur(tableau, VALEUR_RECHERCHEE) == -1) {
            System.out.println("La valeur " + VALEUR_RECHERCHEE + " N'a pas été trouvé");
        } else {
            System.out.println("Le nombre " + VALEUR_RECHERCHEE + " figure à la position "
                    + rechercheValeur(tableau, VALEUR_RECHERCHEE));
        }
    }

    public static int[] genereTableau(int min, int max, int length) {
        int[] tab = new int[length];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return tab;
    }

    public static int rechercheMin(int[] tab) {
        int min = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (min > tab[i]) {
                min = tab[i];
            }
        }
        return min;
    }

    public static int rechercheMax(int[] tab) {
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (max < tab[i]) {
                max = tab[i];
            }
        }
        return max;
    }

    public static int rechercheValeur(int[] tab, int valeurRecherche) {
        int position = -1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeurRecherche) {
                position = i;
            }
        }
        return position;
    }

}