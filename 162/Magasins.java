public class Magasins {
    public static int ANNEE = 2024;
    public static int NB_MAGASINS_DE_BASE = 152012;
    public static void main(String[] args) {
        int nbmagasins = NB_MAGASINS_DE_BASE;
        int anneeDepart = 2000;
        while(anneeDepart> ANNEE) {
           nbmagasins = nbmagasins + nbmagasins/10;
           anneeDepart++; 
        }
        nbmagasins = nbmagasins - 10000;
        System.out.println(nbmagasins);

    }
}
