package AEA2.PR.PR1;
import java.util.*;

public class MaxMinSort {

    public static void main(String[]args) {

        int[] vector = {12, 3, 45, -3, 65, -5, 88, 99, 2, 23, 54, 33, 27, 53, 96, 0};
        Arrays.sort(vector);

        int numeroPetit = vector[0];
        int numeroGran = vector[15];

        System.out.println("Imprimint el vector en ordre");
        for (int num : vector) {

            System.out.println(num);

        }

        System.out.println("");

        System.out.println("El numero mes petit es " +numeroPetit +" en canvi el numero mes gran es " +numeroGran);

    }
}
