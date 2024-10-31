/**
 * Methodes
 */
public class Methodes {

    public static void main(String[] args) {

        int nb1 = 2;
        int nb2 = -4;

        System.out.println(Math.min(nb1, nb2) + " = Min");

        System.out.println(Math.max(nb1, nb2) + " = Max");

        System.out.println(Math.pow(nb1, nb2) + " = Pow");

        System.out.println(Math.sqrt(nb2) + " = Sqrt");

        System.out.println(Math.abs(nb2) + " = Abs");

        direBonjour();

        String mot = dire();
        System.out.println(mot);

    }

    public static void direBonjour() {
        System.out.println("bonjour");
    }

    public static String dire() {
        String nimportequoi = "salut";
        return nimportequoi;
    }

}