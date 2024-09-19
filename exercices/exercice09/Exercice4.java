public class Exercice4 {
    public final static int MIN = 0;
    public final static int MAX = 100;
    public static void main(String[] args) {
        int[] tab = new tab[3];
        
        int num = (int) Math.random() * ( MAX - MIN + 1 ) + MIN;

        for (int i = 0; i < tab.length; i++) {
            tab[i] = num+1;
            int consecutif = tab[i];
            System.out.println("Cellule " + i + ":" + consecutif);
        }

     }
}

