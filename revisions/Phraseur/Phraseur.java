import java.util.stream.Stream;

public class Phraseur {
    public final static int MIN = 0;
    public final static int NOMBRE_DE_PHRASES = 10;

    public static void main(String[] args) {
        String[] sujets = new String[] { "Filip", "Thomas", "Alex", "Ephram", "Mamadou", "Jean", "Paul","Francis Nganou", "Naza", "Poutine", "César" };
        String[] verbes = new String[] { "mange", "bois", "lance", "se bat avec", "trouve", "embrasse", "joue sur" };
        String[] choses = new String[] { "une pomme", "un livre", "un ours", "des enfants", "sa femme", "un canapé" };
        for (int i = 0; i < NOMBRE_DE_PHRASES; i++) {
            String sujet = choisirMot(sujets);
            String verbe = choisirMot(verbes);
            String chose = choisirMot(choses);
            System.out.println(sujet + " " + verbe + " " + chose);
        }
    }

    public static int nbreAleatoire(int min, int max) {
        int num = (int) (Math.random() * (max - min + 1)) + min;
        return num;
    }

    public static String choisirMot(String[] mots) {
        int num = nbreAleatoire(MIN, (mots.length - 1));
        String mot =mots[num];
        return mot;
    }
}