import java.util.Scanner;

public class StatistiqueNotes {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double[] notes = declarerTableau();
        notes = saisirNotes(notes);
        System.out.println("La moyenne est de " + calculerMoyenne(notes));
        System.out.println("La meilleur note est de " + trouverMeilleurNote(notes));
        System.out.println("La pire notes est de " + trouverPireNote(notes));
        for (int i = 0; i < notes.length; i++) {
            if (estPromu(notes[i])) {
                System.out.println("L'élève "+ (i+1) + " est promu");
            }else{
                System.out.println("L'élève "+ (i+1) + " n'est pas promu");
            }
        }
    }

    public static double[] declarerTableau() {
        System.out.print("Nombre d'éleves : ");
        int nombreEleves = scanner.nextInt();
        double[] notes = new double[nombreEleves];
        return notes;
    }

    public static double[] saisirNotes(double[] notes) {
        for (int i = 0; i < notes.length; i++) {
            System.out.print("Entre la notes de l'éleve n° " + (i+1) + " : ");
            double note = scanner.nextInt();
            notes[i] = note;
            while (note > 6 || note < 1) {
                System.out.print("Entre la notes de l'éleve n° " + (i+1) + " : "); 
                note = scanner.nextInt();
                notes[i] = note;
            }
        }
        return notes;
    }

    public static double calculerMoyenne(double[] notes) {
        double somme = 0;
        for (int i = 0; i < notes.length; i++) {
            somme += notes[i];
        }
        double moyenne = somme/notes.length;
        return moyenne;
    }

    public static double trouverMeilleurNote(double[] notes) {
        double meilleurNote = 0;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] > meilleurNote) {
                meilleurNote = notes[i];
            }
        }
        return meilleurNote;
    }

    public static double trouverPireNote(double[] notes) {
        double pireNote = 7;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] < pireNote) {
                pireNote = notes[i];
            }
        }
        return pireNote;
    }

    public static boolean estPromu(double note) {
        boolean promu = true;
        if (note < 4) {
            promu = false;
        }
        return promu;
    }

}
