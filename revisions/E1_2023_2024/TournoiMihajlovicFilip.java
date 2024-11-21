/**
 * TournoiMihajlovicFilip
 */
public class TournoiMihajlovicFilip {
    public final static String[] EQUIPES = new String[] { "FC Richemont", "FC Central", "FC Schoenberg",
            "FC Beauregard", "Team AFF", "Etoile Sport" };
    public final static int MAX_GOALS = 10;
    public static int[] pointsEquipes = new int[6];
    public static void main(String[] args) {
        for (int i = 0; i < EQUIPES.length; i++) {
            simuleMatch(i, i + 1);
            if (i == EQUIPES.length - 1) {
                simuleMatch(i, 0);
            }
        }
        System.out.println("-------------------------------------");
        for (int i = 0; i < pointsEquipes.length; i++) {
            System.out.println("l'équipe " + EQUIPES[i] + " a " + pointsEquipes[i] + " points");
        }
        System.out.println("-------------------------------------");
        int[] gagnants;
    }

    public static int genererNombre(int min, int max){
        int num = (int) (Math.random() * ( max - min + 1 )) + min;
        return num;
    }

    public static int[] simuleMatch(int index1, int index2){
        int scoreEquipe1 = genererNombre(0, MAX_GOALS);
        int scoreEquipe2 = simuleMatch(0, MAX_GOALS);
        if (scoreEquipe1 > scoreEquipe2) {
            pointsEquipes[index1]+=3;
            System.out.println("L'équipe " EQUIPES[index1]);
        }else
        if (scoreEquipe2> scoreEquipe1) {
            pointsEquipes[index2]+=3;
        }
    }

    public static void trouveGagnant( ){

    }
}