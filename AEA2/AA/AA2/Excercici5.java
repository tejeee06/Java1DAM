package AEA2.AA.AA2;
import java.util.*;

public class Excercici5 {

    public static void main(String[]args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Quin es el numero de files que vols que tingui la teva Matriu ? ");
        int files = lector.nextInt();

        System.out.println("Quin es el numero de columnes que vols que tingui la teva Matriu ? ");
        int columnes = lector.nextInt();

        int valorMatriu = 0;
        int valorMinim = 0;
        int valorMaxim = 10;

        int[][] matrix = new int [files][columnes];
        int[] comptador = new int [valorMaxim + 1];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.println("Quin valor vols introduir a la posicio " +i +" " +j +" de la matriu");
                valorMatriu = lector.nextInt();

                //! Control de erros per controlar que l'usuari no introdueixi un valor mes gran que el valor maxim i tmabe que no introdueixi un valor mes petit que el nuemro minim
                if (valorMatriu > valorMaxim || valorMatriu < valorMinim) {

                    do {

                        System.out.println("El numero que has introduit es incorrecte, ha de ser un numero entre 0 i 10.");
                        valorMatriu = lector.nextInt();
    
                    } while (valorMatriu > valorMaxim || valorMatriu < valorMinim);
    
                }

                matrix[i][j] = valorMatriu;
                               
            }

            System.out.println();
            
            System.out.println("La fila " +i +" de la matriu esta plena");

        }

        System.out.println();
        System.out.println("La matriu que has introduit es la seguent : ");

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] +" ");

            }

            System.out.println();
            
        }

        // Fem el contador

        // For per comptar totes les aparicions d'un numero a la matrix
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                comptador[matrix[i][j]]++;
            }
        }

        System.out.println("Frequencia dels numeros introduits a la matriu: ");
        System.out.println();

        int numero = 0;

        for (int comptat : comptador) {

            if (comptat == 1) {

                System.out.println("El numero " +numero +" apareix " +comptat +" vegada a la matriu");

            }
            else if (comptat > 1) {

                System.out.println("El numero " +numero +" apareix " +comptat +" vegades a la matriu");

            }
            else {

                System.out.println("El numero " +numero +" no apareix a la matriu");

            }

            numero ++;
            System.out.println();
        }

    }
    
}
