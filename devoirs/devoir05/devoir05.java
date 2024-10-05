import java.util.Scanner;

/**
 * devoir05
 */
public class devoir05 {
    public final static int MAX = 100;
    public final static int MIN = 0;
    public static void main(String[] args) {
        int num = (int) (Math.random() * ( MAX - MIN + 1 )) + MIN;

// On crée un scanner pour lire sur la ligne de commande les touches pressées
Scanner scanner = new Scanner( System.in );
// Voici comment lire un entier depuis la console
System.out.print( "Entrez une valeur svp : " );
int valeur = scanner.nextInt();
scanner.nextLine(); // pour ignorer la touche RETURN
// On continue à utiliser le scanner dans le programme…
// On referme le scanner à la fin du programme
scanner.close();
    }
}