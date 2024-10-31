import java.util.Scanner;

/**
 * BinaireEtHexadécimal
 */
public class BinaireEtHexadécimal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("entrez un nombre décimal : ");
        int decimal = scanner.nextInt();

        String decode = Integer.toBinaryString(decimal);
        String hexa = Integer.toHexString(decimal);

        System.out.println("binary : " + decode);
        System.out.println("Hexadécimal : " + hexa);

        scanner.close();
    }
}