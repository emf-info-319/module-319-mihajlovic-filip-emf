


public class Devoir3 {
    public static void main(String[] args) {
        int jour = 21;
        int mois = 2;
        int annee = 2024;
        int[] tab;
        tab = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        int jourtotal = 0;
        if (annee % 4 == 0 || annee % 400 == 0) {
            tab[1] = 29;  
        }
        
        for (int i = 0; i < mois - 1; i++) {
         jourtotal = jourtotal + tab[i];
        }

        jourtotal = jourtotal + jour;
        System.out.println("Le " + jour + "/" + mois + "/" + annee + " est le jour " + jourtotal + " de l'An");
 
    }
}