package AEA2.Cotxes;
import java.util.Scanner;

public class Cotxes {

    public static void main(String[]args) {

        Scanner lector = new Scanner(System.in);

        String[] cotxes = new String [4];

        for (int i = 0; i < cotxes.length; i++) {

            System.out.println("Quin es el " +(i + 1) +" cotxe  que vols insertar al vector ? ");
            cotxes[i] = lector.nextLine();
        }

        System.out.println("Les dades del teu vector son : ");

        for (int i = 0; i < cotxes.length; i++) {

            System.out.println(cotxes[i]);

        }

    }

}
