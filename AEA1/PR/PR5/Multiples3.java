package AEA1.PR.PR5;
import java.util.Scanner;

public class Multiples3 {

    public static void main(String[]args) {

        Scanner lectorNumero = new Scanner(System.in);

        System.out.println("Fins a quin valor vols sumar multiples de 3 ? ");
        int numeroIntro = lectorNumero.nextInt();

        int x = 0;
        int suma = 0;

        while (x <= numeroIntro) {

            if (x %3 ==0) {

                suma = suma + x;
                System.out.println("Afegim " +x +"...");
            }

            x = x + 1;
        }

        System.out.println("El resultat final es: " +suma);
    }

}
