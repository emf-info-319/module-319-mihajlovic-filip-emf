package devoirs.devoir02;

public class Devoir2 {

    public final static int CAPACITE_RESERVOIR_A = 3;
    public final static int CAPACITE_RESERVOIR_B = 5;

    /**
     * @param args
     */
    public static void main(String[] args) {

        int reservoirA = 0;
        int reservoirB = 0;
        int remplissage = (int) (Math.random() * (CAPACITE_RESERVOIR_A + CAPACITE_RESERVOIR_B - 0 + 1)) + 0;
        System.out.println("Il y a " + (CAPACITE_RESERVOIR_B) + " litres à remplir.");

        while (reservoirA < CAPACITE_RESERVOIR_A) {
            System.out.println("Remlissage du réservoir A...");
            reservoirA = reservoirA + remplissage;

            if (reservoirA > CAPACITE_RESERVOIR_A) {
                reservoirA = 3;
                reservoirB = remplissage - reservoirA;
            }

            System.out.println("Le réservoir A : " + reservoirA + ", le réservoir B : " + reservoirB);
        }
        while (reservoirB < CAPACITE_RESERVOIR_B) {
            System.out.println("Remlissage du réservoir B...");
            reservoirB = reservoirB + remplissage;
            if (reservoirB > CAPACITE_RESERVOIR_B) {
                reservoirB = 5;
            }
            System.out.println("Le réservoir A : " + reservoirA + ", le réservoir B : " + reservoirB);
        }
        System.out.println("Remplissage terminé!");

    }
}
