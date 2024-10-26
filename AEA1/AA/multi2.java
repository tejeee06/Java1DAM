package AEA1.AA;
import java.util.Scanner;

public class multi2 {

    public static void main(String[]args) {

        Scanner mymulti2 = new Scanner(System.in);

        System.out.println("Introdueix el primer numero que vulgis multiplicar: ");
        double num1 = mymulti2.nextDouble();

        System.out.println("Introdueix el segon numero que vulgis multiplicar: ");
        double num2 = mymulti2.nextDouble();

        double resultat = num1 * num2;
        System.out.println("El resultat de la multiplicació es el seguent: " +resultat);

    }

}
