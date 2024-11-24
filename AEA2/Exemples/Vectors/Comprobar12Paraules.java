package AEA2.Exemples.Vectors;
import java.util.Scanner;

public class Comprobar12Paraules {

    public static void main(String[]args) {

        Scanner lector = new Scanner(System.in);

        char[] Paraules = new char[12];

        for (int i = 0; i < Paraules.length; i++) {

            System.out.println("Quin es el " +(i + 1) +" caracter que vols introduir ? ");
            Paraules[i] = lector.next().charAt(0);
        }

        for (char paraula : Paraules) {

            if (paraula == 'a' || paraula == 'A' || paraula == 'e' || paraula == 'E' || paraula == 'i' || paraula == 'I' || paraula == 'o' || paraula == 'O' || paraula == 'u' || paraula == 'U') {

                paraula = '$';

            } else if (paraula == '0' || paraula == '1' || paraula == '2' || paraula == '3' || paraula == '4' || paraula == '5' || paraula == '6' || paraula == '7' || paraula == '8' || paraula == '9') {

                paraula = '*';
                
            }

            System.out.println(paraula);

        }

    }

}
