package cours;

import java.util.Scanner;

public class IntroMethodes {
    public static void main(String[] args) {

        start();

        int nombre1 = demandeNombre();
        int nombre2 = demandeNombre();
        int nombre3 = demandeNombre();
        int total = somme(nombre1, nombre2, nombre3);
        System.out.println("la somme est : " + total);

        end();
    }

    public static int demandeNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre :> ");
        int nombre = scanner.nextInt();
        System.out.println("Merci j'enregistre " + nombre + "!");
        return nombre;
    }

    public static int somme(int nombre1, int nombre2, int nombre3) {
        int total = nombre1 + nombre2 + nombre3;
        return total;
    }

    public static void start() {
        System.out.println("bounjour et bien venu dans ce premier programme.");
        System.out.println("On va voir les méthodes dans ce cours.");
    }

    public static void end() {
        System.out.println("Programe terminé");
    }
}
