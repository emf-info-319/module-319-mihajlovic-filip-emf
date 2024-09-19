public class Exercice3 {

    public final static int MIN = 1;
    public final static int MAX = 6;
    public static void main(String[] args) {
        int[] tab;
        tab = new int[10];
    
        for (int y = 0; y < tab.length; y++) {
          int i = (int) ( Math.random() * (MAX - MIN + 1))+ MIN;
          tab[y] = i; 
        }
        int valeurCellule = 0;
        for (int i=0; i < tab.length; i++) {    
            valeurCellule= valeurCellule + tab[i];
            System.out.println("Note élève " + (i + 1) + " : " + tab[i]);
        }
        int moyenne=valeurCellule/10;
        System.out.println("La moyenne de la classe est de " + moyenne);
    }
}
