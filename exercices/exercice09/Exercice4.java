public class Exercice4 {
    public final static int MIN = 0;
    public final static int MAX = 95;
    public static void main(String[] args) {
        int[] tableau;
        tableau = new int[5];

        int num = (int) (Math.random() * ( MAX - MIN + 1 )) + MIN;
        
        for (int i = 0; i < tableau.length; i++) {
            num++;
            tableau[i] = num;
            System.out.println("Cellule " + i + " : " + tableau[i]);
        }

     }
}

