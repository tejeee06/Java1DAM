package AEA1.Prova_If_Loops;
import java.util.Scanner;

public class Imprimir100 {

    public static void main(String[]args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Desde quin numero vols començar ? ");
        int numIntroduit = lector.nextInt();

        int iteraccio = numIntroduit + 100;

        while ( numIntroduit < iteraccio) {

            numIntroduit = numIntroduit + 1;

            if (numIntroduit %5 == 0) {

                System.out.println(numIntroduit +" Soc multiple de 5");

            } else {

                System.out.println(numIntroduit);

            }

            System.out.println("");
        }
    }
}