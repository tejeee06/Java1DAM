package AEA2.Exemples.Vectors;

public class SumatoriVector {

    public static void main(String[]args) {

        int [] vec1 = {10,20,30,40,50};
        int resultat = 0;

        for (int i = 0; i < vec1.length; i++) {

            resultat = resultat + vec1[i];

        }

        System.out.println(resultat);

    }

}
