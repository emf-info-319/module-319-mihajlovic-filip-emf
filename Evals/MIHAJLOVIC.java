package E0;

/**
 * MIHAJLOVIC
 */
public class MIHAJLOVIC {
    public final static int NOTE_MIN = 1;
    public final static int NOTE_MAX = 6;
    public final static int NBRE_NOTES = 5;

    public static void main(String[] args) {
        int[] notesObtenues = new int[NBRE_NOTES];
        for (int i = 0; i < notesObtenues.length; i++) {
            int random = (int) (Math.random() * (NOTE_MAX - NOTE_MIN + 1)) + NOTE_MIN;
            notesObtenues[i] = random;
        }

        int totalNote = 0;

        for (int i = 0; i < notesObtenues.length; i++) {
            totalNote += notesObtenues[i];
            System.out.print("La note obtenue est " + notesObtenues[i] + " : ");
            switch (notesObtenues[i]) {
                case 4:
                    System.out.println("Suffisant");
                    break;
                case 5:
                    System.out.println("Bien");
                    break;
                case 6:
                    System.out.println("Très bien");
                    break;
                default:
                    System.out.println("Insuffisant");

            }
        }
        float moyenne = (float) totalNote / NBRE_NOTES;

        System.out.println("La moyenne obtenue est de : " + moyenne);
        
        if (moyenne > 4) {
            System.out.println("L'élève est promu !");
        } else {
            System.out.println("L'élève non est promu !");
        }
    }
}