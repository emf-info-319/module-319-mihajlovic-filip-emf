

public class MihajlovicE00 {
    public final static int NOMBRE_DE_POINTS = 3;
    public final static int MAX = 10;
    public final static int MIN = 1;
    public static void main(String[] args) {
        String nomEquipe1 = "Barcelone" ;
        String nomEquipe2 = "Madrid";
        int nombrePointsEquipe1 = 0;
        int nombrePointsEquipe2 = 0;
        for (int i = 1; i<10; i++){
            int scoreEquipe1 = (int) (Math.random() * ( MAX - MIN + 1 )) + MIN;
            int scoreEquipe2 = (int) (Math.random() * ( MAX - MIN + 1 )) + MIN;
            System.out.println(nomEquipe1 + " joue contre " + nomEquipe2 + " et le résultat est : " + scoreEquipe1 + " à " + scoreEquipe2);
            if (scoreEquipe1>scoreEquipe2) {
                System.out.println(nomEquipe1 + " a gagné");
                nombrePointsEquipe1 = nombrePointsEquipe1 + NOMBRE_DE_POINTS;
            }
            if (scoreEquipe2>scoreEquipe1) {
                System.out.println(nomEquipe1 + " a gagné");
                nombrePointsEquipe2 = nombrePointsEquipe2 + NOMBRE_DE_POINTS;
            } if(scoreEquipe1==scoreEquipe2) {
                System.out.println("Match nul !");
                nombrePointsEquipe2++;
                nombrePointsEquipe1++;
            }
        }
        System.out.println(nomEquipe1 + " a " + nombrePointsEquipe1);
        System.out.println(nomEquipe2 + " a " + nombrePointsEquipe2);
        
    }
}
