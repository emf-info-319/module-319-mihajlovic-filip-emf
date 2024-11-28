import java.util.Scanner;

public class MIHAJLOVIC_E2 {
    public final static int NOMBRE_BATONNETS = 21;
    public final static int MIN = 1;
    public final static int MAX = 3;

    public static void main(String[] args) {
        int[] batonnets = new int[NOMBRE_BATONNETS];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < batonnets.length; i++) {
            batonnets[i] = 1;
        }
        System.out.println("Bien venu dans le jeu de Nim !");
        System.out.println("Vous et l'IA retirez tour à tour entre 1 et 3 bâtonnets.");
        System.out.println("Le joueur qui retire le dernier bâtonnet perd.");
        boolean tourJoueur = true;
        while (nbBatonnetRestants(batonnets) > 0) {
            afficherbatonnets(batonnets);
            tourJoueur = !tourJoueur;
            if (tourJoueur) {
                int nbEnleve = demanderNombre(scanner);
                enleverBatonners(batonnets, nbEnleve);
            } else {
                int nbEnleveIA = genererNombre(MIN, MAX);
                System.out.println("L'IA enlève " + nbEnleveIA + " batonnets");
                enleverBatonners(batonnets, nbEnleveIA);
            }
        }
        if (tourJoueur) {
            System.out.println("Vous avez retiré le dernier bâtonnet. L'IA gagne !");
        }else{
            System.out.println("L'IA a retiré le dernier bâtonnet. Vous gagnez !");
        }
        scanner.close();
    }

    public static int genererNombre(int min, int max) {
        int num = (int) (Math.random() * (max - min + 1)) + min;
        return num;
    }

    public static void afficherbatonnets(int[] batonnets) {
        System.out.println();
        for (int i = 0; i < batonnets.length; i++) {
            if (batonnets[i] == 1) {
                System.out.print("| ");
            } else {
                System.out.print("- ");
            }
        }
        System.out.println();
    }

    public static int nbBatonnetRestants(int[] batonnets) {
        int nbBattonnets = 0;
        for (int i = 0; i < batonnets.length; i++) {
            if (batonnets[i] == 1) {
                nbBattonnets++;
            } else {
                continue;
            }
        }
        return nbBattonnets;
    }

    public static int[] enleverBatonners(int[] batonnets, int nbEnleve) {
        int nbRestants = nbBatonnetRestants(batonnets);
        int nbEnleveMax = Math.min(nbRestants, nbEnleve);
        for (int i = (batonnets.length - 1); nbEnleveMax > 0; i--) {
            if (batonnets[i] == 1) {
                batonnets[i] = 0;
                nbEnleveMax--;
            }
        }
        return batonnets;
    }

    public static int demanderNombre(Scanner scanner) {
        System.out.println("entrez un nombre entre 1 et " + MAX);
        int valeur = scanner.nextInt();
        if (valeur < 1 || valeur > 3) {
            System.out.println("entrez un nombre entre 1 et " + MAX);
            valeur = scanner.nextInt();
        }
        return valeur;
    }
}
