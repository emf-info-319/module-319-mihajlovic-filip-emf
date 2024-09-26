package revisions.SetExercicesJava;

public class DoubleTableaux {
    public static void main(String[] args) {
        int[] tableau1;
        int[] tableau2;
        int[] résultat;
        résultat = new int[8];
        tableau2 = new int[]{2,34,9,3,4,0,7,4};
        tableau1 = new int[]{4,89,7,65,8,5,9,91};
        System.out.print("tableau1 : ");
        for (int i = 0; i < tableau1.length; i++) {
            System.out.print(tableau1[i] + " ");
        }
        System.out.println();
        System.out.print("tableau2 : ");
        for (int i = 0; i < tableau2.length; i++) {
            System.out.print(tableau2[i] + " ");
        }
        System.out.println();
        System.out.print ( "résultat : ");
        for (int i = 0; i < résultat.length; i++) {
            résultat[i] = tableau1[i] + tableau2[i];
            System.out.print(résultat[i] + " ");
        }
        }
    }

