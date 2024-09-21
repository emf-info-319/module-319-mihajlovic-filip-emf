package devoirs.devoir03;


public class Devoir3 {
    public static void main(String[] args) {
        int jour = 20;
        int mois = 9;
        int annee = 2024;
        int[] tab;
        tab = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        int jourtotal = 0;
        if (annee % 4 == 0 || annee % 400 == 0) {
            tab[2] = 29;
            
        }
        for (int i = 0; i < mois; i++) {
         jourtotal = jourtotal + tab[i];
        }
        System.out.println("Le " + jour + "/" + mois + "/" + annee + " est le jour " + jourtotal + " de l'An");
 
    }
}