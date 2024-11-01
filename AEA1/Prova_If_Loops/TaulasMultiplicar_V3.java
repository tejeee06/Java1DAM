package AEA1.Prova_If_Loops;
import java.util.Scanner;

public class TaulasMultiplicar_V3 {

    public static void main(String[]args) {

        Scanner lectorNum = new Scanner(System.in);

        System.out.println("Fins a quina taula vols multiplicar ? ");
        int numIntro = lectorNum.nextInt();

        for (int i = 0; i <= numIntro; i++) {

            if (i == 0) {

                i++;

            }

            System.out.println("La taula del " +i);

            for (int j = 1; j <= 10; j++) {

                int resultat = i * j;
                System.out.println(i +" x " +j +" = " +resultat);

            }

            System.out.println("----------");

        }
    }
}
