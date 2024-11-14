import java.util.Scanner;

public class ExerciceLivret {
    public final static int MIN = 5;
    public final static int MAX = 20;

    public static void main(String[] args) {

        int value1 = choisirUnNombre(MIN, MAX);
        int value2 = choisirUnNombre(MIN, MAX);

        String[] tableMultiple = construireTableMultiplication(value1, value2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("entrez une valeur entre 1 et " + value1 * value2 + ": ");
        int ligneChoisie = scanner.nextInt();
        while (ligneChoisie <= 0 || ligneChoisie > value1 * value2) {
            System.out.println("valeur incorecte");
            System.out.print("entrez une valeur entre 1 et " + value1 * value2 + ": ");
            ligneChoisie = scanner.nextInt();
        }
        System.out.println(tableMultiple[ligneChoisie - 1]);

        /*
         * System.out.println("Les chiffres sont : " + value1 + " " + value2 );
         * for (int i = 0; i < tableMultiple.length; i++) {
         * System.out.println(tableMultiple[i]);
         * }
         */
    }

    public static int choisirUnNombre(int min, int max) {
        int num = (int) (Math.random() * (max - min + 1)) + min;
        return num;
    }

    public static String[] construireTableMultiplication(int num1, int num2) {
        String[] tab = new String[num1 * num2];
        int facteur1 = 1;
        int facteur2 = 1;
        
        for (int i = 0; i < tab.length; i++) {
            if (facteur2 > num2) {
                facteur2 = 1;
                facteur1++;
            }
            int produit = facteur1 * facteur2;
            tab[i] = facteur1 + "x" + facteur2 + "=" + produit;
            facteur2++;
        }
        return tab;
    }

}
