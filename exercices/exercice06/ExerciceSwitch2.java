package exercices.exercice06;

public class ExerciceSwitch2 {
    public static void main(String[] args) {
        int age = 15;
        if (age==7) {
            System.out.println("Poussin");
        }
        else if ((age==8)&&(age==9)) {
            System.out.println("Pupille");
         }
         else if ((age==10)&(age==11)) {
            System.out.println("Minime");
         }
         else if (age>11) {
            System.out.println("Inconnu");
        }

        switch (age) {
            case 6:
                System.out.println("Poussin");
                break;
            case 7 & 8:
                System.out.println("Pupille");
                break;
            case 10 & 11 :
                System.out.println("Minime");
            default:
                System.out.println("Inconnu");
                break;
        }
    }
}
