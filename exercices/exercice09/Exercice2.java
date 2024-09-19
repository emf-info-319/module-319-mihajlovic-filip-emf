package exercices.exercice09;

public class Exercice2 {
    public final static int MIN = 1;
    public final static int MAX = 6;
    public static void main(String[] args) {
        int[] tab;
        tab = new int[10];
    
        for (int y = 0; y < tab.length; y++) {
          int i = (int) ( Math.random() * (MAX - MIN + 1))+ MIN;
          tab[y] = i; 
        }
        for (int i=0; i < tab.length; i++) {
            int valeurCellule=tab[i];
            System.out.println("Cellule " + i + " : " + valeurCellule);
        }
    }
}
