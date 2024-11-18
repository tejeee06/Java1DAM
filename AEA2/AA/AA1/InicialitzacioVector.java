package AEA2.AA.AA1;

public class InicialitzacioVector {

    public static void main(String[]args) {

        int[] numPars = new int[100];

        for (int i = 0; i < numPars.length; i++) {

            numPars[i] = i * 2;

        }

        for (int num : numPars) {

            System.out.println(+num +" ");

        }

    }

}
