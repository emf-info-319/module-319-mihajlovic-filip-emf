package revisions.RP;

public class Exemples_RP {
    public final static int MAX = 100;
    public final static int MIN = 0;

    public static void main(String[] args) {

        int valeur = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        if (valeur < 0 ) {
            System.out.println("est positif");
        } else {
            System.out.println("est négatif");
        }

    }
}
