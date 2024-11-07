package cours;

public class CodageEnRound {
    public final static double PI = 3.14;
    public static void main(String[] args) {
     int[] rayons = new int[10];
     for (int i = 0; i < rayons.length; i++) {
        rayons[i]= genereNombre(1, 10);
     }
    }
    public static int genereNombre(int min, int max){
        int random = (Math.random()*(int)(max-min+1))+min;
        return random;
    }
}
