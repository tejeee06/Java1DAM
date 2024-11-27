package AEA1.PE;
import java.util.*;

public class PE1 {

    public static void main(String[]args) {

        Scanner lector = new Scanner(System.in);

        int preus = 5;
        double preuTotal = 0;
        int descompteMaxim = 15;
        int preuMaxim = 50;

        for (int i = 0; i < preus; i++ ) {

            System.out.println("Introdueix el " +(i + 1) +" preu que has pagat");
            double preuIntro = lector.nextDouble();

            if(preuIntro <= 0 ) {

               while ( preuIntro <= 0) {

                   System.out.println("Aquest preu no es valid , si us plau introdueix un altre preu");
                   preuIntro = lector.nextDouble();

               }

            }

            if (preuIntro > preuMaxim) {

                double descompte = preuIntro * 6 /100;

                if (descompte > descompteMaxim) {

                    preuIntro = preuIntro - descompteMaxim;

                } else {

                    preuIntro = preuIntro - descompte;

                }
            }

            System.out.println("Per el producte " +(i + 1) +" has pagat : " +(preuIntro) +"€");
            preuTotal = preuTotal + preuIntro;

        }

        System.out.println("En total has pagat " +preuTotal +"€");
    }
}
