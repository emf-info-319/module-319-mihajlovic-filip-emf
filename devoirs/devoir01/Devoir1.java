package devoirs.devoir01;

public class Devoir1 {
    public static void main(String[] args) {
        int monAge = 30;
        boolean estMajeur;

        System.out.println("Je m'appelle MIHAJLOVIC Filip");
        System.out.println("Mon age est de : " + monAge + " ans");

        if (monAge>=20) {
            estMajeur = true;
        }
        else {
            estMajeur=false;
        }
        if (estMajeur==true) {
            System.out.println("Je suis majeur");
        }
        else {
            System.out.println("Je suis Mineur");
        }
    }
    
}
