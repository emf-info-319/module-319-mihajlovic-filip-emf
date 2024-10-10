import java.util.Scanner;

/**
 * devoir05
 */
public class devoir05 {
    public final static int MAX = 100;
    public final static int MIN = 0;

    public static void main(String[] args) {
        int num = (int) (Math.random() * (MAX - MIN + 1)) + MIN;

        // On crée un scanner pour lire sur la ligne de commande les touches pressées
        Scanner scanner = new Scanner(System.in);
        // Voici comment lire un entier depuis la console
        System.out.print("Tente de découvrir le nombre auquel je pense : ");
        int valeur = scanner.nextInt();
        scanner.nextLine(); // pour ignorer la touche RETURN
        // On continue à utiliser le scanner dans le programme…
        while (num != valeur) {
            if (valeur > num) {
                System.out.println("trop grand !");
            } else if (valeur < num) {
                System.out.println("trop petit !");
            }
            System.out.print("réessayer : ");
            valeur = scanner.nextInt();
        }
        System.out.println("Bien joué, tu a enfin trouvé!");
        // On referme le scanner à la fin du programme
        scanner.close();
    }
}