package AEA2.AA.AA2;
import java.util.*;

public class Exercici2 {

    public static void main(String[]args) {

        Scanner lector = new Scanner(System.in);


        System.out.println("Quin es el numero de columnes que vols per a la teva matriu ??");
        int j = lector.nextInt();

        int [][] matriu = new int[5][j];

        Random numAleatori = new Random();

        for (int i = 0; i < matriu.length; i++ ) {

            for (int columa = 0; columa < matriu[i].length; columa++) {

                matriu[i][columa] = numAleatori.nextInt(11);
            }
        }

        for (int i = 0; i < matriu.length; i++) {

            for (int columna= 0; columna < matriu[i].length; columna++) {

                System.out.println(matriu[i][columna] +" ");
            }

            System.out.println();

        }
        
    }
}
