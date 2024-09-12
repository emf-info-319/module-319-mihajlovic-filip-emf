package exercices.exercice08;

/**
 * ExerciceBoucles1
 */
public class ExerciceBoucles1 {

    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            System.out.println("boucle for, itération "+i);
        }

        int i=1;
        while (i<=5) {
            System.out.println("boucle while, itération "+ i);
            i++;
        }
        i=0;
        do {
            i++;
            System.out.println("boucle do.while,itétation " + i);
        } while (i<5);
        for( i=1; i<=5; i++){
            if (i==3) {
                continue;
            }
            System.out.println("boucle for, itération "+i);
        }
        i=1;
        while (i<=5) {
            if (i>3) {
                break;
            }
            System.out.println("boucle while, itération "+ i);
            i++;;
        }
    }
}