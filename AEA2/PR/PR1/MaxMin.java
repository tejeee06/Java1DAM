package AEA2.PR.PR1;

public class MaxMin {

    public static void main(String[]args) {

        int [] vector = {12, 3, 45, -3, 65, -5, 88, 99, 2, 23, 54, 33, 27, 53, 96, 0};

        int numPetit = 0;
        int numGran = 0;

        for (int numero : vector) {

            if (numPetit > numero) {

                numPetit = numero;
            }

            if (numGran < numero) {

                numGran = numero;
            }

        }

        System.out.println("El numero mes petit es : " +numPetit +" , en canvi el numero mes gran es : " +numGran);
    }
}
