
public class ExerciceInversionTableau {
    public final static int MAX = 100;
    public final static int MIN = 0;

    public static void main(String[] args) {
        int[] tableauInitial = new int[4];
        
        System.out.print("Le tableau initial est :");
        for (int i = 0; i < tableauInitial.length; i++) {
            tableauInitial[i]= (int) (Math.random() * ( MAX - MIN + 1 )) + MIN;
            System.out.print(" " + tableauInitial[i]);
        }
        
        System.out.println();
        int[] tableauFinal = inverseTableau(tableauInitial);
        System.out.print("Le final est :");
        for (int i = 0; i < tableauFinal.length; i++) {
            System.out.print(" " + tableauFinal[i]);
        }

    }

    public static int[] inverseTableau(int[] tab) {
        int[] revertedTab = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            revertedTab[i] = tab[tab.length - 1 - i];
        }
        return revertedTab;
    }
}