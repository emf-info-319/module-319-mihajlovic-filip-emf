public class Symphonie {
    public final static String[] NOTES = new String[] {"DO","RE","MI","FA","SOL","LA","SI"};
    public final static int NOMBRE_NOTES = 5;
    public final static int NOMBRE_PARTITION = 3;
    public static void main(String[] args) {    
    }

    public static int choisirUnNombre(int min, int max){
        int num = (int) (Math.random() * ( max - min + 1 )) + min;
        return num;
    }
    
    public static boolean estDièse(int num){
        boolean dièse = false;
        if (num == 1) {
            dièse = true;
        }
        return dièse;
    }

    public static String creerLaPartition(String[] notes){
        String partition ; 
        partition 
        return partition;
    }
}
