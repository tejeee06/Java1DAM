package AEA2.Exemples.Vectors;
import java.util.Scanner;

public class AritmeticaNotes {

    public static void main(String[]args) {

        Scanner lector = new Scanner(System.in);

        double[] notes = new double[4];

        for (int i = 0; i < notes.length; i++) {

            System.out.println("Quina es la " +(i+1) +" nota que vols introduir");
            notes[i] = lector.nextDouble();

        }

        System.out.println("S' han introduit totes les notes");

        double suma = 0;

        for (double nota : notes) {

            suma += nota;

        }

        double mitjana = suma / notes.length;
        System.out.println("La mitjana de les notes es de  " +mitjana);

    }

}
