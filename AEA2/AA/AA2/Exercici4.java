package AEA2.AA.AA2;
import java.util.*;

public class Exercici4 {

    public static void main(String[]args) {

        int [] vector = {43, 76, 9, 1, 66, 32, 76, 2};

        System.out.println("El vector inicial es : ");
        System.out.println("");

        for (int num : vector) {

            System.out.println(num);

        }

        Arrays.sort(vector);

        System.out.println("El vector endreçat es : ");
        System.out.println("");


        for (int num : vector) {

            System.out.println(num);

        }

        System.out.println();
        System.out.println("El segon element mes petit del vector es " +vector[1]);
    }
}
