package AEA2.AA.AA2;
import java.util.*;

public class Exercici2 {

    public static void main(String[]args) {

        Scanner lector = new Scanner(System.in);


        System.out.println("Quin es el numero de columnes que vols a la matriu ? ");
        int coloumnes = lector.nextInt();

        int[][] matrix = new int [5][coloumnes];
        Random aleatori = new Random();
        
        for(int i = 0; i < matrix.length; i++) {

            for(int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = aleatori.nextInt(11);
                System.out.print(matrix[i][j] + " ");

            }

            System.out.println();

        }

    }
    
}
