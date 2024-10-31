public class ExerciceMethodesTableaux {
    public final static int MIN = 1;
    public final static int MAX = 100;
    public static void main(String[] args) {
        int length = 4;
        int valeurFixe = 7;

        int[] tab1 = creationTableau(length);

        int[] tab2 = remplisageTableau(tab1, valeurFixe);

        int[] tab3 = remlisageAleatoire(tab1);

        int tabLength = calculeTailleTableau(tab1) ;

//le sout si dessous sert de test
        System.out.println(tabLength);
    }

    public static int[] creationTableau(int length){
            int tab[] = new int[length];
            return tab;
        }

    public static int[] remplisageTableau(int[] tab, int valeur){
        for (int i = 0; i < tab.length; i++) {
            tab[i] = valeur;
        }
        return tab;
    }

    public static  int[] remlisageAleatoire(int[] tab){
        for (int i = 0; i < tab.length; i++) {
        tab[i] = (int) (Math.random() * ( MAX - MIN + 1 )) + MIN;
        }
        return tab;
    }

    public static int calculeTailleTableau(int[] tab){
        int length = tab.length;
        return length;
    }

}
