package AEA1.AA.AA4;
import java.util.Scanner;

public class multi3 {

    public static void main(String[]args) {
        Scanner myMulti = new Scanner(System.in);

        System.out.println("Introdueix el primer numero que vulgis multiplicar: ");
        double num1 = myMulti.nextDouble();

        System.out.println("Introdueix el segon numero que vulgis multiplicar: ");
        double num2 = myMulti.nextDouble();

        System.out.println("Introdueix el tercer numero que vulgis multiplicar: ");
        double num3 = myMulti.nextDouble();

        double resultat = num1 * num2 * num3;
        System.out.println("El resultat de la teva multiplicacio es: " +resultat);
    }

}
