package AEA2.Exemples.Vectors;
import java.util.Scanner;

public class imprimirVector {

    public static void main(String[]args) {

        Scanner lector = new Scanner(System.in);

        String[] paraules = new String[4];

        for (int i = 0; i < paraules.length; i++) {

            System.out.println("Introdueix la parula n " +(i+ 1));
            paraules[i] = lector.nextLine();

        }

        System.out.println("Les dades del teu vector son : ");
        for (int i = 0; i < paraules.length; i++) {

            System.out.println(paraules[i]);
        }
    }
}
