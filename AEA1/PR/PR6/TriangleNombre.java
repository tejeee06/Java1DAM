package AEA1.PR.PR6;
import java.util.Scanner;

public class TriangleNombre {

    public static void main(String[]args) {

        Scanner lectorColumna = new Scanner(System.in);

        System.out.println("Numero de columnes: ");
        int columna = lectorColumna.nextInt();

        for (int i = 1; i <= columna; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j);
            }

            System.out.println("");
        }

    }

}