package AEA1.AA.AA6;
import java.util.Scanner;
import java.util.Random;

public class Semafor {

    public static void main(String[]args) {

        Scanner lectorNumero = new Scanner(System.in);

        Random randNum = new Random();
        int numeroAleatori = randNum.nextInt(11);
        //System.out.println("El numero aleatori es: " +numeroAleatori);

        System.out.println("Comencem el joc.");
        System.out.println("Endivina el valor entre 0 i el 10 , tens 3 intents.");
        System.out.println("Quin valor creus que es ? ");
        int numeroIntroduit = lectorNumero.nextInt();

        int vides = 3;
        boolean guanyadorExist = false;

        while (vides > 0 && !guanyadorExist) {

            if (numeroIntroduit == numeroAleatori) {

                guanyadorExist = true;

            } else {

                vides = vides - 1;

                if (vides > 0) {

                    System.out.println("Has fallat ! , torna a intentar-ho , quin valor creus que es ? ");
                    numeroIntroduit = lectorNumero.nextInt();
                }
            }


        }

        if (guanyadorExist) {

            System.out.println("Felicitatsss!!!! , has encertat el numero.");

        } else {

            System.out.println("No has encertat el numero.");
        }



    }

}
