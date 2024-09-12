package exercices.exercice08;//test

public class ExerciceBoucles2 {
    public static void main(String[] args) {
        System.out.println("boucle for:");
        for(int i=5; i>0; i--){
         System.out.println(i);   
        }
        System.out.println("Décollage !!");

        boolean décollage = true;
        int décompte = 5;
        System.out.println("Boucle While:");
        while ( décollage) {
            if (décompte>0) {
                System.out.println(décompte);
                décompte--;
            }
            else  {
                décollage=false;
                System.out.println("Décollage !!");
            }
        }
        
        int i=5;
        System.out.println("Boucle do-while:");
        do{
            System.out.println(i);
            i--;
        }
        while(i>0);
        System.out.println("Décollage !!");
    }
}
