/**
 * TournoiMihajlovicFilip
 */
public class TournoiMihajlovicFilip {
    public final static String[] EQUIPES = new String[] { "FC Richemont", "FC Central", "FC Schoenberg",
            "FC Beauregard", "Team AFF", "Etoile Sport" };
    public final static int MIN_GOALS = 0;
    public final static int MAX_GOALS = 10;
    public static int[] pointsEquipes = new int[EQUIPES.length];

    public static void main(String[] args) {
        for (int i = 0; i < EQUIPES.length; i++) {
            if (i == 0 || i == (EQUIPES.length - 1)) {
                simuleMatch(0, (EQUIPES.length - 1));
            } else {
                simuleMatch(i, i + 1);
            }
        }
        System.out.println("----------------------------------");
        for (int i = 0; i < EQUIPES.length; i++) {
            System.out.println("l'équipe " + EQUIPES[i] + " a " + pointsEquipes[i]);
        }
        System.out.println("----------------------------------");
        int[] gagnants = trouveGagnants();
        
            if (gagnants.length > 1) {
                System.out.print("Les gagnants sont : ");
                for (int i = 0; i < gagnants.length; i++) {
                    System.out.print(EQUIPES[i] + ", ");
                }
            } else {
                System.out.println("L'équipe " + EQUIPES[0] + " a gagné");
            }
        
    }

    public static void simuleMatch(int index1, int index2) {
        int scoreEquipe1 = genererNombre(MIN_GOALS, MAX_GOALS);
        int scoreEquipe2 = genererNombre(MIN_GOALS, MAX_GOALS);
        if (scoreEquipe1 > scoreEquipe2) {
            System.out.println("L'équipe " + EQUIPES[index1] + " a gagné contre l'équipe " + EQUIPES[index2]);
            pointsEquipes[index1] += 3;
        } else if (scoreEquipe2 > scoreEquipe1) {
            System.out.println("L'équipe " + EQUIPES[index2] + " a gagné contre l'équipe " + EQUIPES[index1]);
            pointsEquipes[index2] += 3;
        } else {
            System.out.println("Match nul entre " + EQUIPES[index1] + " et " + EQUIPES[index2]);
            pointsEquipes[index1] += 1;
            pointsEquipes[index2] += 1;
        }
    }

    public static int rechercheMaxPoints() {
        int maxPts = -1;
        for (int i = 0; i < pointsEquipes.length; i++) {
            if (pointsEquipes[i] > maxPts) {
                maxPts = pointsEquipes[i];
            }
        }
        return maxPts;
    }

    public static int[] trouveGagnants() {
        int maxPts = rechercheMaxPoints();
        int conmpteurDesGagnants = 0;
        for (int i = 0; i < EQUIPES.length; i++) {
            if (maxPts == pointsEquipes[i]) {
                conmpteurDesGagnants++;
            }
        }
        int[] equipesGagnante = new int[conmpteurDesGagnants];
        for (int j = 0; j < pointsEquipes.length; j++) {
            for (int i = 0; i < equipesGagnante.length; i++) {
                if (pointsEquipes[j] == maxPts) {
                    equipesGagnante[i] = j;
                }
            }
        }
        return equipesGagnante;
    }

    public static int genererNombre(int min, int max) {
        int num = (int) (Math.random() * (max - min + 1)) + min;
        return num;
    }
}