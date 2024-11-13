package cours;

public class CodageEnRound {
    public final static double PI = 3.14;
    public static void main(String[] args) {
     int[] rayons = new int[10];
     for (int i = 0; i < rayons.length; i++) {
        rayons[i]= genereNombre(1, 10);
     }
     for (int i = rayons.length-1; i >= 0; i--) {
        if (rayons[i]>50) {
           double aire = PI*rayons[i]*rayons[i];
            System.out.println(aire);
        }
        else{
           double périmètre = PI*2*rayons[i];
           System.out.println(périmètre);
        }
     }
    }
    public static int genereNombre(int min, int max){
        int random = (int) (Math.random() * ( max - min + 1 )) + min;
        return random;
    }
}
