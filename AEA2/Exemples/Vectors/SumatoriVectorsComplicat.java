package AEA2.Exemples.Vectors;
import java.util.Scanner;

public class SumatoriVectorsComplicat {

    public static void main(String[]args) {

        Scanner lector = new Scanner(System.in);

        int [] vec1 = {1,1,1,1,1,1,1,1,1,1};

        System.out.println("Quants numeros vols sumar del vector");
        int numEscollit = lector.nextInt();

        int resultat = 0;

        for ( int i = 0; i < numEscollit; i++) {

            resultat = resultat + vec1[i];

        }

        System.out.println(resultat);
    }


}
