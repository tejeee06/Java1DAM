package AEA1.PR.PR5;
import java.util.Scanner;

public class TaulasMultipllicar {

    public static void main(String[]args) {

        Scanner lectorNumero = new Scanner(System.in);

        System.out.println("Quin numero vols multiplicar ? ");
        int numeroIntroduit = lectorNumero.nextInt();

        int i=0;
        int resultat= 0;

        while (i <= 10) {

            resultat = i * numeroIntroduit;
            System.out.println(+numeroIntroduit +" x " +i +" = " +resultat);
            i ++;

        }

        System.out.println("Aquesta ha sigut la taula del "+numeroIntroduit);

    }

}
