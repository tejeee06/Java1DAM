package AEA2.AA.AA2;
import java.util.*;

public class Excercici3 {

    public static void main(String[]args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Quin es el numero de files que vols que tingui la primera matriu ? ");
        int files1 = lector.nextInt();

        System.out.println("Quin es el numero de columnes que vols que tingui la primera matriu ? ");
        int columnes1 = lector.nextInt();

        System.out.println("Quin es el numero de files que vols que tingui la segona matriu ? ");
        int files2 = lector.nextInt();

        System.out.println("Quin es el numero de columnes que vols que tingui la segona matriu ? ");
        int columnes2 = lector.nextInt();

        // Control de errors
        if (files1 != files2 || columnes1 != columnes2) {

            System.out.println("error , les dimensions de les matrius no coincideixen , per poder realitzar la suma han de ser iguals !!");
            return; //! Utilitzem return per aturar el codi en el cas de que s'introdueixin les dades correctament

        }

        int [][] matrix1 = new int [files1][columnes1];
        int [][] matrix2 = new int [files2][columnes2];
        int [][] matrix3 = new int [files1][columnes1]; // Amb el nostre control de errors Files 1 y Files2 haurien de tenir la mateixa longitud , igual que amb les columnes

        System.out.println();

        System.out.println("Introdueix les dades de la primera matriu");
        for (int i = 0; i < matrix1.length; i++) {

            for (int j = 0; j < matrix1[i].length; j++) {

                System.out.println("Quin valor vols introduir a la posicio " +i +" " +j +" de la primera matriu ? ");
                matrix1[i][j] = lector.nextInt();
            }

            System.out.println();

            System.out.println("La fila " +i +" de la primera  matriu ya esta plena ");
        }

        System.out.println();
        
        System.out.println("Introdueix les dades de la segona matriu");

        for (int i = 0; i < matrix2.length; i++) {

            for (int j = 0; j < matrix2[i].length; j++) {

                System.out.println("Quin valor vols introduir a la posicio " +i +" " +j +" de la segona matriu ?");
                matrix2[i][j] = lector.nextInt();

            }

            System.out.println();

            System.out.println("La fila " +i +" de la segona matriu ya esta plena");

        }

        // Suma de les matrius
        for (int i = 0; i < matrix1.length; i++) {

            for (int j = 0; j < matrix1[i].length; j++) {

                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];

            }

        }

        System.out.println();

        System.out.println("La primera matriu que has introduit es la seguent : ");
        for (int i = 0; i < matrix1.length; i++) {

            for (int j = 0; j < matrix1[i].length; j++) {

                System.out.print(matrix1[i][j] + " ");

            }

            System.out.println();

        }

        System.out.println();

        System.out.println("La segona matriu que has introduit es la seguent : ");
        for (int i = 0; i < matrix2.length; i++) {

            for (int j = 0; j < matrix2[i].length; j++) {

                System.out.print(matrix2[i][j] + " ");

            }

            System.out.println();

        }

        System.out.println();

        System.out.println("La suma de les dos matrius es la seguent : ");

        for (int i = 0; i < matrix3.length; i++) {

            for (int j = 0; j < matrix3[i].length; j++) {

                System.out.print(matrix3[i][j] +" ");
            }

            System.out.println();

        }

    }
    
}