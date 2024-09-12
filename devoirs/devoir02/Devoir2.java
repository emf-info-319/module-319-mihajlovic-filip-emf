package devoirs.devoir02;

public class Devoir2 {
    public final static int CAPACITE_RESERVOIR_A = 3;
    public final static int CAPACITE_RESERVOIR_B = 5;
    
    public static void main(String[] args) {
        int reservoirA = 0;
        int reservoirB = 0;
        int remplissage = (int)(Math.random()*(5-0+1))+0;

        do{
            reservoirA = reservoirA + remplissage;
        }
        while ( reservoirA <=CAPACITE_RESERVOIR_A);
    }
}
