package exercices.exercice04;

public class EchangeValeurs {
    public static void main(String[] args) {
        int variable1 = 1;
        int variable2 =2;
        System.out.println("Le contenu de la variable1 est : " + variable1 + " et celui de la variable2 est : " + variable2);
        int after = variable1;
        after = variable1;
        variable1 = variable2;
        variable2 = after;
        System.out.println("Le contenu de la variable1 est : " + variable1 + " et celui de la variable2 est : " + variable2);
    }
}
